public class Car extends Vehicle {
    String window;
    String mirror;
    String seats;

    public Car(String type, String brand, String wheels, String color, String window, String mirror, String seats) {
        super(type, brand, wheels, color);
        this.window = window;
        this.mirror = mirror;
        this.seats = seats;
    }

    @Override
    void show() {
        super.show();
        System.out.println("Car window" + window);
        System.out.println("Car mirror" + mirror);
        System.out.println("Car seats" + seats);
    }

    public static void main(String[] args) {
        Car v2 = new Car("Four wheeler", "Ford", "4", "Black", "5", "6", "6");
        v2.show();
    }
}

