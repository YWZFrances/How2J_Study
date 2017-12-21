package How2J_study.Java5;

public class Pass35 {
    public static void main(String[] args){
        for (int i=1;i<=100;i++){
            if (i%3 == 0){
                continue;
            }else if (i%5 == 0){
                continue;
            }else {
                System.out.println(i);
            }
        }
    }
}
