import java.util.*;

public class ExpressionEvaluator {

    static int precedence(char c) {
        if (c == '+' || c == '-') return 1;
        if (c == '*' || c == '/') return 2;
        return 0;
    }

    static String infixToPostfix(String exp) {
        Stack<Character> stack = new Stack<>();
        String result = "";

        for (char c : exp.toCharArray()) {

            if (Character.isDigit(c))
                result += c;

            else if (c == '(')
                stack.push(c);

            else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(')
                    result += stack.pop();
                stack.pop();
            }

            else {
                while (!stack.isEmpty() && precedence(stack.peek()) >= precedence(c))
                    result += stack.pop();
                stack.push(c);
            }
        }

        while (!stack.isEmpty())
            result += stack.pop();

        return result;
    }

    static int evaluatePostfix(String exp) {
        Stack<Integer> stack = new Stack<>();

        for (char c : exp.toCharArray()) {

            if (Character.isDigit(c))
                stack.push(c - '0');

            else {
                int b = stack.pop();
                int a = stack.pop();

                switch (c) {
                    case '+': stack.push(a + b); break;
                    case '-': stack.push(a - b); break;
                    case '*': stack.push(a * b); break;
                    case '/': stack.push(a / b); break;
                }
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Expression: ");
        String infix = sc.nextLine();

        String postfix = infixToPostfix(infix);
        int result = evaluatePostfix(postfix);

        System.out.println("Postfix: " + postfix);
        System.out.println("Result: " + result);
    }
}
