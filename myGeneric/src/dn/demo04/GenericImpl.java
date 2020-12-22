package dn.demo04;

/**
 * @Author HTH
 * @Date 2020/12/22
 */

/*
    泛型接口实现类
 */

public class GenericImpl<T> implements Generic<T> {
    //重写泛型接口里面的show()方法
    @Override
    public void show(T t) {
        System.out.println(t);
    }
}
