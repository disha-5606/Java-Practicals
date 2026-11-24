import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        do{

        System.out.println("welcom to calculator");
        System.out.println("Enter your choice of operation: ");

        System.out.println(" 1.Addition:\n 2.Subtraction:\n 3.Multiplication:\n 4.Division:\n");
        String operation = scanner.next();

        System.out.println("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.println("Enter second number: ");
        int num2 = scanner.nextInt();

        int result = 0;
        switch (operation) {
            case "1":
                result = num1 + num2;
                break;
            case "2":
                result = num1 - num2;
                break;
            case "3":
                result = num1 * num2;
                break;
            case "4":
                if (num2 == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                    scanner.close();
                    return;
                }
                result = num1 / num2;
                break;
            default:
                System.out.println("Invalid operation");
                return;

        }
        
        System.out.println("Result: " + result);
    } while(true);
     
    }
}
