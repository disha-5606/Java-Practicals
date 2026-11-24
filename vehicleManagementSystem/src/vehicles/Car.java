public class Car extends Vehicle{
    private String color;

    public Car(String model, String brand, String year, String color){
        super(model,brand,year);
        this.color=color;
    }
    @Override
    public void displayDetails(){
        System.out.println("Car Details");
        System.out.println("Model: "+model);
        System.out.println("Brand: "+brand);
        System.out.println("Year: "+year);
        System.out.println("Color: "+color);

    }

}