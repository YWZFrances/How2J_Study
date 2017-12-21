package How2J_study.Java2;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

public class Hero {
    String name;
    int dengji;
    float xueliang;
    boolean xingbie;
    int jinbi;

    void keng(){
        System.out.println("坑我！！");
    }

    int getDengji(){
        return dengji;
    }

    void addjinbi(int qian){
        jinbi = jinbi+qian;
        System.out.println("增加了"+qian+"金币");
    }

    void legendray(){
        System.out.println("超神啦！！！");
    }

    float getXueliang(){
        return xueliang;
    }

    void recovery(float blood){
        xueliang = xueliang+blood;
        System.out.println("回血"+blood);
    }

    public static void main(String[] args){
        Hero gailun = new Hero();
        gailun.name = "盖伦";
        gailun.dengji = 19;
        gailun.xueliang = 12345.6f;
        gailun.xingbie = true;
        gailun.jinbi = 300;
        System.out.println(gailun.name+"现在的金币是"+gailun.jinbi+",现在的等级是"+gailun.dengji);
        gailun.addjinbi(1000);
        System.out.println(gailun.jinbi);
        System.out.println("然后他");
        gailun.keng();
        gailun.legendray();
        gailun.getXueliang();
        gailun.recovery(1313131.2f);
        gailun.getXueliang();
        System.out.println(gailun.xueliang);

    }
}
