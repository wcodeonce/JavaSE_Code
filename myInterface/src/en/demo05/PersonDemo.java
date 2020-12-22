package en.demo05;

//测试类
public class PersonDemo {
    public static void main(String[] args) {
        //创建对象
        PingPangPlayer ppp = new PingPangPlayer();
        ppp.setName("小明");
        ppp.setAge(18);
        System.out.println(ppp.getName() + ", " + ppp.getAge());
        ppp.eat();
        ppp.study();
        ppp.speak();

        System.out.println("----------------------");

        BasketballPlayer bbb = new BasketballPlayer();
        bbb.setName("小刚");
        bbb.setAge(20);
        System.out.println(bbb.getName() + "; " + bbb.getAge());
        bbb.eat();
        bbb.study();

        System.out.println("-----------------------");

        PingPangCoach pp = new PingPangCoach();
        pp.setName("小红");
        pp.setAge(22);
        System.out.println(pp.getName() + ", " + pp.getAge());
        pp.eat();
        pp.teach();
        pp.speak();

        System.out.println("--------------------------");

        BasketballCoach bb = new BasketballCoach();
        bb.setName("姚明");
        bb.setAge(30);
        System.out.println(bb.getName() + ", " + bb.getAge());
        bb.eat();
        bb.teach();
    }
}
