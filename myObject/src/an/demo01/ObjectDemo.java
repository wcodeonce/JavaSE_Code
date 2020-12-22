package an.demo01;
/*
    类Object是类层次结构的根。每个类都有Object作为超类。所以对象（包括数组）都实现了这个类的方法。
    所有类都直接或间接的继承自该类

    看方法源码：选中方法名，按下 Ctrl+B

    ToString（）方法建议所有子类重写此方法
    如何重写呢？自动生成即可
    Ctrl+Insist
    选择ToString()

 */
//隐藏继承自Object
public class ObjectDemo extends Object{
    public static void main(String[] args) {

        Student s = new Student();
        s.setName("小明");
        s.setAge(18);
        System.out.println(s);  //an.demo01.Student@7ef20235
        System.out.println(s.toString());   //an.demo01.Student@7ef20235

/*
    public void println(Object x) {
        String s = String.valueOf(x);
        if (getClass() == PrintStream.class) {
            // need to apply String.valueOf again since first invocation
            // might return null
            writeln(String.valueOf(s));
        } else {
            synchronized (this) {
                print(s);
                newLine();
            }
        }
    }

    public static String valueOf(Object obj) {
        return (obj == null) ? "null" : obj.toString();
    }

    public String toString() {
    return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }

*/

    }
}
