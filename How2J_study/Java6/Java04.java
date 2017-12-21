package How2J_study.Java6;

import java.util.Arrays;

public class Java04 {
    public static void main(String[] args) {
        int values [] = new int[]{18,62,68,82,65,9};
        //常规遍历
        for (int i = 0; i < values.length; i++) {
            int each = values[i];
//            System.out.println(each);
        }
        System.out.println(Arrays.toString(values));
        //增强型for循环遍历
        for (int each : values) {
            System.out.println(each);
        }

    }
}
