public class Main {
    public static void main(String[] args) {
        Ball ball = new Ball(1);
        Car car = new Car("red", 100, 120, "Kopeyka", 8);
        Contact contact = new Contact("Ya ne ponyal, to li ya delay woobshe", "realnoNePonyal@gmail.com");
        IntHolder intHolder = new IntHolder(10);
        Parrot parrot = new Parrot("Kesha", 100, 1, "Ignat", "Arstotska", false);
        Cat cat = new Cat("Murka", 1, 12, "Ignat", Food.EXPENSIVE);
        Dog dog = new Dog("Bobik", 10, 10, "Ignat", Food.CHEAP);
        Point point = new Point(1, 5);
        Pyramid pyramid = new Pyramid(12, 5);
        Cylinder cylinder = new Cylinder(10, 10);
        ColourPyramid colourPyramid = new ColourPyramid(10, 10, "blue");
        car.start();
        car.feed(58);
        car.info();
        car.howManyMiles();
        System.out.println(contact);
        System.out.println(intHolder.getInt());
        parrot.fly();
        parrot.say();
        parrot.check();
        cat.say();
        cat.walk();
        cat.walk("whatever his name is");
        dog.say();
        dog.walk();
        dog.walk("IIgor");
        System.out.println(point.getX());
        point.translate(1, 1.5);
        System.out.println(point.getY());
        pyramid.print();
        colourPyramid.print();
        cylinder.print();
        ball.print();
    }
}