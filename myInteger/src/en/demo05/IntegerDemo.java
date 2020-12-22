package en.demo05;

/**
 * @Author HTH
 * @Date 2020/12/8
 */
/*
    -  装箱：把基本数据类型转换为对应的包装类类型
    - 拆箱：把包装类类型转换为对应的基本数据类型
 */

public class IntegerDemo {
    public static void main(String[] args) {
        //装箱：把基本数据类型转换为对应的包装类类型
        Integer i = Integer.valueOf(100);   //装箱
        Integer ii = 100;   //自动装箱

        //拆箱：把包装类类型转换为对应的基本数据类型
        // ii += 200;
//        ii = ii.intValue() + 200;
        ii += 200;  //自动拆箱
        System.out.println(ii);

        Integer iii = null;
        if (ii != null) {
            iii += 300; //NullPointerException
        }

    }
}
