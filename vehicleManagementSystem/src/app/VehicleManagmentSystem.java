package app;
import vehicleManagementSystem.src.vehicles.*;
public class VehicleManagmentSystem {

    public static void main(String[] args) {
       Vehicle[] vehicles = {
            new Car("Model S", "Tesla", "2022", "Red"),
            new Bike("Street Rider", "Yamaha", "2022", 5000),
            new Truck("abc","","",""),
        };

        for(Vehicle vehicle: vehicles){
            vehicle.displayDetails();
            System.out.println();

        }

       
    }
    
}
