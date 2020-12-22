import java.util.Scanner;

/**
 * @Author/ junjie
 * @Description/ //TODO $
 * @Date/ $ $
 * @Param/ $
 * @return/ $
 */

//需求:
// 在编程竞赛中,有6个评委为参賽的选手打分,分数为0-100的整数分
// 选手的最后得分为:去掉个最高分和个最低分后的4个评委平均值(不考虑小数部分)
    //思路
    //1.定义一个方法,用动态初始化完成数组元素的初始化,长度为6
    //2.键盘录入评委分数
    //3.由于是6个评委打分,所以,接收评委分数的操作,用循环改进
    //4.定义方法实现获取数组中的最高分(数组最大值),调用方法
    //5.定义方法实现获取数组中的最低分(数组最小值),调用方法
    //6.定义方法实现获取数组中的所有元素的和(数组元素求和),调用方法
    //7.按照计算规则进行计算得到平均分
    //8.输出平均数

public class Test09 {
    public static void main(String[] args) {

        //1.定义一个方法,用动态初始化完成数组元素的初始化,长度为6
        int[] arr = new int[6];

        //2.键盘录入评委分数 -- 使用循环改进
        //3.由于是6个评委打分,所以,接收评委分数的操作,用循环改进
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个评委的打分");
            arr[i] = input.nextInt();
        }

        //printArray(arr);

        //4.定义方法实现获取数组中的最高分(数组最大值),调用方法
        int max = getMax(arr);

        //5.定义方法实现获取数组中的最低分(数组最小值),调用方法
        int min = getMin(arr);

        //6.定义方法实现获取数组中的所有元素的和(数组元素求和),调用方法
        int sum = getsum(arr);

        //7.按照计算规则进行计算得到平均分
        int avg = (sum - max - min) / (arr.length -2);

        //8.输出平均数
        System.out.println("选手的最终得分是: " + avg);

    }

    //遍历数组的方法
    public static void printArray(int[] arr)
    {
        System.out.print("[");

        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length -1){
                System.out.print(arr[i]);
            }else {
                System.out.print(arr[i] + ", ");
            }
        }
        System.out.print("]");
    }

    //获取最大值的方法
    public static int getMax(int[] arr)
    {
        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    //获取最小值的方法
    public static int  getMin(int[] arr)
    {
        int min = arr[0];

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] < min){
                min = arr[j];
            }
        }
        return min;
    }

    //获的总分的方法
    public static int getsum(int[] arr)
    {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

}
