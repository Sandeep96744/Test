package exceptionHandling;

import java.util.*;

public class Demo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Hello User!");

        System.out.println("Enter two numbers : ");
        int a = 0, b = 0;
        boolean sig = true;
        try {
            a = sc.nextInt();
            b = sc.nextInt();
        }
        catch(InputMismatchException e) {
            System.out.println("Please enter Integer Number as Input");
            sig = false;
        }

        if(sig) {
            if (b != 0) {
                int result = a / b;
                System.out.println(a + "/" + b + " = " + result);
            } else {
                System.out.println("Sorry you can't divide a number by zero");
            }
        }

        System.out.println("Anything more you want?");

        System.out.println("Please provide your feedback");

        String feedback = sc.nextLine() + sc.nextLine();

        System.out.println("Thank You");
    }
}
