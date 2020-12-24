package bn.demo02;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @Author WTIHK
 * @Date 2020/12/24
 */

/*
    需求:
        通过程序实现斗地主过程中的洗牌,发牌和看牌
    思路:
        1.创建一个牌盒,也就是定义一个集合对象,用ArrayList集合实现
        2.往牌盒里面装牌
        3.洗牌,也就是把牌打乱,用Collections的shuffle()方法实现
        4.发牌,也就是遍历集合,给三个玩家发牌
        5.看牌,也就是三个玩家分别遍历自己的牌
 */

public class PokerDemo {
    public static void main(String[] args) {

        //创建一个牌盒,也就是定义一个集合对象,用ArrayList集合实现
        ArrayList<String> array = new ArrayList<String>();

        //往牌盒里面装牌
        /*
            ♦2,♦3,♦4,...♦K,♦A
            ♣2,...
            ♥2,...
            ♠2,...
            小王, 大王
         */

        //定义花色数组
        String[] colors = {"♦", "♣", "♥", "♠"};

        //定义点数数组
        String[] numbers = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

        for (String color : colors) {
            for (String number : numbers) {
                array.add(color + number);
            }
        }
        array.add("小王");
        array.add("大王");

        //洗牌,也就是把牌打乱,用Collections的shuffle()方法实现
        Collections.shuffle(array);

//        System.out.println(array);

        //发牌,也就是遍历集合,给三个玩家发牌
        //创建三个玩家和一组底牌
        ArrayList<String> user_1 = new ArrayList<String>();
        ArrayList<String> user_2 = new ArrayList<String>();
        ArrayList<String> user_3 = new ArrayList<String>();
        ArrayList<String> dpArray = new ArrayList<String>();

        for (int i = 0; i < array.size(); i++) {
            String poker = array.get(i);

            if (i >= array.size() - 3) {
                //如果是最后三张牌放到底牌
                dpArray.add(poker);
            } else if (i % 3 == 0) {
                user_1.add(poker);//玩家1
            } else if (i % 3 == 1) {
                user_2.add(poker);//玩家2
            } else if (i % 3 == 2) {
                user_3.add(poker);//玩家3
            }

        }


        //看牌,也就是三个玩家分别遍历自己的牌
        lookPoker("大雄", user_1);
        lookPoker("静香", user_2);
        lookPoker("胖虎", user_3);
        lookPoker("底牌", dpArray);

    }
    //看牌方法
    public static void lookPoker(String name, ArrayList<String> array) {
        System.out.print(name + "的牌是:");
        for (String poker : array) {
            System.out.print(poker + " ");
        }
        System.out.println();
    }
}
