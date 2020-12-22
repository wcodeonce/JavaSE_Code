import java.util.Scanner;

/**
 * @Author/ junjie
 * @Description/ //TODO $
 * @Date/ $ $
 * @Param/ $
 * @return/ $
 */

//需求:已知一个数组ar={19,28,37,46,50}键盘录入一个数据,
//  查找该数据在数组中的索引,
//  并在控制台输出找到的索引值。

public class Test07 {
    public static void main(String[] args) {

        //1.定义一个数组，用静态初始化完成数组元素的初始化
        int[] arr = {19, 28, 37, 46, 50};

        //2.键盘录入要查找的数据,用一个变量接收
        Scanner input = new Scanner(System.in);
        System.out.println("请输入要查找的数据: ");
        int number = input.nextInt();

        //调用方法
        int index = getIndex(arr, number);

        //6.输出索引变量
        System.out.println("index: " + index);
    }

    //查找指定的数据在数组中的索引
    public static int getIndex(int[] arr, int number)
    {
        //3.定义一个索引变量,初始值为-1
        int index = -1;

        //4.遍历数组,获取到数组中的每一个元素
        for (int i = 0; i < arr.length; i++) {
            //5.拿键盘录入的数据和数组中的每一个元素进行比较,如果值相同,九八该值对应的缩影赋值给索引变量,并结束循环
            if (arr[i] == number){
                index = i;
                break;
            }
        }
        return index;
    }
}
