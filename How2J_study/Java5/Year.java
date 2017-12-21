package How2J_study.Java5;

import java.util.Scanner;

public class Year {
    public static void main(String[] args){
        Scanner yue = new Scanner(System.in);
        System.out.println("请输入年份：");
        int year = yue.nextInt();
        if ((year%4==0 && year%100!=0) || year%400==0){
            System.out.println("是");
        }else {
            System.out.println("不是");
        }
    }
}
