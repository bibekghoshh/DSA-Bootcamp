package TwoDArray;

import java.util.Arrays;

public class RowSum {
    public static void main(String[] args) {
        int[][] b={{3,2,1,4},{5,6},{7,8,9}};
        int[] sum= new int[b.length];
        // System.out.println(b[2].length);
        // System.out.println(b.length);

        for (int i = 0; i < b.length; i++) {
            int result=0;
            for (int j = 0; j < b[i].length; j++) {
                result=result+b[i][j];
            }
            sum[i]=result;
        }
        System.out.println(Arrays.toString(sum));
    }
}
