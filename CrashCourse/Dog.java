public class Dog {
    
    String name;
    String ownerName;
    String breed;
    int age;
    double weight;
    boolean isHungry;
    boolean isHome;
    int energyLevel;

    public Dog(String name, String ownerName, String breed) {
        this.name = name;
        this.ownerName = ownerName;
        this.breed = breed;

        age = 0;
        isHungry = false;
        isHome = true;
        energyLevel = 100;
        weight = 10;
    }

    public void bark() {
        System.out.println(name + "barks.");
    }

    public void scratch() {
        System.out.println(name + "makes a mess.");
    }

    public void bite() {
        System.out.println(name + "bites nothing.");
    }

    public void eat() {
        isHungry = false;
        weight = weight + 1;
    }

    public void run_away() {
        isHome = false;
        energyLevel -= 10;
        if (energyLevel < 0){
            energyLevel = 0;
        }
    }

    public void come_home() {
        isHome = true;
    }

    public void sleep() {
        energyLevel += 10;
        if (energyLevel > 100){
            energyLevel = 100;
        }
    }

    public void have_a_birthday() {
        age += 1;
    }






}
