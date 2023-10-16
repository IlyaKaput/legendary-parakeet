sealed class Shape permits Ball, Cylinder, Pyramid{//}, ColourPyramid{
    private double volume;

    void print() {
        System.out.println(volume);
    }
    public void setVolume(double a){
        this.volume = a;
    }
    public double getVolume(){
        return this.volume;
    }
}