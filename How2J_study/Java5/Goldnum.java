package How2J_study.Java5;

public class Goldnum {
    public static void main(String[] args){
//        double shuixian;
//        final double gold = 0.618;
//        double cha;
//        double min = 1;
//        for (int i=1;i<20;i++){
//            for (int j=1;j<20;j++){
//                if (i%2 == 0 && j%2==0){
//                    continue;
//                }
//                double num = i/j;
//                if (num > gold){
//                    cha = num-gold;
//                }else{
//                    cha = gold - num;
//                }
//                if (min > cha){
//                    min = cha;
//                }else {
//                    min = min;
//                }
//                System.out.println(num);
//                System.out.println(i+"   /   "+j);
//            }
//        }
//    }
        float x = 0;
        float a = 1;
        float b = 1;
        //分母取值范围
        for (float i=1;i < 20; i++) {
            //分子取值范围
            for (float j=1;j < 20; j++) {
                //不能同时为偶数
                if(i <= j || (i%2==0&&j%2==0)){
                    break;
                }
                //取绝对值，判断最接近值
                if(Math.abs(j/i - 0.618) < Math.abs(x - 0.618)){
                    x = j/i;
                    a=i;
                    b=j;
                }
            }
        }
        System.out.println("a="+a+" b="+b+" a/b="+x);
    }
}
