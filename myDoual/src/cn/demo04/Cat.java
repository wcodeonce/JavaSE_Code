package cn.demo04;

public class Cat extends Animal {

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    public void playGame() {
        System.out.println("猫抓迷藏");
    }
}
