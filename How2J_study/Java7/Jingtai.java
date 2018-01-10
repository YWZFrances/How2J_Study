package How2J_study.Java7;

public class Jingtai {
    public String name; //实例属性，对象属性，非静态属性
    protected float hp;
    static String copyright;//类属性,静态属性

    public static void main(String[] args) {
        Jingtai garen =  new Jingtai();
        garen.name = "盖伦";

        Jingtai.copyright = "版权由Riot Games公司所有";

        System.out.println(garen.name);
        System.out.println(garen.copyright);

        Jingtai teemo =  new Jingtai();
        teemo.name = "提莫";
        System.out.println(teemo.name);
        System.out.println(teemo.copyright);

        garen.copyright = "Blizzard Entertainment Enterprise";
        System.out.println(teemo.copyright);
        System.out.println(garen.copyright);

    }
}
