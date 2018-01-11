package How2J_study.Java7;

import com.sun.javafx.sg.prism.NGParallelCamera;

public class Hero5 {
    String name;
    int hp;
    private Hero5(){

    }

    //准备一个类属性，指向一个实例化对象。 因为是类属性，所以只有一个

    private static Hero5 gold = new Hero5();

    //public static 方法，提供给调用者获取12行定义的对象
//    饿汉式
    public static Hero5 getGold(){
        return gold;
    }
//    懒汉式
//    public static GiantDragon getInstance(){
//        //第一次访问的时候，发现instance没有指向任何对象，这时实例化一个对象
//        if(null==instance){
//            instance = new GiantDragon();
//        }
//        //返回 instance指向的对象
//        return instance;
//    }

}