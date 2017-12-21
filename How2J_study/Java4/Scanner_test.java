package How2J_study.Java4;
import java.util.Scanner;

public class Scanner_test {
    public  static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        System.out.println("第一个数"+a);
        int b = s.nextInt();
        System.out.println("第二个数"+b);
        float c = s.nextFloat();
        System.out.println("第3个数"+c);
        String rn = s.nextLine();
        String d = s.nextLine();
        System.out.println("第4个数"+ d);

    }
}
