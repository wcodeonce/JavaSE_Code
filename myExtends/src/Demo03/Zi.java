package Demo03;

public class Zi extends Fu {
    //年龄
    public int age = 20;

    public void show() {
        int age = 30;
        //访问局部变量age
        System.out.println(age);

        //访问本类的成员变量age--this
        System.out.println(this.age);

        //访问父类的成员变量age--super
        System.out.println(super.age);
    }
}

