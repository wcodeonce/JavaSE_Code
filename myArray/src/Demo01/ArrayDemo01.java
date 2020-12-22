package Demo01;

/**
 * @Author/ junjie
 * @Description/ //TODO $
 * @Date/ $ $
 * @Param/ $
 * @return/ $
 */

public class ArrayDemo01 {
    public static void main(String[] args) {

        //定义数组
        int[] arr = {1, 2, 3};

        //输出数组
        System.out.println(arr);

        //输出数组中的元素
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        //索引越界
        //ArrayIndexOutOfBoundsException
        int[] arr1 = new int[3];

        //System.out.println(arr1[3]);

        //空指针
        //NullPointerException
        arr1 = null;
        //System.out.println(arr1[0]);

        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
            System.out.println(arr[i]);

        }





    }
}
