package Demo01;

/**
 * @Author/ junjie
 * @Description/ //TODO $
 * @Date/ $ $
 * @Param/ $
 * @return/ $
 */

public class ArrayDemo02 {
    public static void main(String[] args) {

        //定义一个数组
        int[] arr = {12, 45, 54, 34, 30};

        //定义保存最值的变量

        int max = arr[0];
        int min = arr[0];

        //for循环遍历数组
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max)
            {
                max = arr[i];
            }
            if (arr[i] < min)
            {
                min = arr[i];
            }
        }

        //输出
        System.out.println("数组最大值: "+max);
        System.out.println("数组最小值: "+min);

    }
}
