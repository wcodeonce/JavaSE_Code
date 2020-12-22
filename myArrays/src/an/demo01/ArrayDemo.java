package an.demo01;

/**
 * @Author HTH
 * @Date 2020/12/6
 */

/*
 **冒泡排序:**
 * 一种排序的方式,对要进行排序的数据中相邻的数据进行两两比较,将将达的数据放在后面,
 * 依次对所有的数据进行操作,直至所有数据按照要求完成排序
 */

public class ArrayDemo {
    public static void main(String[] args) {
        //定义一个数组
        int[] arr = {24, 69, 80, 57, 13};
        System.out.println("排序前: " + arrayToString(arr));

        /*
        //第一次比较
        for (int i = 0; i < arr.length-1-0; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        System.out.println("第一次比较后: " + arrayToString(arr));

        //第二次比较
        for (int i = 0; i < arr.length-1-1; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        System.out.println("第二次比较后: " + arrayToString(arr));

        //第三次比较
        for (int i = 0; i < arr.length-1-2; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        System.out.println("第三次比较后: " + arrayToString(arr));

        //第四次比较
        for (int i = 0; i < arr.length-1-3; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        System.out.println("第四次比较后: " + arrayToString(arr));

         */

        //用两个for循环完成冒泡排序
        for (int x = 0; x < arr.length-1; x++) {
            for (int i = 0; i < arr.length - 1 - x; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        System.out.println("排序后: " + arrayToString(arr));



    }

    //把数组中的元素按照指定的规则组成一个字符串: [元素1, 元素2, ...]
    public static String arrayToString(int[] arr) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                sb.append(arr[i]);
            } else {
                sb.append(arr[i]).append(", ");
            }
        }
        sb.append("]");
        String s = sb.toString();
        return s;
    }
}
