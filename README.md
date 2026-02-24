
🧮 Expression Evaluator Using Stack (Java)

A Java implementation of a mathematical expression evaluator using the Stack Data Structure.
The program converts an infix expression → postfix expression and then evaluates the result while correctly handling operator precedence and parentheses.

📌 Features

Supports operators: + - * /

Handles parentheses ( )

Correct operator precedence & associativity

Infix ➜ Postfix conversion

Postfix expression evaluation

Linear time complexity O(N)

📖 How It Works

The evaluation is done in two steps:

1️⃣ Infix to Postfix Conversion

Computers cannot directly evaluate infix expressions efficiently.
So the expression is converted into postfix notation using a stack.

Example:

Input (Infix)  : 2+3*(4-1)
Postfix        : 2341-*+
2️⃣ Postfix Evaluation

The postfix expression is then evaluated using another stack.

Steps:

Push operands into stack

When operator appears → pop two values

Perform operation

Push result back

Final value in stack = Answer

Output:

Result = 11
🏗️ Data Structure Used

Stack (LIFO – Last In First Out)

Operations used:

push()

pop()

peek()

isEmpty()

Why stack?

Handles operator precedence

Manages nested parentheses

Ensures correct evaluation order

🧠 Algorithm
Infix ➜ Postfix

Scan expression left to right

If operand → add to output

If operator → pop higher precedence operators from stack

If '(' → push to stack

If ')' → pop until '('

Pop remaining operators

Postfix Evaluation

Scan postfix expression

Push operands

On operator → pop 2 operands & calculate

Push result

Final stack value = answer

⏱️ Complexity
Type	Complexity
Time Complexity	O(N)
Space Complexity	O(N)
🚀 Applications

Calculator software

Compiler design

Expression parsing

Mathematical engines

Programming language interpreters

⚠️ Limitations

Supports only single digit numbers

No floating point support

No advanced functions (sin, log, power)

🛠️ Technologies Used

Language: Java

Library: java.util.Stack

IDE: VS Code / Online Compiler

▶️ Sample Run
Enter expression: 2+3*(4-1)

Postfix Expression: 2341-*+
Result: 11
👨‍💻 Authors

Akshaya Kumar Sahoo

Prince Kumar Jha
