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
        weight = 1;
        isHungry = false;
        hasPair = false;

    }

    public void attack() {
        health -= health;
    }

    public void move() {
        isHungry = true;
        weight -= 1;
    }

    public void buy() {
        health += 1;
    }

    public void retreat() {
        health -= 1;
    }

    public void paint() {
        hasPair = true;
    }

    public void eat() {
        isHungry = false;
        weight = weight + 1;
    }

    public void grow() {
        age += 1;
        height += 1;
    }

}
