package dn.demo04;

import java.util.Scanner;

/**
 * @Author HTH
 * @Date 2020/12/15
 */

public class TeacherTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入分数:");
        int score = sc.nextInt();

        Teacher t = new Teacher();
        try {
            t.checkScore(score);
        } catch (ScoreException e) {
            e.printStackTrace();
        }
    }
}
