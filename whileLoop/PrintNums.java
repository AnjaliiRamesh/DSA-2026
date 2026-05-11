//  1.Print all numbers from 1 to 10 using a loop
//  2.Print numbers from 10 down to 1 in reverse order.

import java.util.Scanner;

public class PrintNums {
    public static void main(String[] args) {
        /*
         * int i = 1;
         * while(i <=10){
         * System.out.print(i + " ");
         * i++;
         * 
         * }
         */

        /*
         * Question 2
         * int i = 10;
         * while(i>=1){
         * System.out.print(i + " ");
         * i--;
         * }
         * System.out.println("loop done");
         * 
         */

        /*
         * Print all even numbers between 1 and 100
         * 
         * int i =1;
         * while(i <=100){
         * if(i % 2 == 0){
         * System.out.print(i + " ");
         * }
         * i++;
         * 
         * }
         * 
         * // optimised version
         * int i = 2;
         * while(i <= 100){
         * System.out.print(i + " ");
         * i += 2;
         * }
         */


        /*Print all odd numbers between 1 and 100 
         int i = 1;
         while(i <= 100){
         System.out.print(i + " ");
         i += 2;
         }
         */

         /* 5. Print the multiplication table of a given number from n × 1 to n × 10. 
         System.out.print("Enter the value of n: "); 
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int i=1;
         while (i <=10){
            System.out.println(n+ "*" + i + "=" + (i*n));
            i++;
         }
         */

        /*6. Calculate and print the sum of the first n natural numbers. 

        System.out.print("Enter the value of n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int i =1;
        int sum =0;
        while(i <=n){
            sum = sum +i;
            i++;
        }
        System.out.println(sum);
        */

        /*7.Calculate the sum of all even numbers from 1 up to n 

        System.out.print("Enter the value of n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int i =2;
        int EvenSum =0;
        while(i <=n){
            EvenSum = EvenSum +i;
            i= i+2;
        }
        System.out.println(EvenSum);
        */

        /*8.Calculate the sum of all odd numbers from 1 up to n. 

        System.out.print("Enter the value of n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int i =1;
        int OddSum =0;
        while(i <=n){
            OddSum = OddSum +i;
            i= i+2;
        }
        System.out.println(OddSum);
        */
       /*9. Calculate and print the factorial of a given number 

        System.out.print("Enter the value of n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

       
        int i=1;
        int ans = 1;
        while(i<=n){
           ans = ans*i;
           i++;
        }
        System.out.println(ans);
        */
/*10. Find and print the product of all digits of a given number 

        int n = 456;
        int ld =1;
        int res = 1;
        while(n!=0){
            ld = n%10;
            res = res*ld;
            n = n/10;
        }
        System.out.println(res);
*/

        /* 11. Count and print the total number of digits in a given number

        int n = 45665436;
        int i =1;
        int count =0;
        while(n!=0){
            int ld = n % 10;
            count++;
            n = n/10;
        }
        System.out.println(count);
        */
         
/*12. Reverse the given number and print the reversed value. 

 int n = 456;
        int rev = 0;

        while (n != 0) {
            int ld = n % 10;
            rev = rev * 10 + ld;
            n = n / 10;
        }

        System.out.println(rev);

        */

        /* 13.Check whether the given number is a palindrome 

        int n = 121;
        int original = n;
        int reverse = 0;

        while (n != 0) {
            int ld = n % 10;
            reverse = reverse * 10 + ld;
            n = n / 10;
        }

        if (original == reverse) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
        */
       /*14. Find and print the sum of digits of the given number.

       int n = 2345;
       int sum =0;
       while(n!=0){
        int ld = n%10;
        sum  = sum + ld;
        n = n/10;
       }
       System.out.println(sum);

        */

       /*15.Check whether the given number is an Armstrong number
       🧠 Simple idea

Take a number →

Count how many digits it has
Take each digit
Raise it to that count
Add all the results
If the final sum equals the original number → Armstrong number

    
        int n = 143;
        int original = n;

        // Step 1: Count digits
        int count = 0;
        int temp = n;
        while (temp != 0) {
            count++;
            temp /= 10;
        }

        // Step 2: Calculate sum of powers
        int sum = 0;
        temp = n;
        while (temp != 0) {
            int ld = temp % 10;
            sum += (int) Math.pow(ld, count);
            temp /= 10;
        }

        // Step 3: Check
        if (sum == original) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not an Armstrong Number");
        }
    
    */

        /*16. Check whether the given number is a Perfect number 

        int n = 15; 
        int i = 1;

        int sum = 0;
        while(i<n){
            if(n % i ==0){
                sum += i;
            
            }
            i++;
        }
        if(sum == n){
            System.out.println("perfect number");
        }else{
            System.out.println("not perfect");
        }

        Optimised version
         if (n <= 1) return false;

        int sum = 1; // 1 is always a divisor

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                sum += i;

                if (i != n / i) {
                    sum += n / i;
                }
            }
        }

        return sum == n;
    }

        */

    /*17. Print all prime numbers between 1 and 100 */

    /*18. Check whether the given number is a prime number. 
int n = 15;
boolean isPrime = true;
if(n ==0 || n==1){
    System.out.println("not prime");
    return;
}
    for(int i = 2; i*i<=n; i++){
        if(n%i==0){
            isPrime = false;
            break;
        }
    }
   if(isPrime){
    System.out.println("prime");
   }
   else{
    System.out.println("not prime");
   }


for (int n = 2; n <= 20; n++) {

    int i;
    for (i = 2; i * i <= n; i++) {
        if (n % i == 0) break;
    }

    if (i * i > n) {
        System.out.print(n + " ");
    }
}
*/


/* Armstring revisiting 
int num = 143;
int original = num;


int count = 0;
int temp = num;

while( temp != 0){
    count ++;
    temp = temp/10;
}
int sum = 0;
temp = num;
while(temp !=0){
    int ld = temp % 10;
sum += (int)Math.pow(ld, count);
temp = temp /10;
}

   if(original == sum){
    System.out.println("armstrong");
   }
   else{
    System.out.println(
       "not armstrong" 
    );
   }

   */
  /* revisiting perfect number 

  int n = 28;
  int sum =1;
//   int i=2;//1 is always divisor
  for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                sum += i;

                if (i != n / i) {
                    sum += n / i;
                }
            }
        }  
  
  if(n == sum){
    System.out.println("perfect");
  }else{
    System.out.println("not perfect");
  }
*/

/*Revisiting reverse number 

int n = 143;
int org = n;
int rev = 0;
while(n!=0){
    int ld = n % 10;
    rev = (rev *10) + ld;
    n = n/10;
}
System.out.println(org);
System.out.println(rev);

*/
/*check prime or not revisiting

 

int n = 19;
int i = 2;
int flag = 0;
while(i<n){
    if(n % i == 0){
        flag = 1;
        break;
    }
    i++;
}
if(flag == 0){
System.out.println("prime");
}
else{
    System.out.println("not prime");
}
*/
/*Priniting prime revisiting 
int n = 20;
int i = 2;

while(i!=n){
    if(n%i != 0){
        System.out.println(i);
    }
    i++;
}

*/
/*19. Print the Fibonacci series up to n terms.
The Fibonacci series is a series of elements where the previous two elements are added to generate the next term. It starts with 0 and 1, for example, 0, 1, 1, 2, 3, and so on. 
*/


/*1. Print all numbers from 1 to 10 using a loop 
int i =1;
while(i <= 10){
    System.out.println(i);
    i++;
}
*/

/*2. Print numbers from 10 down to 1 in reverse order 
int i = 10;
while(i >=1){
    System.out.println(i);
    i--;
}
*/
/*3. Print all even numbers between 1 and 100 
int i =2;
while (i<=20){
    if(i%2==0){
        System.out.println(i);
    }
    i=i+2;
}
*/
/*4. Print all odd numbers between 1 and 100. 
int i =1;
while (i<=20){
    if(i%2!=0){
        System.out.println(i);
    }
    i++;
}
*/

/*5. Print the multiplication table of a given number from n × 1 to n × 10 
int n = 22;
int i = 1;
while( i<=10){
    System.out.println(n*i);
    i++;
}
*/
/*6. Calculate and print the sum of the first n natural numbers 
int sum = 0;
int n = 10;
int i=1;
while(i<=n){
sum = sum + i;
i++;
}
System.out.println(sum);

*/
/*7. Calculate the sum of all even numbers from 1 up to n. 
int sum = 0;
int n = 5;
int i=2;
while(i<=n){
    if(i%2==0){
    sum = sum + i;
    }
i++;
}
System.out.println(sum);
*/

/* 8. Calculate the sum of all odd numbers from 1 up to n

int sum = 0;
int n = 10;
int i=1;
while(i<=n){
    if(i%2!=0){
    sum = sum + i;
    }
i++;
}
System.out.println(sum);
*/
/*9. Calculate and print the factorial of a given number 
int fact = 1;
int n = 6;
int i = 1;
while(i<=n){
    fact = fact*i;
    i++;
}
System.out.println(fact);
*/

/*10. Find and print the product of all digits of a given number 
int prod = 1;
int n = 153;
while(n !=0){
    int ld = n%10;
    prod = prod *ld;
    n = n/10;

}
System.out.println(prod);

*/
/*11. Count and print the total number of digits in a given number 
int count = 0;
int n = 157653;
while(n !=0){
    int ld = n%10;
    count++;
    n = n/10;

}
System.out.println(count);

*/
/*12. Reverse the given number and print the reversed value. 

int rev = 0;
int n = 153;
while(n !=0){
    int ld = n%10;
    rev = (rev *10) + ld;
    n = n/10;

}
System.out.println(rev);
*/
/*14. Find and print the sum of digits of the given number 

int sum = 0;
int n = 153;
while(n !=0){
    int ld = n%10;
    sum = sum + ld;
    n = n/10;

}
System.out.println(sum);

*/

/* e.
13. Check whether the given number is a palindrome 

int original = 1113;
int dup = original;
int rev = 0;
while(dup !=0){
    int ld = dup%10;
    rev = rev*10 + ld;
    dup = dup/10;
    
}
if(rev == original){
    System.out.println("palindrome");
}
else{
    System.out.println("Not palindrome");
}
*/

/*15. Check whether the given number is an Armstrong number 


An Armstrong number is a number where:
Sum of each digit raised to the power of total number of digits = original number


int org  =123;
int dup = org;
int count=0;
while (dup!=0){
    count++;
    dup = dup/10;
} 
int n = org;
int ans = 0;
while(n!=0){
    int ld = n %10;
    ans += (int)Math.pow(ld, count);
    n = n/10;
}
if(ans == org){
    System.out.println("armstrong");
}
else{
    System.out.println("not armstrong");
}
*/
/*16. Check whether the given number is a Perfect number. 
A Perfect Number is a number where:
Sum of all factors (excluding the number itself) = original number

int n = 28;
int i = 1;
int sum =0;
while(i<n){
    if(n%i == 0){
        sum = sum + i;
    }
    i++;
}
if (sum == n) {
    System.out.println("perfect number");
}
else{
    System.out.println("not perfect");
}


//Optimised version
int n = 28;
int sum = 1; // 1 is always a factor

for(int i = 2; i * i <= n; i++){

    if(n % i == 0){

        sum = sum + i;

        // add paired factor
        if(i != n / i){
            sum = sum + (n / i);
        }
    }
}
// check n!=1 bcoz if n == 1 it will give one but perfect number say the number itself must be excluded as one is not a perfect number

if(sum == n && n != 1){
    System.out.println("perfect number");
}
else{
    System.out.println("not perfect");
}

*/

/*
18. Check whether the given number is a prime number.

int n = 21;
int i = 2;
boolean flag = false;
while(i<n){
    if(n%i == 0){
       flag = true;
       break;
    }
    i++;
}
if(flag){
    System.out.println("Not prime");
}
else{
    System.out.println("prime");
}
*/

/*17. Print all prime numbers between 1 and 100  
for(int n = 2; n <= 100; n++){

    boolean isPrime = true;

    for(int i = 2; i * i <= n; i++){

        if(n % i == 0){
            isPrime = false;
            break;
        }
    }

    if(isPrime){
        System.out.print(n + " ");
    }
}


int n = 51;
boolean flag = false;
int i =2;
while(i<n){
    if(n%i == 0){
        flag = true;
    }
    i++;
}
if(flag){
    System.out.println("not prime");
}
else{
    System.out.println("prime number");
}

*/


/*19. Print the Fibonacci series up to n terms 

int n = 10;

int f = 0;
int s = 1;
System.out.print(f + " " + s + " ");
for(int i =1; i<=n; i++){
    int t = f+s;
    System.out.print(t + " ");
    f = s;
    s = t;
}

*/
/*20. Find and print the sum of the Fibonacci series up to n terms 
int n = 10;

int f = 0;
int s = 1;
int fibSum = f + s;
for(int i =1; i<=n-2; i++){
    int t = f+s;
    fibSum += t;
    f = s;
    s = t;
}
System.out.println(fibSum);


//edge case
int n = 10;

int f = 0;
int s = 1;

if(n == 1){
    System.out.println(f);
}
else if(n == 2){
    System.out.println(f + s);
}
else{
    int fibSum = f + s;

    for(int i = 1; i <= n - 2; i++){
        int t = f + s;
        fibSum += t;

        f = s;
        s = t;
    }

    System.out.println(fibSum);
}
*/

/* 21. Print the square of each number from 1 to n.

int n = 10;

int i =1;
while(i<=n){
 System.out.print( i*i + " ");
 i++;
}

*/
/*22. Print the cube of each number from 1 to n.
int n = 10;

int i =1;
while(i<=n){
 System.out.print( i*i*i + " ");
 i++;
}
*/

/*23. Print all numbers between a and b that are divisible by 7 

int a = 7;
int b = 100;

while(a<=b){
    if(a%7 == 0){
        System.out.print(a + " ");
    }
    a++;
}
// optimised version
int a = 7;
int b = 100;

while(a <= b){
    System.out.print(a + " ");
    a += 7;
}
*/

/*24. Print all factors of the given number 
int n = 12;
int i = 1;

while(i <= n){
    if(n%i == 0){
        System.out.print(i + " ");
    }
    i ++;
}
    

//optimised version
int n = 12;
int i = 1;

while(i*i <= n){
    if(n%i == 0){
        System.out.print(i + " ");

        //will help avoid duplicate values
        if(i!=n/i){
            System.out.print(n/i + " ");
        }
    }
    i++;
}
*/
/*25. Find and print the sum of all factors of the given number 

int n = 12;
int i = 1;
int sum = 0;
while(i <= n){
    if(n%i == 0){
        sum += i;
    }
    i++;
}
System.out.println(sum);
*/
/*26. Find the HCF (Highest Common Factor) of two given numbers 
int a = 12;
int b = 18;

int fact1 = 1;
int fact2 = 1;
int hcf = 0;
for(int i =1; i<=a; i++){
    if(a%i == 0){
        fact1 = i;
    }
    for(int j = 1; j<=b; j++){
        if(b%j == 0){
        fact2 = j;
    }
if(fact1 == fact2){
        hcf = fact1;
    }
}
  
}
System.out.println(hcf);
// HCF ever be greater than the smaller number so instead of looping till a, loop till the smaller number which is a here.
int a =  20;
int b = 30;
int hcf = 1;
int min;

if(a < b){
    min = a;
}
else{
    min = b;
}
for(int i=1; i<=min; i++){
        if(a%i == 0 && b%i==0){
                hcf = i;
            }
        }   
System.out.println(hcf);

*/

/*27. Find the LCM (Least Common Multiple) of two given numbers. */

int a = 4;
int b = 6;

for(int i =1; i<=10; i++){
    
}
}
}

