package How2J_study.Java6;


import java.util.Arrays;

public class Java01 {
    public static void main(String[] args) {
//        int[] a;
//        a = new int[5];
//        int[] b = new int[10];
//        a[0] = 1;
//        a[1] = 2;
//        a[2] = 3;
//        a[3] = 4;
//        a[4] = 5;
//        System.out.println(a.length);
//        System.out.println(b.length);
        int[] a = new int[5];
        int temp = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 100);
//            System.out.println(a[i]);
        }
        for (int j = 0; j < a.length - 1; j++) {
            for (int k = 0; k < a.length - 1 -j; k++) {
                if (a[k] > a[k+1]) {
                    temp = a[k];
                    a[k] = a[k+1];
                    a[k+1] = temp;

                }

            }
        }
        for (int i = 0; i < a.length; i++) {
//            a[i] = (int) (Math.random() * 100);
            System.out.println(a[i]);
        }
        System.out.println(Arrays.toString(a));
        System.out.println("最小值是"+a[0]);
    }
}
