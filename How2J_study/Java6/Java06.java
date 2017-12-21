package How2J_study.Java6;

import java.util.Arrays;

public class Java06 {
    public static void main(String[] args){
        int[] a = new int[]{11,22,33,44,55,66,77};
        int[] b = new int[3];
        System.arraycopy(a,0,b,0,3);
        System.out.println(Arrays.toString(b));
    }
}
