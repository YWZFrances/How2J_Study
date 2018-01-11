package How2J_study.Java7;

public class TestHero5 {
    public static void main(String[] args){
        Hero5 g1 = Hero5.getGold();
        Hero5 g2 = Hero5.getGold();
        Hero5 g3 = Hero5.getGold();
        g1.name = "GM1";
        g2.name = "GM2";

        //都是同一个对象
        System.out.println(g1==g2);
        System.out.println(g1==g3);
        System.out.println(g1.hp);
        System.out.println(g2.name);
    }
}
