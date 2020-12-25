package bn.demo02;

/**
 * @Author WTIHK
 * @Date 2020/12/25
 */

/*
    需求：
        用递归求5的阶乘，并把结果在控制台输出

    分析：
        1.阶乘：一个正整数的阶乘是所有小于等于概述的正整数的积，自然数n的阶乘写作n!
            5! = 5*4*3*2*1
        2.递归出口：1! = 1
        3.递归规则：n! = n * (n-1)!
            5! = 5 * 4!

    思路：
        1.定义一个方法，用于递归求阶乘，参数为一个int类型的变量
        2.在方法内部判断该变量的值是否为1
            是：返回1
            不是：返回n*(n-1)!
        3.调用方法
        4.输出结果
 */

public class DiGuiDemo01 {
    public static void main(String[] args) {
        //调用方法
        int result = jc(5);

        //输出结果
        System.out.println("5的阶乘是:" + result);

    }

    //定义一个方法，用于递归求阶乘，参数为一个int类型的变量
    public static int jc(int n) {
        //在方法内部判断该变量的值是否为1
        if (n == 1) {
            return 1;//是：返回1
        } else {
            return n * jc(n - 1);//不是：返回n*(n-1)!
        }
    }
}
