public final class Ball extends Shape{
    private double radius;
    public Ball(double radius){
        super();
        this.radius = radius;
        this.setVolume(radius*radius*4/3*3.14159265);
    }
    public void print(){
        System.out.println("That's a ball, its volume is " + this.getVolume());
    }

}
