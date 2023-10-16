public class ColourPyramid extends Pyramid{
    private final String colour;
    public ColourPyramid(double height, double area, String colour){
        super(area, height);
        this.colour = colour;
    }
    public void print(){
        System.out.println("That's a " + colour + " pyramid, its volume is " + this.getVolume() + " and its height is " + this.getHeight());
    }
}
