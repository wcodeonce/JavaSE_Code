/**
 * @Author/ junjie
 * @Description/ //TODO $
 * @Date/ $ $
 * @Param/ $
 * @return/ $
 */

//需求:
//    有一对兔子,从出生后第3个月起每个月都生一对兔子,
//    小兔子长到第三个月后每个月又生对兔子
//    假如兔子都不死,问第二十个月的兔子对数为多少?

//规律:
//从第三个数据开始,每一个数据是前两个数据之和。
//第1个,第2个数据是已知的。

public class Test03 {
    public static void main(String[] args) {
        //定义一个数组
        //动态初始化完成对数组元素的初始化,长度为20
        int[] arr = new int[20];

        //
        arr[0] = 1;
        arr[1] = 1;

        //用for循环实现计算每个月的兔子数量
        for (int i = 2; i < 20; i++) {
            arr[i] = arr[i-2] + arr[i-1];
            /*
                arr[2] = arr[0] + arr[1];
                arr[3] = arr[1] + arr[2];
                arr[4] = arr[2] + arr[3];
                ...
             */
        }
        System.out.println("第20个月兔子的个数是: " + arr[19]);
    }

}
