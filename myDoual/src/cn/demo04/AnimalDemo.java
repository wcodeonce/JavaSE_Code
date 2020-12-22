package cn.demo04;

import cn.demo03.Dog;

/*
    -  向上转型
        - 从子到父
        - 父类引用指向子类对象
    - 向下转型
        - 从父到子
        - 父类引用转为子类对象
 */
public class AnimalDemo {
    public static void main(String[] args) {

        //多态
        //向上转型
        Animal a = new Cat();
        a.eat();
//        a.playGame();

        /*
        //创建Cat类的对象
        Cat c = new Cat();
        c.eat();
        c.playGame();
         */

        //向下转型
        Cat c = (Cat)a;
        c.eat();
        c.playGame();

        //向上转型
//        a = new Dog();
//        a.eat();

        //向下转型
        //ClassCastException
//        Cat cc = (Cat) a;
//        cc.eat();
//        cc.playGame();


    }
}
