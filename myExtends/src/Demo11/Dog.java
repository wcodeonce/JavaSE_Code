package Demo11;

import java.sql.SQLOutput;

public class Dog extends Animal {

    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    public void lookDoor() {
        System.out.println("狗看门");
    }
}
