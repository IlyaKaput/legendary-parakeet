public class Engine {
    public boolean isWorking = false;
    public int waste = 10;
    Engine(int waste){
        this.waste = waste;
    }
    Engine(){
        this.waste = 10;
    }
    public void start(){
        if (this.isWorking){
            System.out.println("Kuda?!");
        }
        this.isWorking = true;
    }
    public void stop(){
        if (!this.isWorking){
            System.out.println("Kuda?!");
        }
        this.isWorking = false;
    }
}
