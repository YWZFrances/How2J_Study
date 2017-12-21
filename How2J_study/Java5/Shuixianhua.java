package How2J_study.Java5;

public class Shuixianhua {
    public static void main(String[] args){
        for (int shuixian = 100;shuixian<=999;shuixian++){
            int baiwei = shuixian/100;
            int shiwei = (shuixian%100)/10;
            int gewei = shuixian%10;
            if (shuixian == baiwei*baiwei*baiwei + shiwei*shiwei*shiwei + gewei*gewei*gewei){
                System.out.println(shuixian);
            }
        }
    }
}
