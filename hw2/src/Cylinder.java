public final class Cylinder extends Shape{
    private double radius;
    private double height;
    public Cylinder(double radius, double height){
        super();
        this.radius = radius;
        this.height = height;
        this.setVolume(radius*radius*height);
    }
    public double getHeight(){
        return this.height;
    }
    public void print(){
        System.out.println("That's a cylinder, its volume is " + this.getVolume() + " and its height is " + this.getHeight() + " and its radius is " + this.radius);
    }

}
