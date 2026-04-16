1️⃣ Declaration vs Initialization

✅ Declaration
👉 Creating a variable (reserving memory, name exists)
let age;

✅ Initialization
👉 Assigning a value to that variable
age = 21;


2️⃣ What is Temporal Dead Zone (TDZ) & why it exists?
🔴 Definition

👉 TDZ = time between variable hoisting and its declaration line where it cannot be accessed

🧨 Example
console.log(a); // ❌ ReferenceError
let a = 10;

🤔 Why does TDZ exist?

👉 To prevent bugs and enforce clean code

Without TDZ (like var):

console.log(a); // undefined (silent bug)
var a = 10;


👉 Problem:

You might think a has a value
But it’s actually undefined → hard-to-debug issues
✅ TDZ forces:
Declare before use
Avoid accidental bugs
More predictable behavior

3️⃣ What is ReferenceError?
🔴 Definition

👉 Happens when you try to access a variable that doesn’t exist or is not accessible

✅ Examples
Case 1: Variable not defined
console.log(x); // ❌ ReferenceError: x is not defined

Case 2: TDZ violation
console.log(a); // ❌ ReferenceError
let a = 5;

⚡ Simple rule

👉 ReferenceError = JS cannot find or access the variable




age = 25;  // initialization

let age;   // declaration


🔴 Your Code:
age = 100;
console.log("value of age ", age);

let age = 30;
console.log("value of age is ", age);

❗ What really happens (important concept: Temporal Dead Zone)

In JavaScript, variables declared with let are hoisted but not initialized.

So internally, JS sees something like this:

// hoisted but NOT initialized
let age;

age = 100; ❌ ERROR happens here

💥 Why error occurs?

Because of something called Temporal Dead Zone (TDZ):

From the start of the block until the line where let age = 30 is declared
The variable age exists but cannot be accessed

👉 So this line:

age = 100;


tries to use age before declaration, which is illegal with let

🧨 Error you’ll get:
ReferenceError: Cannot access 'age' before initialization

✅ Correct version (fix)

Move declaration before usage:

let age = 30;
console.log("value of age is ", age);

age = 100;
console.log("value of age ", age);

⚡ Key Takeaways (interview level)
let and const are hoisted but stay in TDZ
You cannot use them before declaration
var behaves differently (it allows access but gives undefined)
🔁 If you used var instead:
age = 100;
console.log(age);

var age = 30;
console.log(age);


Output:

100
30


👉 Because var is hoisted and initialized with undefined



🔴 Code
for (var i = 0; i < 3; i++) {
    setTimeout(() => console.log(i), 0);
}

🧠 Step 1: Before loop starts
var i = 0;
👉 Only one single variable i exists (function/global scope)

🧠 Step 2: Loop execution
Iteration 1:
i = 0
setTimeout(() => console.log(i), 0) → callback stored
i++ → 1
Iteration 2:
i = 1
callback stored
i++ → 2
Iteration 3:
i = 2
callback stored
i++ → 3
Loop ends:
i = 3

👉 IMPORTANT: No callback has executed yet

⏱️ Step 3: Event Loop

All setTimeout callbacks go to callback queue
They run after the loop finishes

🧠 Step 4: Callback execution
Now each callback runs:
() => console.log(i)

👉 But what is i now?
i = 3
👉 And all callbacks reference the same i

✅ Final Output
3
3
3

🔥 Key Insight
👉 The function doesn’t store value of i
👉 It stores reference to i
👉 Because var is function-scoped, all callbacks share the same variable i, which becomes 3 before execution