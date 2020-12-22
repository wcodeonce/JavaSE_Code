package bn.demo02;
/*
    抽象类
 */
public abstract class Animal {
    //抽象方法
    public abstract void eat();
    //如果一个类里面有抽象方法,那么一定是抽象类

    //方法
    public void sleep() {
        //抽象类里面可以有具体的方法,也可以没有抽象方法
        System.out.println("睡觉");
    }
}
