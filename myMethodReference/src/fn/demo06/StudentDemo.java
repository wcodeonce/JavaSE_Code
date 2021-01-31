package fn.demo06;

/**
 * @Author WTIHK
 * @Date 2021/1/31
 */

/*
    练习
        定义一个类（Student），里面有两个成员方法（name，age）
            并提供无参构造法方法和带参构造方法，以及成员遍历对应的 get方法 和 set方法
        定义一个接口（StudentBuilder），里面定义一个抽象方法
            Student build(String name, int age);
        定义一个测试类（StudentDemo），在测试类中提供两个方法
            一个方法是：useStudentBuilder(StudentBuilder s)
            一个方法是主方法，在主方法中调用 useStudentBuilder 方法
 */

public class StudentDemo {
    public static void main(String[] args) {

        //在主方法中调用 useStudentBuilder 方法

        //Lambda表达式
//        useStudentBuilder((String name, int age) ->{
////            Student s = new Student(name, age);
////            return s;
//            return new Student(name, age);
//        });

        useStudentBuilder((name, age) -> new Student(name, age));

        //引用构造器
        useStudentBuilder(Student::new);

        //Lambda被构造器替代的时候，他的形式参数全部传递给构造器作为参数

    }

    private static void useStudentBuilder(StudentBuilder sb) {
        Student s = sb.build("大雄", 18);
        System.out.println(s.getName() + "," + s.getAge());
    }

}
