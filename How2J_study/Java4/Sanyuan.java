package How2J_study.Java4;

import java.util.Scanner;

public class Sanyuan {
    public static void main(String[] args){
        Scanner day = new Scanner(System.in);
        int x = day.nextInt();
//        if (x>0 && x<8){
//            x<6?System.out.println("工作日"):System.out.println("周末");
//        }else{
//            System.out.println("请输入有效的数字1-7");
//        }
        System.out.println((x>=1 && x<=5)?"工作日":(x>=6 && x<=7)?"周末":"我感觉你骗我-。-");

    }
}
