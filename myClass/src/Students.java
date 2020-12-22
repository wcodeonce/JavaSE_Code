/**
 * @Author/ junjie
 * @Description/ //TODO $
 * @Date/ $ $
 * @Param/ $
 * @return/ $
 */
/*
    学生类
* */
public class Students {
    //成员变量
    String name;
//    int age;
    private int age;

    //提供get / set 方法
    public void setAge(int a){
        age = a;

        if (a<0 || a>120){
            System.out.println("输入年龄有误!");
        }else {
            age = a;
        }

    }

    public int getAge(){
        return age;
    }



    //成员方法
    public void show(){
        //控制台输出
        System.out.println(name + " ," + age);
    }

}
