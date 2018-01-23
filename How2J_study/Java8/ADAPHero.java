package How2J_study.Java8;

import How2J_study.Java8.Interface.AD;
import How2J_study.Java8.Interface.AP;

public class ADAPHero extends Hero implements AD,AP{
    @Override
    public void magicAttack() {
        System.out.println("进行魔法攻击");
    }

    @Override
    public void physicAttack() {
        System.out.println("进行物理攻击");
    }
}
