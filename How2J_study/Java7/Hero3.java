package How2J_study.Java7;

public class Hero3 {

    String name; //姓名

    float hp; //血量

    float armor; //护甲

    int moveSpeed; //移动速度

    public Hero3(){

    }

    public Hero3(String name,float hp){
        this.name = name;
        this.hp = hp;
    }

    //复活
    public void revive(Hero3 h){
        h = new Hero3("提莫",386);
//        this.name=h.name;
        this.hp=h.hp;
    }

    public static void main(String[] args) {
        Hero3 teemo =  new Hero3("提莫",383);

        //受到400伤害，挂了
        teemo.hp = teemo.hp - 400;

        teemo.revive(teemo);

        System.out.println(teemo.hp);

    }

}

