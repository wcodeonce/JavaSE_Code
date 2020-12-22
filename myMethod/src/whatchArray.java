/**
 * @Author/ junjie
 * @Description/ //TODO $
 * @Date/ $ $
 * @Param/ $
 * @return/ $
 */

public class whatchArray {
    public static void main(String[] args) {

        /*需求:设计一个方法用于数组遍历,要求遍历的结果是在一行上的。
        例如: [11, 22, 33, 44, 55]*/

        //定义一个数组,用静态初始化完成数组元素初始化
        int[] arr = {11, 22, 33, 44, 55};

        //调用方法
        printArray(arr);

    }
/*    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
    }*/
    public static void printArray(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length-1){
                System.out.print(arr[i]);
            }else {
                System.out.print(arr[i] + ",");
            }
        }
        System.out.println("]");
    }

}
