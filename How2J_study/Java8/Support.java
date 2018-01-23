package How2J_study.Java8;

import How2J_study.Java8.Interface.Healer;

public class Support extends Hero implements Healer {
    public void heal(){
        System.out.println("治疗");
    }
}
