package How2J_study.Java8.HeroType;

import How2J_study.Java8.Interface.AP;
import How2J_study.Java8.Interface.Mortal;
import How2J_study.Java8.ParentClass.Hero;

public class APHero extends Hero implements AP,Mortal {
    public void magicAttack() {
        System.out.println("进行魔法攻击");
    }
    public void die(){
        System.out.println(name+"魔法英雄死掉了");
    }
}
