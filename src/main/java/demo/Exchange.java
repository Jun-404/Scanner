package demo;

import java.util.Scanner;

public class Exchange {
    public static void main(String[] args) {

        Scanner hoiafhfbaibgiuae = new Scanner(System.in);

        System.out.println("输出互换前手中的纸牌:");
        System.out.print("左手中的纸牌:");
        int first = hoiafhfbaibgiuae.nextInt();
        System.out.print("有手中的纸牌:");
        int second = hoiafhfbaibgiuae.nextInt();

        System.out.println("输出互换后手中的纸牌:");
        System.out.println("左手中的纸牌:"+second);
        System.out.println("有手中的纸牌:"+first);


    }
}
