package How2J_study.Java5;

import java.util.Scanner;

public class Jiecheng {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int Num = 1;
        while (num>0){
            Num = Num*num;
            num--;
        }
        System.out.println(Num);
    }
}
