package Demo07;

public class Zi extends FU {

    //报错,父类中的私有方法子类中无法访问到,无法重写
    /*
    @Override
    private void show() {
        System.out.println("Zi中的show() 方法被调用");
    }
     */

    /*
    @Override
    public void method() {
        System.out.println("Zi中method() 方法被调用");
    }
     */

    @Override
    void method() {
        System.out.println("Zi中method() 方法被调用");
    }

}
