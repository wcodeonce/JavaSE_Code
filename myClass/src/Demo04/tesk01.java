package Demo04;

import Demo03.Test01;

/**
 * @Author/ junjie
 * @Description/ //TODO $
 * @Date/ $ $
 * @Param/ $
 * @return/ $
 */

public class tesk01 {
    //构造方法
    private String name;
    private int age;

    //构造方法
//    public tesk01(){
//        System.out.println("无参构造方法");
//    }
    public tesk01(){}

    public tesk01(String name){
        this.name = name;
    }

    public tesk01(int age){
        this.age = age;
    }

    public tesk01(String name, int age){
        this.name = name;
        this.age = age;
    }


    public void show(){
        System.out.println(name + "," + age);
    }
}
