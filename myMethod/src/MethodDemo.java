/**
 * @Author/ junjie
 * @Description/ //TODO $
 * @Date/ $ $
 * @Param/ $
 * @return/ $
 */

public class MethodDemo {
    public static void main(String[] args) {

        //调用isEvenNumber方法
        isEvenNumber();

    }

    //定义一个方法
    public static void isEvenNumber(){
        //定义变量
        int number = 10;

        //判断该数据是否是偶数
        if (number%2 == 0)
        {
            System.out.println(true);
        }
        else
        {
            System.out.println(false);
        }
    }

}
