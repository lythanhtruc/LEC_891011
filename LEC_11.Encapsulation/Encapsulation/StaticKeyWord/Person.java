package LEC_11.Encapsulation.StaticKeyWord;

public class Person {

    private String name;
    private int count = 0;

    public Person(String n) {
        name = n;
        count++;
        System.out.println(count);


    public static void main(String[] args) {
        Person pl = new Person("Trang");
        Person p2 = new Person("Duong");
    


}
}
