

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Simulasi Kendaraan ===");

        ArrayList<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Truck());
        vehicles.add(new Motorcycle());

        for (Vehicle v : vehicles) {
            v.displayInfo();
            v.move();
            System.out.println();
        }
    }
}
