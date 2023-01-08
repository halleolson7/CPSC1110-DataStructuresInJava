public class Vehicle implements Efficiency {

    private double efficiency;

    public Vehicle(double efficiency) {

        this.efficiency = efficiency;

    }

    public void printMessage()

    {

        System.out.println("I am a Vehicle, VROOM!!!");

    }

    public String getName()

    {

        return this.getClass().getSimpleName();

    }

    @Override

    public double getEfficiency() {

        return efficiency;

    }

}