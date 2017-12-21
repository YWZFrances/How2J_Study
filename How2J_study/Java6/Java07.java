package How2J_study.Java6;

import java.util.Arrays;

public class Java07 {
    public static void main(String[] args){
        int[] a = new int[5];
        int[] b = new int[7];
        int[] c = new int[12];
        for (int i=0;i<a.length;i++){
            a[i] = (int)(Math.random()*10+1);
        }
        System.out.println(Arrays.toString(a));
        for (int i=0;i<b.length;i++){
            b[i] = (int)(Math.random()*10+1);
        }
        System.out.println(Arrays.toString(b));
        System.arraycopy(a,0,c,0,a.length);
        System.arraycopy(b,0,c,5,b.length);
        System.out.println(Arrays.toString(c));
    }
}
