import java.util.Scanner;

// Interface
interface ElectricityBill {
    double CalculateBill(); // method declaration
}

// Custom Exception
class InvalidUnitException extends Exception {

    InvalidUnitException(String message) {
        super(message);
    }
}

// Commercial Generator
class CommercialGenerator implements ElectricityBill {

    public int units;

    CommercialGenerator(int units) throws InvalidUnitException {
        if (units < 0) {
            throw new InvalidUnitException("Unit cannot be negative");
        }

        this.units = units;
    }

    public double CalculateBill() {
        return units * 6.0;
    }
}

// Main Class
public class ElectricityBillGenerator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter Commercial Units:");
            int commercialUnit = sc.nextInt();

            ElectricityBill commercial =
                    new CommercialGenerator(commercialUnit);

            System.out.println("Electricity Bill: ₹"
                    + commercial.CalculateBill());

        } catch (InvalidUnitException e) {
            System.out.println("Error: " + e.getMessage());

        } 

        sc.close();
    }
}