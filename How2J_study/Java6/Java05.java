package How2J_study.Java6;

public class Java05 {
    public static void main(String[] args){
        int[] a = new int[]{11,22,33,44,55};
        int max = a[0];
        for (int each : a){
            if (each > max){
                max = each;
            }
        }
        System.out.println(max);
    }
}
