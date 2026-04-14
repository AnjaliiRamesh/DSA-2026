import java.util.Scanner;

public class simpleCalci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of a: ");
        int a = sc.nextInt();

        System.out.print("Enter the value of b: ");
        int b = sc.nextInt();

        System.out.print("Enter the operator (+, -, *, /): ");
        char op = sc.next().charAt(0);

        if(op == '+'){
            System.out.println("The sum is " + (a + b));
        }
        else if(op == '-'){
            System.out.println("The difference is " + (a - b));
        }
        else if(op == '*'){
            System.out.println("The product is " + (a * b));
        }
        else if(op == '/'){
            if(b == 0){
                System.out.println("Cannot divide by zero");
            } else {
                System.out.println("The quotient is " + ((double)a / b));
            }
        }
        else{
            System.out.println("Invalid operator");
        }

        sc.close();
    }
}
