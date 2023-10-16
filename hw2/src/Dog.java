public class Dog extends Pet{
    private Food food = Food.CHEAP;
    public Dog(){
        super();
        this.food = Food.CHEAP;
    }
    public Dog(String name, int age, int weight, String owner, Food food){
        this.food = food;
        this.age= age;
        this.name = name;
        this. weight = weight;
        this.owner = owner;

    }
    public void walk(){
        System.out.println("I've walked with my owner. He's nice");
    }
    public void walk(String name){
        System.out.println("I've walked with " + name + ". That was good");
    }
    @Override
    public void say(){
        System.out.println("Well, bark, I guess");
    }
}
