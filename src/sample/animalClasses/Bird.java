package sample.animalClasses;

public class Bird extends Animal {
    String name;

    public Bird(String name){
        this.name = name;
    }
    public void fly(double distanceInMeters){
        System.out.println("I just flew "+distanceInMeters+" meters.");
    }
    public String getName(){return name;}
}
