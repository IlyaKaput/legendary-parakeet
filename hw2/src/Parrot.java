import java.util.concurrent.ThreadLocalRandom;

public class Parrot extends Pet{
    public String country = "Whatever";
    boolean docs = false;
    public Parrot(){
        super();
        this.docs = false;
        this.country = "None of ur busyness";
    }
    public Parrot(String name, int age, int weight, String owner, String country, boolean docs){
        this.country = country;
        this.age= age;
        this.name = name;
        this. weight = weight;
        this.owner = owner;
        this.docs = docs;
    }
    public void fly(){
        int a = ThreadLocalRandom.current().nextInt(1, 61);
        System.out.println(this.name + " abandoned us for " + a + " minutes");
    }
    public void check(){
        if (!this.docs){
            System.out.println("Kwagh! I'm ILLEGAL!");
        }
    }
    @Override
    public void say(){
        System.out.println("Kwagh! Say!");
    }
}
