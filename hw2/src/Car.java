public class Car {
    private String colour = "black";
    private int fuel;
    private final Engine engine;
    private int maxFuel=0;
    private String model="Lada";
    private Engine engine;
    private int mileage;
    public static class Builder {

        private String colour;
        private int fuel;
        private  int maxFuel;
        private  String model;
        private  Engine engine;
        private int mileage;

        public Builder(int maxFuel, int e) {
            this.maxFuel = maxFuel;
            this.engine = new Engine(e);
            this.fuel = 0;
        }
        public Builder mileage(int mileage){
            this.mileage = mileage;
            return this;
        }
        public Builder fuel(int fuel){
            this.fuel = fuel;
            return this;
        }
        public Builder model(String model){
            this.model = model;
            return this;
        }
        public Builder colour(String colour){
            this.colour = colour;
            return this;
        }
        public Car build(){
            return new Car(this);
        }
    }
    private Car(Builder builder){
        this.fuel = builder.fuel;
        this.colour = builder.colour;
        this.model = builder.model;
        this.mileage = builder.mileage;
        this.maxFuel = builder.maxFuel;
        this.engine = builder.engine;

    }
    /*public Car(String colour, int fuel, int mf, String m, int e) {
        this.colour = colour;
        this.fuel = fuel;
        this.model = m;
        this.maxFuel = mf;
        this.engine = new Engine();
        this.engine.waste = e;
        this.mileage = 0;
    }*/

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
