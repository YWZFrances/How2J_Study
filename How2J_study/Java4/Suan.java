package How2J_study.Java4;

public class Suan {
    public static void main(String[] args){
        int i = 1;
        boolean b = !(i++ == 3) ^ (i++ ==2) && (i++==3);
        System.out.println(b);
        System.out.println(i);
    }
}
