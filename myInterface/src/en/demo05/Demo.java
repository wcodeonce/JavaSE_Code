package en.demo05;

public class Demo {

/*
	需求：
		我们现在有乒乓球运动员和篮球运动员，丘乓球教练和篮球教练。为了出国交流，跟乒乓球相关的人员都需要学习英语。
		请用所学知识分析，这个案例中有哪些具体类，哪些抽象类，哪些接口，并用代码实现
*/
/*
    分析：从具体到抽象
         乒乓球运动员
         篮球运动员
         乒乓球教练
         发篮球教练
     实现：从抽象到具体
     使用: 使用的是具体的类的对象
 */
/*
    思路:
        1. 定义说英语的接口                   成员方法: 说英语();
        2. 定义抽象人类                      成员变量: 姓名,年龄;构造方法:无参,带参;成员方法: get/set方法, 吃饭();
        3. 定义抽象教练类,继承人类             构造方法: 无参,带参;成员方法: 教();
        4. 定义抽象运动员类,继承人类           构造方法: 无参,带参;成员方法: 学习();
        5. 定义具体篮球教练类,继承教练类         构造方法: 无参,带参;成员方法: 重写吃饭(){...};
        6. 定义具体乒乓球教练类,继承教练类,实现说英语接口
            构造方法: 无参,带参; 成员方法: 重写吃饭(){...}, 重写教(){...}, 重写说英语(){...}
        7. 定义具体篮球运动员类, 继承运动员类    构造方法:无参,带参;成员方法: 重写吃饭(){...}, 重写学习(){...}
        8. 定义具体乒乓球运动员类: 继承运动员类, 实现英语接口
            构造方法: 无参,带参; 成员方法: 重写吃饭(){...}, 重写学习(){...}, 重写说英语(){...}
        9. 定义测试类, 写代码测试
 */

}