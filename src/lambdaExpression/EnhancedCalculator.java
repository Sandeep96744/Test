package lambdaExpression;

import java.util.Scanner;

interface Operation {
    int operate(int a, int b);
}

class EnhancedCalculator {

    static int calculate(int a, int b, Operation op) {
        return op.operate(a, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome!\nEnter two numbers:");
        int x = sc.nextInt();
        int y = sc.nextInt();

        var resSum = calculate(x, y, (a, b) -> a + b);
        System.out.println("Task 1: " + x + " + " + y + " = " + resSum);

        var resDiff = calculate(x, y, (a, b) -> a - b);
        System.out.println("Task 2: " + x + " - " + y + " = " + resDiff);

        var resMul = calculate(x, y, (a, b) -> a * b);
        System.out.println("Task 3: " + x + " * " + y + " = " + resMul);

        if(y != 0) {
            var resDiv = calculate(x, y, (a, b) -> a / b);
            System.out.println("Task 4: " + x + " / " + y + " = " + resDiv);
        }
        else System.err.println("Task 4: Division by Zero.");

        System.out.println("Thank You!");
    }
}
