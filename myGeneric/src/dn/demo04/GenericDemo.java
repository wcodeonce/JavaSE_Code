package dn.demo04;

/**
 * @Author HTH
 * @Date 2020/12/22
 */

/*
    测试类
 */

public class GenericDemo {
    public static void main(String[] args) {

        Generic<String> g1 = new GenericImpl<String>();
        g1.show("大雄");

        Generic<Integer> g2 = new GenericImpl<Integer>();
        g2.show(18);

    }
}
