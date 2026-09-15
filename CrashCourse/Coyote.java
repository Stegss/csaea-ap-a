public class Coyote {
    
    String name;
    String color;
    int health;
    int age;
    double height;
    double weight;
    boolean isHungry;
    boolean hasPair;

    public Coyote(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;

        health = 100;
        height = 1;

    }

    public void eat() {
        isHungry = false;
        weight = weight + 1;
    }

}
