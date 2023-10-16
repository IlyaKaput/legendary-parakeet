public class Cat extends Pet{
    private Food food = Food.CHEAP;
    public Cat(){
        super();
        this.food = Food.EXPENSIVE;
    }
    public Cat(String name, int age, int weight, String owner, Food food) {
        this.food = food;
        this.age= age;
        this.name = name;
        this.weight = weight;
        this.owner = owner;

    }
    public void walk() {
        System.out.println("I've walked with my owner. He stinks");
    }
    public void walk(String name) {
        System.out.println("I've walked with " + name + ". He stinks");
    }
    @Override
    public void say() {
        System.out.println("I hate Mondays");
    }
}
