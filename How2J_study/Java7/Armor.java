package How2J_study.Java7;


public class Armor extends Item{
    int ac;
    public static void main(String[] args){
        Armor bujia = new Armor();
        bujia.name = "布甲";
        bujia.price = 300;
        bujia.ac = 15;
        Armor suozijia = new Armor();
        suozijia.name = "锁子甲";
        suozijia.price = 500;
        suozijia.ac = 40;
        System.out.println(suozijia.name+"\t"+suozijia.price+"\t"+suozijia.ac);
        System.out.println(bujia.name+"\t"+bujia.price+"\t"+bujia.ac);
    }
}

