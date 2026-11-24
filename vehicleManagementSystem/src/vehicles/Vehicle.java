package vehicleManagemantSystem.src.vehicles;

// Super class
public abstract class Vehicle{
    protected String model;
    protected String year;
    protected String brand;

    public Vehicle(String model,String year,String brand){
    this.model=model;
    this.year=year;
    this.brand=brand;
}

public abstract void displayDetails();


}
