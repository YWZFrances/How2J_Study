package How2J_study.Java6;

import java.util.Arrays;

public class Java08 {
    public static void main(String[] args){
        int[][] a = new int[5][6];
//        int x = a.length;
//        int y = a[0].length;
//        System.out.println(x  +"   "+  y);
        int temp = 0;
        int max = 0;
        for (int i=0;i<a.length;i++){
            for (int j=0;j<a[0].length;j++){
                a[i][j] = (int)(Math.random()*100);
            }
        }
        for (int i=0;i<a.length;i++){
            for (int j=0;j<a[i].length;j++){
                for (int k=0;k<a[i].length-j-1;k++){
                    if (a[i][k] > a[i][k+1]){
                        temp = a[i][k];
                        a[i][k] = a[i][k+1];
                        a[i][k+1] = temp;
                        if(temp > max){
                            max = temp;
                        }
                    }
                }
            }
        }
        System.out.println(Arrays.deepToString(a));
        System.out.println(max);
    }
}
