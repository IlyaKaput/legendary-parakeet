public class Car {
    private String colour;
    private int fuel;
    private final int maxFuel;
    private final String model;
    private final Engine engine;
    private int mileage;

    public Car(String colour, int fuel, int mf, String m, int e) {
        this.colour = colour;
        this.fuel = fuel;
        this.model = m;
        this.maxFuel = mf;
        this.engine = new Engine();
        this.engine.waste = e;
        this.mileage = 0;
    }

    public void start() {
        this.engine.start();

        while (this.fuel > this.engine.waste) {
            this.fuel -= this.engine.waste;
            this.mileage += 100;
        }
        this.engine.stop();
        System.out.println("OUT OF FUEL! FEEEEEEED ME!");
    }

    public void feed() {
        this.fuel = this.maxFuel;
    }

    public void feed(int n) {
        this.fuel = Math.min(this.maxFuel, this.fuel + n);
    }
    public void info(){
        System.out.println("Colour is " + colour + " fuel is " + fuel + " engine is working " + engine.isWorking + " we ride " + mileage +" kilometers " + "on " + model);
    }
    public void howManyMiles(){
        System.out.println(this.mileage);
    }

}
