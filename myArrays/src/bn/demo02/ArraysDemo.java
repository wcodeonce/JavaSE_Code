package bn.demo02;

import java.util.Arrays;

/**
 * @Author HTH
 * @Date 2020/12/6
 */

/*
**Arrays 类包含用于操作数组的各种方法**

| 方法名                                 | 说明                               |
| ------------------------------------- | ---------------------------------- |
| public static String ( int[]  arr )   | 返回指定数组的内容的字符串表示形式 |
| public static void sort ( int[] arr ) | 按照数字顺序排列指定的数组         |
 */

public class ArraysDemo {
    public static void main(String[] args) {
        //定义一个数组
        int[] arr = {24, 69, 80, 57, 13};

        System.out.println("排序前: " + Arrays.toString(arr));

        //Arrays.sort(arr);
        Arrays.sort(arr);

        System.out.println("排序后: " + Arrays.toString(arr));

    }
}
