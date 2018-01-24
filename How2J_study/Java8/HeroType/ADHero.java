package How2J_study.Java8.HeroType;

import How2J_study.Java8.Interface.AD;
import How2J_study.Java8.Interface.Mortal;
import How2J_study.Java8.ParentClass.Hero;

public class ADHero extends Hero implements AD,Mortal {
    public void physicAttack(){
        System.out.println("进行物理攻击");
    }
    public void die(){
        System.out.println(name+"物理英雄死掉了");
    }
}
