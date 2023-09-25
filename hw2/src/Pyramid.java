public non-sealed class Pyramid extends Shape{
    private final double area;
    private final double height;
    public Pyramid(double area, double height){
        super();
        this.area = area;
        this.height = height;
        this.setVolume(area*height/3);
    }
    public double getHeight(){
        return this.height;
    }
    public void print(){
        System.out.println("That's a pyramid, its volume is " + this.getVolume() + " and its height is " + this.getHeight() + " and its area is " + this.area);
    }

}
