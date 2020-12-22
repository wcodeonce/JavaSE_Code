package cn.demo03;

/**
 * @Author HTH
 * @Date 2020/12/22
 */

/*
    测试类
 */

public class GenericDemo {
    public static void main(String[] args) {
/*

        Generic g = new Generic();
        g.show("大雄");
        g.show(18);
        g.show(true);
//        g.show(12.12);
*/
        /*
        //泛型类改进后可以在创建对象的时候明确传入参数类型
        Generic g1 = new Generic<String>();
        g1.show("胖虎");

        Generic g2 = new Generic<Integer>();
        g2.show(20);

        Generic g3 = new Generic<Boolean>();
        g3.show(true);

        //
        Generic g4 = new Generic<Double>();
        g4.show(12.12);
        */

        //泛型方法改进
        Generic g = new Generic();
        g.show("静香");
        g.show(19);
        g.show(true);
        g.show(12.12);
        g.show(12.23f);



    }
}
