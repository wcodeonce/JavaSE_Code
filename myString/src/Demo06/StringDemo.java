package Demo06;

/**
 * @Author/ junjie
 * @Description/ //TODO $
 * @Date/ $ $
 * @Param/ $
 * @return/ $
 */

//需求:
// 定义一个方法,把int数组中的数据按照指定的格式拼接成一个字符串返回
// 调用该方法并在控制台输出结果。
// 例如,数组为int[] arr = {1,2,3};,执行方法后的输出结果为[1, 2, 3]

public class StringDemo {
    public static void main(String[] args) {

        //定义一个int类型的数组, 用静态初始化完成数组元素的初始化
        int[] arr = {1, 2, 3};

        //调用方法,用一个变量接收结果
        String s = arrayToString(arr);

        //输出结果
        System.out.println("s: " + s);

    }

    //定义一个方法,用于把int数组中的数据按照指定格式拼接成一个字符串返回,
    // 返回值类型 String, 参数列表 int[] arr
    /*
        两个明确:
            返回值类型: String
            参数: int[] arr
    */
    public static String arrayToString(int[] arr) {
        //在方法中遍历数组,按要求进行拼接
        String s = "";

        s += "[";

        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                s += arr[i];
            } else {
                s += arr[i];
                s += ", ";
            }
        }

        s += "]";

        return s;
    }

}
