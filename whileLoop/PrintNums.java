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

        /*15. Check whether the given number is a Perfect number 

        int n = 15; 
        int i = 1;

        int sum = 0;
        while(i<n){
            if(n %i ==0){
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
*/

for (int n = 2; n <= 20; n++) {

    int i;
    for (i = 2; i * i <= n; i++) {
        if (n % i == 0) break;
    }

    if (i * i > n) {
        System.out.print(n + " ");
    }
}

   
}
}
