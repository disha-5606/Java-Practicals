public class Bike extends Vehicle{
    private int price;

    public Bike(String model, String brand, String year, int price){
        super(model,brand,year);
        this.price=price;
    }
    @Override
    public void displayDetails(){
        System.out.println("Bike  Details");
        System.out.println("Model: "+model);
        System.out.println("Brand: "+brand);
        System.out.println("Year: "+year);
        System.out.println("Price: "+price);

    }

}