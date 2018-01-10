package How2J_study.Java7;

public class Hero2 {
    String name;
    int hp;
    boolean yuanjin;
    int gold;

    public Hero2(String name, int hp){
        this.name = name;
        this.hp = hp;
    }
    public Hero2(String name, int hp,boolean yuanjin, int gold){
        this(name,hp);
        this.yuanjin = yuanjin;
        this.gold = gold;
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
        Hero2 h1 = new Hero2("寒冰",5000,true,6300);
        Hero2 h2 = new Hero2("盲僧",1000,false,3150);
        Hero2 h3 = new Hero2("亚索",2000,false,4800);
        h1.print();
        h2.print();
        h3.print();
    }
}
