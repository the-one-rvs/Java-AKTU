import java.util.*;
class Class{
    int x;
    public Class() {
        Scanner sc = new Scanner(System.in);
        this.x = sc.nextInt();
    }
    public Class(int x){ //overloading compile-time/static polymorphism
        this.x = x;
    }

    private Class (int x,int z){
        this.x = x;
        x = z;
        z = this.x;
    }

    //xyz

    public Class (Class obj){
        this.x = obj.x;
    }

    public int show (){
        return (this.x);
    }
}

class Animal{
    public void eat(){
        System.out.println("eating");
    }
}

class Dog extends Animal{

}

class Puppy extends Dog{

}

class Horse extends Animal{

}

interface canSwim{ //Interface Abstraction
    void swim();
}

interface canRun{
    void run();
}

abstract class Activity {
    abstract void sound();


    void sleep() {
        System.out.println("Sleeping...");
    }
}

class SmartDog extends Activity{
    @Override
    void sound(){
        System.out.println("Hi");
    }
}

class Human  implements canSwim,canRun {
    String name;
    public Human(String name) {
        this.name = name;
    }
    @Override
    public void swim(){
        System.out.println(this.name+" can Swim");
    }
    @Override //Method Overriding Polymorphism (Run Time/Dynamic)
    public void run(){
        System.out.println(this.name+" can run");
    }
}


public class Main {
    public static void main(String[] args) {

        //Developed by James Gosling in Sun Microsystems.
        // 1st version released in 1995
        // 2nd version in 1998
        // 6th version in 2006
        // 7th version released by Oracle Inc USA
        // 8th version in 2014
        // 9th version 2017
        // Latest is 22

        //           Byte Code
        //          JVM,JRE,JIT(Just in time compiler translate machine code into native code)

        // OOP
        // 1. Encapsulation
        // 2. Inheritance
        //    a) Single
        //    b) Multilevel
        //    c) Multiple
        //    d) Hierarchical
        // 3. Polymorphism
        // 4. Abstraction

        //Constructor

        Class obj = new Class(7);
        System.out.println(obj.show());
        Class obj2 = new Class();
        System.out.println(obj2.show());
        Class obj3 = new Class (obj2);
        System.out.println(obj3.show());

        //Inheritance

        // a) Single
        Animal dog = new Dog();
//        System.out.println(dog.eat());
        dog.eat();

        // b) Mutilevel

        Animal puppy = new Puppy();
        puppy.eat();

        // c) Hierarchical

        Animal horse = new Horse();
        horse.eat();

        // d) Multiple : Class Implementing multiple interfaces

        Human vaibhav = new Human("Vaibhav");
        vaibhav.swim();
        vaibhav.run();

        //Polymorphism done

        //Abstraction
        SmartDog pubic = new SmartDog();
        pubic.sound();
        pubic.sleep();
    }
}