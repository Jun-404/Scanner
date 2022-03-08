package demo;

import java.util.Scanner;

public class Pay06 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("请输入4位会员卡号");
        String name = input.next();
        int name1 = Integer.parseInt(String.valueOf(name.charAt(0)));
        int name2 = Integer.parseInt(String.valueOf(name.charAt(1)));
        int name3 = Integer.parseInt(String.valueOf(name.charAt(2)));
        int name4 = Integer.parseInt(String.valueOf(name.charAt(3)));
        boolean C = (name1+name2+name3+name4) > 20;
        int M = name1 + name2 + name3 + name4;
        System.out.println("会员卡号"+name1+name2+name3+name4+"各位之和: "+ M);
        System.out.print("是幸运客户吗?");
        System.out.println(C);

    }

}
