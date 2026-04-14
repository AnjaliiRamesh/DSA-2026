
# Simple Calculator

operand cannot be stored in int since it is a char and to access character ww write
op = sc.next().charAt(0);
🔹 1. next()
Reads only one word (stops at space)
Ignores leading spaces
String name = sc.next();
🔹 2. nextInt()
Reads an integer value
Does not consume the newline (\n) after the number
int age = sc.nextInt();
🔹 3. nextLine()
Reads the entire line (including spaces)
Stops only when it finds a newline (Enter)
String fullName = sc.nextLine();

# Prime Number

What is a Prime Number 

A number is prime if:
It is greater than 1
It has only 2 factors → 1 and itself

👉 So you must check:
Does any number between 2 and n-1 divide n?