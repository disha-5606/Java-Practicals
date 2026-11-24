import java.util.Scanner;

public class practical02 {

    public static void main(String[] args) {

       
        int evenCount = 0;
        int oddCount = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Even and Odd Number Checker!");
        System.out.print("How many numbers you want to enter?: ");
        int n = scanner.nextInt();

         int[] a = new int[n];
        System.out.println("Enter the " + n + " numbers:");

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();

            if (a[i] % 2 == 0) {
                System.out.println("Even numbers: " + a[i]);
                System.out.println("Even number position: " + i+"\n");
                evenCount++;
            } else {
                System.out.println("Odd number: " + a[i]);
                System.out.println("Odd number position: " + i+"\n");
                oddCount++;
            }
        }

        System.out.println("\nTotal even numbers: " + evenCount);
        System.out.println("Total odd numbers: " + oddCount+"\n");

        scanner.close();
    }
}