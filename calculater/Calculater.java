import java.util.Scanner;

class Calculater {
    public static void main (String[] args) {
        double result = 0;
        System.out.println("Hello, this is a calculater app. please write the first number");
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();

        System.out.println("please write the second number");
        double num2 = scanner.nextDouble();

        scanner.nextLine();

        System.out.println("please select an operation ( + , - , * , / )");
        String op = scanner.nextLine();

        switch(op){
            case "+":
            result = num1 + num2;
            System.out.println("Result: " + result);
            break;

            case "-":
            result = num1 - num2;
            System.out.println("Result: " + result);
            break;

            case "*":
            result = num1 * num2;
            System.out.println("Result: " + result);
            break;

            case "/":
            result = num1 / num2;
            System.out.println("Result: " + result);
            break;
        }

        scanner.close();
    }
}