package How2J_study.Java5;

public class Touzi {
    public static void main(String[] args){
        double Fmoney = 0;
        int Pmoney = 12000;
        double lilv = 0.2;
        int year;
//        F = p* ( (1+r)^n );
//        while (Fmoney)
        for (year = 1;year<1000;year++){
            Fmoney = (Fmoney+Pmoney)*(1+lilv);
            if (Fmoney >= 1000000){
                break;
            }
        }
        System.out.println(year);
    }
}
