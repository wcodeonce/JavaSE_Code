package Demo09;

//定义测试类，写代码测试
public class Demo {
    public static void main(String[] args) {
        //创建老师类对象进行测试
        Teacher t1 = new Teacher();
        t1.setName("小明");
        t1.setAge(18);
        System.out.println(t1.getName() + "," + t1.getAge());
        t1.teach();

        Teacher t2 = new Teacher("小红", 20);
        System.out.println(t2.getName() + "," + t2.getAge());
        t2.teach();


    }
}
