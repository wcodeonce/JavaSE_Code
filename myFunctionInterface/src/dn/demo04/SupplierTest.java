package dn.demo04;

import java.util.function.Supplier;

/**
 * @Author WTIHK
 * @Date 2021/2/2
 */

/*
    定义一个类（SupplierTest），在类中提供两个方法
        一个方法是：int getMax(Supplier<Integer> sup)：用于返回一个int数组中的最大值
        一个方法是主方法，在主方法中调用 getMax方法
 */

public class SupplierTest {
    public static void main(String[] args) {

        //定义一个int数组
        int[] arr = {19, 50, 28, 36, 44};

        //在主方法中调用 getMax方法
        int maxValue = getMax(() -> {
            int max = arr[0];
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
            return max;
        });

        //输出结果
        System.out.println(maxValue);

    }

    private static int getMax(Supplier<Integer> sup) {
        return sup.get();
    }

}
