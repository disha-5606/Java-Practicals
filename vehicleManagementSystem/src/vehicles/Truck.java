public class Truck extends Vehicle{
    private String owner;

    public Truck(String model, String brand, String year,String owner ){
        super(model,brand,year);
        this.owner=owner;
    }
    @Override
    public void displayDetails(){
        System.out.println("Bike  Details");
        System.out.println("Model: "+model);
        System.out.println("Brand: "+brand);
        System.out.println("Year: "+year);
        System.out.println("Owner: "+owner);

    }

}