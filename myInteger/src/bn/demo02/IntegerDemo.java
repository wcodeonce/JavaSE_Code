package bn.demo02;

/**
 * @Author HTH
 * @Date 2020/12/8
 */

/*
    #### Integer的构造方法

| 方法名                       | 说明                                        |
| --------------------------- | ------------------------------------------- |
| public Integer (int value)  | 根据 int 值创建 Integer 对象**（过时）**    |
| public Integer (String str) | 根据 String 值创建 Integer 对象**（过时）** |

#### 静态方法获取对象

| 方法名                                      | 说明                                 |
| ------------------------------------------ | ------------------------------------ |
| public static Integer valueOf (int i)      | 返回表示指定的 int 值的 Integer 实例 |
| public static Integer valueOf (String str) | 返回一个保存指定值的 Integer 对象    |
 */

public class IntegerDemo {
    public static void main(String[] args) {
        //public Integer (int value) 根据int值创建Integer对象（过时）
        Integer i1 = new Integer(100);  //过时方法,不建议使用
        System.out.println(i1);

        //Integer (String str)根据String值创建Integer对象（过时）
        Integer i2 = new Integer("100");    //过时方法,不建议使用
//        Integer i2 = new Integer("abc");
        System.out.println(i2);

        //上面构造方法方法过时不建议使用
        System.out.println("---------------------------------------");

        //public static Integer valueOf (int i)  返回表示指定的int值的Integer实例
        Integer i3 = Integer.valueOf(100);
        System.out.println(i3);

        //public static Integer valueOf (String str) 返回一个保存指定值的Integer对象
        Integer i4 = Integer.valueOf("100");
//        Integer i4 = Integer.valueOf("abc");
        System.out.println(i4);

    }
}
