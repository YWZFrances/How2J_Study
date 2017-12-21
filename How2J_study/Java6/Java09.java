package How2J_study.Java6;

import java.util.Arrays;

public class Java09 {
    public static void main(String[] args) {
        int[][] a = new int[5][6];
//        int x = a.length;
//        int y = a[0].length;
//        System.out.println(x  +"   "+  y);
        int[] b = new int[30];
        int len = a[0].length;
        int temp = 0;
        for (int i=0;i<a.length;i++){
            for (int j=0;j<a[0].length;j++){
                a[i][j] = (int)(Math.random()*100);
            }
        }
        for (int i=0;i<a.length;i++){
            if (i<=0){
                System.arraycopy(a[i],0,b,0,len);
            }else {
                System.arraycopy(a[i],0,b,i*len-1,len);
            }
        }
        Arrays.sort(b);
        System.out.println(Arrays.toString(b));
    }
}

