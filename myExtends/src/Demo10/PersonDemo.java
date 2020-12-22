package Demo10;
/*
    测试类
 */
public class PersonDemo {
    public static void main(String[] args) {
        //创建老师类对象并进行测试
        Teacher t1 = new Teacher();
        t1.setName("小明");
        t1.setAge(18);
        System.out.println(t1.getName() + ", " + t1.getAge());
        t1.teach();

        Teacher t2 = new Teacher("小红", 20);
        System.out.println(t2.getName() + "," + t2.getAge());
        t2.teach();


        //创建学生类对象并进行测试
        Student s1 = new Student();
        s1.setName("小绿");
        s1.setAge(20);
        System.out.println(s1.getName() + ", " + s1.getAge());
        s1.student();

        Student s2 = new Student("小刚", 22);
        System.out.println(s2.getName() + ", " + s2.getAge());
        s2.student();


    }
}
