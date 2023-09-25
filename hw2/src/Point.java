public class Point {
    private double x;
    private double y;
    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }
    public Point(){
        this.x = 0;
        this.y = 0;
    }
    public double getX(){
        return this.x;
    }
    public double getY(){
        return this.y;
    }
    public void setX(double x){
        this.x = x;
    }
    public void setY(double y){
        this.y = y;
    }
    public void translate(double x, double y){
        setX(getX()+x);
        setY(getY()+y);
    }
    public void scale(double a){
        this.x *= a;
        this.y *= a;
    }
}
