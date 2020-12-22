package bn.demo02;

public class Outer {

    private int num = 10;
    /*不常见写法
    public class Inner {
        public void show() {
            System.out.println(num);
        }
    }
     */

    private class Inner {
        public void show() {
            System.out.println(num);
        }
    }

    public void method() {
        Inner i = new Inner();
        i.show();
    }


}
