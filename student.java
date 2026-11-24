import java.util.Scanner;

public class student {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Integer id = null;
        String name = null;
        Integer marks = null;

        do {
            System.out.println("\nWelcome to the program");
            System.out.println("Enter your choice:");
            System.out.println("1. Insert");
            System.out.println("2. Display");
            System.out.println("3. Reset");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("\nInsert operation selected.");

                    System.out.print("Enter student Roll Number: ");
                    id = scanner.nextInt();

                    scanner.nextLine(); 

                    System.out.print("Enter student Name: ");
                    name = scanner.nextLine();

                    System.out.print("Enter student Marks: ");
                    marks = scanner.nextInt();

                    System.out.println("Student details inserted successfully.");
                    break;

                case 2:
                    System.out.println("\nDisplay operation selected.");

                    if (id == null) {
                        System.out.println("No student data available.");
                    } else {
                        System.out.println("Student Details:");
                        System.out.println("Roll Number: " + id);
                        System.out.println("Name: " + name);
                        System.out.println("Marks: " + marks);
                    }
                    break;

                case 3:
                    System.out.println("\nReset operation selected.");

                    id = null;
                    name = null;
                    marks = null;

                    System.out.println("Student details reset successfully.");
                    break;

                case 4:
                    System.out.println("\nExiting the program.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (true);
    }
}