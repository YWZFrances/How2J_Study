package How2J_study.Java5;

import java.util.Scanner;

public class Month {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int month = s.nextInt();
        switch ((month-2)/3){
            case 0:
                System.out.println("春");
                break;
            case 1:
                System.out.println("春");
                break;
            case 2:
                System.out.println("秋");
                break;
            case 3:
                System.out.println("冬");
                break;
                default:
                    System.out.println("你骗我");
        }
    }
}
