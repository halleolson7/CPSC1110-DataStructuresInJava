import java.text.DecimalFormat;
import java.util.Random;
public class Tester {

    public static void main(String[] args) {
        final int NUM_VEHICLES = 10;
        int num;
        double effi;

        DecimalFormat df = new DecimalFormat(".00");    // DecimalFormat class is used to format the output
        Vehicle[] vehicles = new Vehicle[NUM_VEHICLES];
        Random r = new Random();                            // Creating a random class object

        for (int i = 0; i < NUM_VEHICLES; i++) {
            num = r.nextInt((2) + 1);
            effi = (100) * r.nextDouble();

            if (num == 0) {
                vehicles[i] = new Vehicle(effi);        // vehicle
            }
            else if (num == 1) {
                vehicles[i] = new Car(effi);        // car
            }
            else {
                vehicles[i] = new Boat(effi);       // boat
            }
        }

        for (int i = 0; i < NUM_VEHICLES; i++) {        // loop will display the Class names
            vehicles[i].printMessage();
        }

        for (int i = 0; i < NUM_VEHICLES; i++) {
            System.out.println(vehicles[i].getName() + " " + df.format(vehicles[i].getEfficiency()));
        }

        Vehicle v = getFirstBelowT(vehicles, 20);
        if (v == null) {
            System.out.println("then none of the objects in the array had an efficiency less than 20");
        }
        else {
            System.out.println("The first object with efficiency less than 20 was " + v.getName() + " with efficiency of " + df.format(v.getEfficiency()));
        }
    }
    private static Vehicle getFirstBelowT(Vehicle[] vehicles, int target) {     // static method that accepts array of Efficiency objects
        for (int i = 0; i < vehicles.length; i++) {
            if (vehicles[i].getEfficiency() < target)
                return vehicles[i];
        }
        return null;
    }
}