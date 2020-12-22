/**
 * @Author/ junjie
 * @Description/ //TODO $
 * @Date/ $ $
 * @Param/ $
 * @return/ $
 */


//需求:
// 已知个数组arr={19,28,37,46,50}用程序实现把数组中的元素值交换,
// 交换后的数组arr={50,46,37,28,19};并在控制台输出交换后的数组元素。

public class Test08 {
    public static void main(String[] args) {
        //1.定义一个数组,用静态初始化完成数组元素的初始化
        int[] arr = {19, 28, 37, 46, 50};

        //调用反转的方法
        reverse(arr);

        //4.遍历数组
        printArray(arr);


    }
    //遍历数组的方法
    public static void printArray(int arr[])
    {
        System.out.print("[");

        for (int x = 0; x < arr.length; x++) {
            if (x ==arr.length -1){
                System.out.print(arr[x]);
            }else {
                System.out.print(arr[x] + ", ");
            }
        }
        System.out.println("]");
    }

    //反转数组的方法
    public static void reverse(int[] arr)
    {
        //2.循环遍历数组,这一次初始化语句定义两个索引变量,判断条件是开始索引小于结束索引
        for (int start = 0, end=arr.length-1; start <= end; start++,end--) {
            //3.变量交换
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
    }


}
