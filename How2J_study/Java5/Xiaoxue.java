package How2J_study.Java5;

public class Xiaoxue {
    public static void main(String[] args){
         /*
        a + b = 8
        +   +
        c - d = 6
        ‖   ‖
        14  10
     */
    int a;
    int b;
    int c;
    int d;
    for (a=0;a<15;a++){
        for (b=0;b<15;b++){
            for (c=0;c<15;c++){
                for (d=0;d<15;d++){
                    if (a+b==8 && a+c==14 && b+d==10 && c-d==6){
                        System.out.println(a);
                        System.out.println(b);
                        System.out.println(c);
                        System.out.println(d);
                    }
                }
            }
        }
    }
    }
}
