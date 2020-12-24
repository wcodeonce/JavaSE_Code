package bn.demo02;

/**
 * @Author HTH
 * @Date 2020/12/10
 */

/*
    需求:
        设计一个方法用于打印两个数中的较大数，数据来来自于方法参数
    思路:
        1.定义一个方法，用于打印两个数字中的较大值，例如 getMax()
        2.为方法定义两个参数，用于接收两个数字
        3.使用分支语句分两种情况对两个数字的大小关系进行处理
        4.在 main () 方法中调用定义好的方法（使用常量）
        5.在 main() 方法中调用定义好的方法（使用变量）
 */

public class MethodTest {
    public static void main(String[] args) {
        isEvenNumber(10, 20);
    }
    public static void isEvenNumber(int a, int b) {
        if ( a > b) {
            System.out.println("a > b");
        } else {
            System.out.println("a < b");
        }
    }

}
