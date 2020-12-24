package an.demo01;

/**
 * @Author HTH
 * @Date 2020/12/10
 */

/*
    方法: 是将具有独立功能的 代码块 组织成为一个整体，使其具有特殊功能的 代码集

    定义格式:
        public static void 方法名() {
            //方法体
        }

    调用格式:
        方法名();

 */

public class MethodDemo {
    public static void main(String[] args) {
        //调用方法
        isEvenNumber(5);
        isEvenNumber(6);
    }

    //需求:定义一个方法,在方法中定义一个变量,判断该数据是否是偶数
    public static void isEvenNumber(int a) {
//        int a = 13;
        if (a % 2 == 0) {
            System.out.println(a + "是一个偶数");
        } else {
            System.out.println(a + "是一个奇数");
        }
    }
}
