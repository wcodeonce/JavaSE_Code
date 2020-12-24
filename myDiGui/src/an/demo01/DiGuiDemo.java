package an.demo01;

/**
 * @Author WTIHK
 * @Date 2020/12/24
 */

/*
    递归概述：
        以编程的角度来看，递归指的是方法定义中调用方法本身的现象
 */

public class DiGuiDemo {
    public static void main(String[] args) {

        //回顾不死神兔问题，求第二十个月兔子的对数
        //每个月的兔子对数：1,1,2,3,5,8,...
        int[] arr = new int[20];

        arr[0] = 1;
        arr[1] = 1;

        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        System.out.println(arr[19]);

        System.out.println(f(20));

    }

    /*
        递归解决问题，首先就是要定义一个方法
            定义一个方法f(n):表示第n个月的兔子对数
            那么,第n-1个月的兔子对数该如何表示？f（n-1）
            同理,第n-2个月的兔子对数该如何表示？f（n-2）

        StackOverflowError
     */
    public static int f(int n) {
//        return f(n - 1) + f(n - 2);
        if (n ==1 || n ==2) {
            return 1;
        } else {
            return f(n -1) + f(n-2);
        }
    }

}
