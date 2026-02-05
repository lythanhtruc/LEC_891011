package Lec_10.AbstractClassAndInterface.DataFields;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Barks barks");
    }

}
