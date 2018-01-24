package How2J_study.Java8.ParentClass;

import How2J_study.Java8.ItemType.LifePotion;
import How2J_study.Java8.ItemType.MagicPotion;

public class Item {
    String name;
    int price;

    public void buy(){
        System.out.println("购买");
    }
    public void effect() {
        System.out.println("物品使用后，可以有效果");
    }
    public static void main(String[] args) {
//        Item i = new Item();
//        i.effect();
//
//        LifePotion lp =new LifePotion();
//        lp.effect();
//
//        MagicPotion mp = new MagicPotion();
//        mp.effect();
        Item i1 = new MagicPotion();
        i1.effect();
        Item i2 = new LifePotion();
        i2.effect();
    }
}
