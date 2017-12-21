package How2J_study.Java5;

public class breakout {
    public static void main(String[] args){
        boolean breakout = false;
        for (int i=1;i<10;i++){
            for (int j=1;j<10;j++){
                System.out.println(i*j);
                if (j%2 ==0){
                    breakout = true;
                    break;
                }
            }
            if (breakout){
                break;
            }
        }
    }
}
