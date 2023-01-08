import java.util.*;
/*
 @name Halle Olson
 @date 09/21/2022
 */

class Circuit {
    double resistance = 0;
    public double getResistance() {
        return 0;
    }
}

class Resistor extends Circuit {
    public Resistor(double r) {
        resistance = r;
    }
    @Override
    public double getResistance() {
        return resistance;
    }
}
class Parallel extends Circuit {
    ArrayList < Circuit > l;
    public Parallel() {
        l = new ArrayList < Circuit > ();
    }

    public void add(Circuit r) {
        l.add(r);
    }
    @Override
    public double getResistance() {
        double r = 0;
        for (Circuit i: l)
            r += 1 / i.getResistance();
        return 1 / r;
    }
}

class Serial extends Circuit {
    ArrayList < Circuit > l;
    public Serial() {
        l = new ArrayList < Circuit > ();
    }
    public void add(Circuit r) {
        l.add(r);
    }
    @Override
    public double getResistance() {
        double r = 0;
        for (Circuit i: l)
            r += i.getResistance();
        return r;
    }
}

public class CircuitDemo {

    /**
     method that implements tests for Circuit class and sublclasses
     @param args - Not Used.
     */

    public static void main(String[] args) {

        // Case 1 - Parallel
        System.out.println("Test Case 1: ");
        Parallel circuit1 = new Parallel();
        circuit1.add(new Resistor(100));
        Serial circuit2 = new Serial();
        circuit2.add(new Resistor(100));
        circuit2.add(new Resistor(200));
        circuit1.add(circuit2);
        System.out.println("Combined resistance: " + circuit1.getResistance());
        System.out.println("Expected: 75.0");

        // Case 2 - Serial
        System.out.println("\nTest Case 2: ");
        Serial c1 = new Serial();
        c1.add(new Resistor(100));
        c1.add(new Resistor(200));
        c1.add(new Resistor(150));
        System.out.println("Combined resistance: " + c1.getResistance());
        System.out.println("Expected: 450.0");

        // Case 3 - Parallel
        System.out.println("\nTest Case 3: ");
        Parallel c2 = new Parallel();
        c2.add(new Resistor(100));
        c2.add(new Resistor(100));
        c2.add(new Resistor(100));
        System.out.printf("Combined resistance: %.1f\n", c2.getResistance());
        System.out.println("Expected: 33.3");

        // Case 4 - Serial
        System.out.println("\nTest Case 4: ");
        Serial c3 = new Serial();
        c3.add(c1);
        c3.add(c2);
        System.out.printf("Combined resistance: %.1f\n", c3.getResistance());
        System.out.println("Expected: 483.3");


    }

}