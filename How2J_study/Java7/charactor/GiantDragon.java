package How2J_study.Java7.charactor;

public class GiantDragon {

//    什么是单例模式？

//    回答的时候，要答到三元素
//1. 构造方法私有化
//2. 静态属性指向实例
//3. public static的 getInstance方法，返回第二步的静态属性
//


    //私有化构造方法使得该类无法在外部通过new 进行实例化
    private GiantDragon(){

    }

    //准备一个类属性，指向一个实例化对象。 因为是类属性，所以只有一个

    private static GiantDragon instance = new GiantDragon();

    //public static 方法，提供给调用者获取12行定义的对象
//    饿汉式
    public static GiantDragon getInstance(){
        return instance;
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