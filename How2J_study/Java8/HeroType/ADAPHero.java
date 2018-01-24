package How2J_study.Java8.HeroType;

import How2J_study.Java8.Interface.AD;
import How2J_study.Java8.Interface.AP;
import How2J_study.Java8.Interface.Mortal;
import How2J_study.Java8.ParentClass.Hero;

public class ADAPHero extends Hero implements AD,AP,Mortal{
    @Override
    public void magicAttack() {
        System.out.println("进行魔法攻击");
    }

    @Override
    public void physicAttack() {
        System.out.println("进行物理攻击");
    }
    @Override
    public void die(){
        System.out.println(this.name+"物理魔法英雄死掉了");
    }
}
