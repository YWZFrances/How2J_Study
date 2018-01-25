package How2J_study.Java8.ParentClass;

import How2J_study.Java8.HeroType.ADAPHero;
import How2J_study.Java8.HeroType.ADHero;
import How2J_study.Java8.HeroType.APHero;
import How2J_study.Java8.HeroType.Support;
import How2J_study.Java8.Interface.Mortal;

public class Hero {
    public String name;
    int hp;
    float armor;
    int moveSpeed;
    int  gold;
    String Camp;//阵营

    public void kill(Mortal m){
        System.out.println(name + " 放了一个大招:德玛西亚正义！！！！！！！！！！！！！！！！" );
        m.die();
    }

    public static void main(String[] args){
        Hero h1 = new Hero();
        ADHero ad = new ADHero();
        APHero ap = new APHero();
        ADAPHero adap = new ADAPHero();
        Support sup = new Support();

        h1.name = "诺克";
        ad.name = "EZ";
        ap.name = "莫甘娜";
        adap.name = "王牌飞行员";
        sup.name = "风女";


        h1.kill(ad);
        h1.kill(ap);
        h1.kill(adap);
        h1.kill(sup);

    }
}
