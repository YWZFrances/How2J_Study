package How2J_study.Java7.charactor;

public class Support extends Hero{
    public void heal(){
        System.out.println("没有人被"+name+"治疗。。。");
    }
    public void heal(Hero... heros){
        for (int i=0;i<heros.length;i++){
            System.out.println(heros[i].name+"的血量是"+heros[i].hp);
            heros[i].hp+=quntizhiliao;
            System.out.println(name+"治疗了"+heros[i].name+"群体治疗"+quntizhiliao+"点！！");
            System.out.println("治疗之后"+heros[i].name+"的血量是"+heros[i].hp);
        }
    }
    public void heal(Hero heros,int dannai){
        System.out.println(name+"治疗了"+heros.name+"单体治疗"+dantizhiliao+"点！！");
        heros.hp+=dantizhiliao;
        System.out.println("治疗之后"+heros.name+"的血量是"+heros.hp);
    }
    public static void main(String[] args){
        Support dj = new Support();
        Support tianshi = new Support();
        dj.name = "卢西奥";
        dj.quntizhiliao = 100;
        tianshi.name = "天使";
        tianshi.dantizhiliao = 1000;

        Hero qiliu = new Hero();
        Hero luba = new Hero();
        qiliu.name = "士兵七十六";
        qiliu.hp = 1000;
        luba.name = "路霸";
        luba.hp = 2000;
        dj.heal();
        dj.heal(qiliu);
        dj.heal(luba);
        tianshi.heal();
        tianshi.heal(qiliu,tianshi.dantizhiliao);
    }
}
