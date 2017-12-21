package How2J_study.Java6;

import java.util.Arrays;

public class Java02 {
    public static void main(String[] args){
        int[] a = new int[]{11,22,33,44,55};
        int[] b = new int[a.length];
        for (int x=a.length-1;x>=0;x--){
                b[(a.length-1)-x] = a[x];
        }
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
}
