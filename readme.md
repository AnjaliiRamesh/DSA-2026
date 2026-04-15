# 📘 Java Basics – Day 1 Notes
🧮 Simple Calculator (Input Handling)
Operator cannot be stored in int because it is a character
To take a character input:
char op = sc.next().charAt(0);

🔹 Scanner Methods
1. next()
Reads only one word (stops at space)
Ignores leading spaces
String name = sc.next();

2. nextInt()
Reads an integer value
❗ Does NOT consume the newline (\n)
int age = sc.nextInt();

3. nextLine()
Reads the entire line (including spaces)
Stops at newline (Enter)
String fullName = sc.nextLine();

🔁 While Loop
int i;
while(i <= 10)


❌ Problem:

i is declared but not initialized

👉 In Java:

Local variables do NOT get default values
Leads to compile-time error:
"variable i might not have been initialized"

✅ Fix
int i = 1;
while(i <= 10)

💡 Insight

If Java allowed uninitialized variables, it could cause:

Infinite loops
Skipped execution
Unpredictable crashes

👉 That’s why Java stops it at compile time.

⚙️ Java Execution Flow
Step 1: Write Code
        ↓
   PrintNums.java

Step 2: Compile (javac)
        ↓
   PrintNums.class (bytecode)

Step 3: Run (java)
        ↓
   JVM executes

Step 4: Output
        ↓
   Console result

🔹 Example Code
public class PrintNums {
    public static void main(String[] args) {
        System.out.println("Hello");
    }
}

🔹 Compilation
javac PrintNums.java


👉 Converts:

Human-readable code → Bytecode (.class)
🔹 Execution
java PrintNums

🔄 Inside JVM
.class file
   ↓
Class Loader
   ↓
Bytecode Verifier
   ↓
Interpreter / JIT Compiler
   ↓
Machine Code
   ↓
Output

🌍 Platform Independence
.class (bytecode) → same everywhere
JVM → different for each OS

👉 Write Once, Run Anywhere

🎯 Memory Trick
javac → compile
java  → run

⚡ Interpreter vs JIT
🔸 Interpreter
Executes bytecode line by line
Bytecode → Machine Code → Output

✅ Pros:
Fast startup
Simple
❌ Cons:
Slow for repeated code
🔸 JIT (Just-In-Time Compiler)
Compiles frequently used (hot) code
Converts it into native machine code
Bytecode → JIT → Native Code → Fast execution

✅ Pros:
High performance
Optimized execution
❌ Cons:
Initial delay
⚖️ Difference
Feature	Interpreter	JIT
Execution	Line-by-line	Compiles blocks
Speed	Slower	Faster
Startup	Fast	Slight delay
Optimization	No	Yes
🔥 How JVM Uses Both
1. Interpreter starts execution
2. JVM tracks frequently used code
3. Marks it as "Hot Code"
4. JIT compiles it
5. Execution becomes faster

🔥 Hot Code
Definition:
Code that runs frequently
Example: loops, repeated methods
How JVM Detects It
Uses execution counters
method calls ↑
loop runs ↑

If threshold is crossed:
👉 Marked as Hot Code

👉 JIT compiles it for faster execution

🎯 One-line

Hot code is frequently executed code that JVM optimizes using JIT.

📥 Scanner Input Examples
Scanner sc = new Scanner(System.in);

int a = sc.nextInt();          // integer
double b = sc.nextDouble();    // decimal
String word = sc.next();       // single word
String line = sc.nextLine();   // full line
char ch = sc.next().charAt(0); // character

🔢 Digit Extraction Logic
🧠 Key Concepts
% 10 → extract last digit
/ 10 → remove last digit
🔄 Example Flow
n = 456

456 % 10 = 6
456 / 10 = 45

45 % 10 = 5
45 / 10 = 4

4 % 10 = 4
4 / 10 = 0
