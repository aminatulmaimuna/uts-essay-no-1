
public abstract class Vehicle {
    protected String name;
    protected int speed;

    public Vehicle(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public abstract void move();

    public void displayInfo() {
        System.out.println("Kendaraan: " + name + " – " + speed + " km/h");
    }
}
