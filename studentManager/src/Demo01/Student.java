package Demo01;
//定义学生类
//Alt + Insert 根据自己的需要进行选择
/*
    成员变量: sid
    姓名: name
    年龄: age
    居住地: address
*/
/*
    构造方法:
        无参构造
        带四个参数的构造
*/
/*
    成员方法:
        每个成员变量对应给出get/set方法
*/
public class Student {
    //学号
    private String sid;
    //姓名
    private String name;
    //年龄
    private String age;
    //居住地
    private String address;

    //构造方法
    public Student(){};

    public Student(String sid, String name, String age, String address) {
        this.sid = sid;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}












