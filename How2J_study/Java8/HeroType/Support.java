package How2J_study.Java8.HeroType;

import How2J_study.Java8.Interface.Healer;
import How2J_study.Java8.Interface.Mortal;
import How2J_study.Java8.ParentClass.Hero;

public class Support extends Hero implements Healer,Mortal {
    public void heal(){
        System.out.println("治疗");
    }
    public void die(){
        System.out.println(name+"辅助英雄死掉了");
    }
}
