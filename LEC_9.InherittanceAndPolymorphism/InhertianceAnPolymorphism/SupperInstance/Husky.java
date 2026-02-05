package LEC_9.InhertianceAnPolymorphism.SupperInstance;

public class Husky extends Dog {

    int price = 1500;

    void displayPrice() {
        System.out.println("DOg's price: " + super.price);
        System.out.println("Husky's price: " + price);
    }

}
