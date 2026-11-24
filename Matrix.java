import java.util.*;
public class Matrix{
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        System.out.print("Enter the number of columns: \n");
        int cols = scanner.nextInt();

        int[][] matrix1 = new int[rows][cols];
        int[][] matrix2 = new int[rows][cols];
        int [][] sum = new int[rows][cols];
         int [][] mul = new int[rows][cols];

        System.out.println("Enter the elements of the first matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix1[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Enter the elements of the second matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix2[i][j] = scanner.nextInt();
            }
        }

        System.out.println("\nThe 1st matrix is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nThe 2nd matrix is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nThe sum of 1st and 2nd matrix is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                sum[i][j]=matrix1[i][j] + matrix2[i][j];
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }

          System.out.println("\nThe multiplication of 1st and 2nd matrix is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                mul[i][j]=matrix1[i][j] * matrix2[i][j];
                System.out.print(mul[i][j] + " ");
            }
            System.out.println();
        }




        scanner.close();
    }
}