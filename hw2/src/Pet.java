public class Pet {
    public int age = 0;
    public int weight = 0;
    public String owner = "Vasya";
    public String name = "Twar";
    public Pet(String name, int age, int weight, String owner){
        this.age = age;
        this.name = name;
        this. weight = weight;
        this.owner = owner;
    }
    public Pet(){
        this.age = 0;
        this.weight = 0;
        this.owner = "Vasya";
        this.name = "Twar";
    }
    public void say(){
        System.out.println("I'm not even a mammal what do you expect me to say?");
    }
}
