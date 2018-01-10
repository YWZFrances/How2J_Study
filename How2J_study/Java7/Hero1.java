package How2J_study.Java7;

import How2J_study.Java2.Hero;

public class Hero1 {
    String name;
    int hp;
    boolean yuanjin;
    int gold;

   public Hero1(String heroName,int heroHp,boolean heroYuanjin,int heroGold){
       name = heroName;
       hp = heroHp;
       yuanjin = heroYuanjin;
       gold = heroGold;
//       System.out.println("我是没有参数也没有返回值的构造方法");
    }
    public void print(){
        String gongji;
        if (yuanjin = true){
            gongji = "近程攻击";
        }else {
            gongji = "远程攻击";
        }
        System.out.println("这个英雄名字是"+name+"，有"+hp+"血，是"+gongji+"，只要"+gold+"金币");
    }
    public static void main(String[] args){
        Hero1 h1 = new Hero1("盖伦",5000,true,6300);
        Hero1 h2 = new Hero1("timo",1000,false,3150);
        Hero1 h3 = new Hero1("女警",2000,false,4800);
        h1.print();
        h2.print();
        h3.print();
    }

}

