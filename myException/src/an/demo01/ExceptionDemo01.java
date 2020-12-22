package an.demo01;

/**
 * @Author HTH
 * @Date 2020/12/14
 */

/*
    异常
 */

public class ExceptionDemo01 {
    public static void main(String[] args) {
        method();
    }

    public static void method() {
        int[] arr = {1, 2, 3};
//        System.out.println(arr[1]);

        //ArrayIndexOutOfBoundsException - 索引越界异常
//        System.out.println(arr[3]);
        System.out.println(arr[2]);

    }
 }
