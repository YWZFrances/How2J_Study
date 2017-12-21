package How2J_study.Java5;

import java.util.Scanner;

public class BMI {
    public  static void main(String[] args){
        Scanner yue = new Scanner(System.in);
//        Scanner tizhong = new Scanner(System.in);
        double shengao = yue.nextDouble();
        System.out.println("身高是"+shengao+"  (m)");
        double tizhong = yue.nextDouble();
        System.out.println("体重是"+tizhong+"  (kg)");
        double bmi = tizhong/(shengao*shengao);
        System.out.println("BMI是"+bmi);
        System.out.println(bmi<18.5?"过轻":bmi>=18.5 && bmi<24?"正常":bmi>=24 && bmi<27?"过重":"胖");
    }
}
