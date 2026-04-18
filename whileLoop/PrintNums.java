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
         
/*12. Reverse the given number and print the reversed value. */

 int n = 456;
        int rev = 0;

        while (n != 0) {
            int ld = n % 10;
            rev = rev * 10 + ld;
            n = n / 10;
        }

        System.out.println(rev);

    }
}
