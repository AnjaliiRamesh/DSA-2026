
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


# While Loop
int i;
while(i <= 10)
You declared i but never initialized it.

In Java, local variables are not given default values, so i contains garbage data → this leads to a compile-time error:

❌ "variable i might not have been initialized"

✅ Fix:
Initialize i before using it:
int i = 1;
while(i <= 10)

💡 Extra Insight:
If Java allowed this, your loop could:
Run infinitely
Skip execution
Crash unpredictably
So Java prevents it at compile time itself.

Step 1: Write Code
        ↓
   PrintNums.java   (your code)

Step 2: Compile (javac)
        ↓
   PrintNums.class  (bytecode)

Step 3: JVM Execution (java)
        ↓
   JVM loads + verifies + executes

Step 4: Output
        ↓
   Printed result on console


🔹 1. You write code
public class PrintNums {
    public static void main(String[] args) {
        System.out.println("Hello");
    }
}

🔹 2. Compilation (javac)
javac PrintNums.java

👉 Converts:
Human-readable code → Bytecode (.class) machine readable code

🔹 3. JVM runs (java)
java PrintNums

Inside JVM:
.class file
   ↓
Class Loader  (loads file)
   ↓
Bytecode Verifier (checks safety)
   ↓
Interpreter / JIT Compiler
   ↓
Machine Code (executed)

⚡ Full Flow (Detailed)
PrintNums.java
      ↓  (javac)
PrintNums.class (bytecode)
      ↓  (java)
JVM
 ├── Class Loader
 ├── Bytecode Verifier
 ├── Interpreter / JIT
      ↓
Output on Console

💡 Why Java is platform independent
.class (bytecode) is same everywhere
JVM is different for each OS

👉 So:

Write once → Run anywhere

🎯 One-line memory trick

javac → converts code
java → runs code using JVM


🔹 Interpreter vs JIT (in JVM)
🔸 1. Interpreter

👉 Works like this:

Reads bytecode line by line
Converts it to machine code
Executes immediately
Bytecode → (line by line) → Machine code → Output

✅ Pros:
Fast to start (no waiting)
Simple execution
❌ Cons:
Slow for large programs (repeats conversion again & again)
🔸 2. JIT (Just-In-Time Compiler)

👉 Works like this:

Detects frequently used code (hot code)
Compiles that part into native machine code once
Reuses it
Bytecode → JIT → Native Machine Code (stored) → Fast execution

✅ Pros:
Very fast execution
Optimizes performance
❌ Cons:
Takes time initially (compilation overhead)
⚡ Key Difference
Feature	Interpreter	JIT Compiler
Execution	Line by line	Compiles chunks
Speed	Slower	Faster
Startup	Fast	Slight delay
Optimization	No	Yes
🔥 How JVM Uses BOTH (important!)

Java doesn’t choose one — it uses both together:

Step 1: Interpreter starts execution (quick start)
Step 2: JVM detects repeated code
Step 3: JIT compiles that code
Step 4: Execution becomes faster


👉 This is why Java is:

Fast (because of JIT)
Flexible (because of Interpreter)
🧠 Real-life analogy
Interpreter = reading and translating a book line-by-line every time 📖
JIT = translating the whole chapter once and reusing it ⚡
🎯 One-line answer (for interviews)

Interpreter executes bytecode line-by-line, while JIT compiles frequently used bytecode into native machine code to improve performance.

🔥 What is “Hot Code” (short & clear)

Hot code = code that runs again and again
👉 Example: loops, frequently called methods

⚙️ How JVM decides it

JVM keeps a counter for methods/loops:

method call count ↑
loop execution count ↑

If a piece of code crosses a certain threshold
JVM marks it as “hot”

👉 Then JIT compiles it into native machine code for faster execution

🧠 Super simple flow
Code runs → JVM tracks usage → crosses limit → marked HOT → JIT compiles → faster

🎯 One-line answer

Hot code is frequently executed code, and JVM detects it using execution counters and compiles it with JIT for better performance.

Scanner sc = new Scanner(System.in);

int a = sc.nextInt();        // integer
double b = sc.nextDouble();  // decimal
String word = sc.next();     // single word
String line = sc.nextLine(); // full line
char ch = sc.next().charAt(0); // single character


🧠 Key Concepts 
% 10 → extract last digit 
/ 10 → remove last digit 

