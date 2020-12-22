/**
 * @Author/ junjie
 * @Description/ //TODO $
 * @Date/ $ $
 * @Param/ $
 * @return/ $
 */

public class DebugTesk02 {
    //逢七过
    public static void main(String[] args) {
        //数据在1~100 之间,用for循环实现数据的获取

        for (int i = 0; i <= 100; i++) {
            if (i%10 == 7 || i/10%10 == 7 || i%7 ==0)
            {
                //输出数据
                System.out.println(i);
            }
        }
    }
}
