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

        /*6. Calculate and print the sum of the first n natural numbers. */

        System.out.print("Enter the value of n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int i =1;
        int sum =0;
        while(i <=n){
            sum = sum +i;
            i++;
        }
        System.out.println(sum);;
    }
}
