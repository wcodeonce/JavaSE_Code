package cn.demo03;

/**
 * @Author HTH
 * @Date 2020/12/10
 */

/*
    需求:
        设计一个方法可以获取两个数的较大值，数据来自于参数
    思路:
        1.定义一个方法，用于获取两个数字中的较大值
        2.使用分支语句分两种情况对两个数字的大小关系进行处理
        3.根据题设分别设置两种情况下对应的返回值
        4.在 main() 方法中调用定义好的方法并用变量保存
        5.在 main() 方法中调用定义好的方法并直接打印结果
 */

public class MethodTest {
    public static void main(String[] args) {
        //在 main() 方法中调用定义好的方法并用变量保存
        int a = 33;
        int b = 99;

        int max = getMax(a, b);

        //输出结果
        System.out.println("两数中的较大值:"+max);

    }

    //定义一个方法，用于获取两个数字中的较大值
    public static int getMax(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

}
