package PatternPrinting;

public class Patterns {
    
    
    public static void main(String[] args) {

        /*1. Print a Single Star (*) 
        System.out.println("*");
        */

        /*2. Print Four Stars (****)

        for(int i =1; i<=4; i++){
            System.out.print("*");
        }
    */

    /*3. Print n Stars on Same Line 
    int n = 6;
         for(int i =1; i<=n; i++){
            System.out.print("*");
        }

    }
    */
    /*4. Print Square of Stars (n x n Stars) 
int n = 4;
int s = 4;
         for(int i =1; i<=n; i++){
            for(int j = 1; j<=s; j++){
            System.out.print("* ");
            }
            System.out.println();
        }
*/
/*5. Print an Increasing Triangle of Stars 

int n = 5;
         for(int i =1; i<=n; i++){
            for(int j = 1; j<=i; j++){
            System.out.print("* ");
            }
            System.out.println();
        }
*/
/*6. Print a Right-Aligned Triangle of Stars 
int n = 5;
         for(int i =1; i<=n; i++){
            for(int k =1; k<=n-i; k++){
                System.out.print(" ");
            }
            for(int j = 1; j<=i; j++){
            System.out.print("*");
            }
            System.out.println();
        }
*/

        /*7. Print Stars in Even Numbers (2, 4, 6, 8, 10) */

        int n = 5;
         for(int i =0; i<=n; i++){
            for(int j = 0; j<=i+2; j++){
            System.out.print("*");
            }
            System.out.println();
        }
}
}
