
package Lec8_ObjectAndClass.constructor;


public class student1 {
 
    int id;
    String name;
    student1 (){System.out.println("default constructor is invoked");}
    student1(int id,String name){
        this();
        this.id = id;
        this.name = name;}
    void display(){System.out.println(id+" "+name);}
    public static void main(String [] args){
        student1 e1 = new student1(111,"keran");
        student1 e2 = new student1(222,"aryan");
        e1.display();
        e2.display();
    }
}


