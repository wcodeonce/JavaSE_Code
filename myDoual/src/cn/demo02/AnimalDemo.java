package cn.demo02;

public class AnimalDemo {
    public static void main(String[] args) {
        //有父类引用执行子类对象
        Animal a = new Cat();

        System.out.println(a.age);
//        System.out.println(a.weight);

        a.eat();
//        a.playGame();


    }
}
