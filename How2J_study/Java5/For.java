package How2J_study.Java5;

import java.util.Scanner;

public class For {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("要钱几天了？");
        int day = s.nextInt();
        int sum = 0;
        for (int i = 1;i<=day;i++){
            sum = sum+1*(1 << (i-1));
        }
        System.out.println("要了"+day+"天，赚了"+sum);
    }
}
