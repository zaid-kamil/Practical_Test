

public class Vehicle {
    private String type;
    private String brand;
    private String wheels;
    private String color;

    public Vehicle(String type, String brand, String wheels, String color) {
        this.type = type;
        this.brand = brand;
        this.wheels = wheels;
        this.color = color;
    }
void show() {
    System.out.println("Vehicle type"  + type);
    System.out.println("Vehicle brand"  + brand);
    System.out.println("Vehicle wheels"  + wheels);
    System.out.println("Vehicle color"  + color);
}
    public static void main(String[] args){
        Vehicle v1 = new Vehicle("Four wheeler", "Ford", "4", "Black");
        v1.show();
    }
}
