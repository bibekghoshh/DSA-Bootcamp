package Ghosh;

import java.util.Arrays;

public class MatrixDialonal {
    public static void main(String[] args) {

        int[][] mat = {{1,1,1,1}, {1,1,1,1}, {1,1,1,1},{1,1,1,1}};
        int n = mat.length;
        int[] num = new int[2 * n];
        int k = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j <= i; j++) {
                num[k] = mat[i][j];
                k++;
            }
        }
        System.out.println(Arrays.toString(num));
        System.out.println(k);
            int p=n-1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j<1; j++) {
                if(i!=p){
                num[k] = mat[i][p];
                k++;}
                p--;
            }
        }
        System.out.println(Arrays.toString(num));
        int total=0;
        for(int i=0;i<2*n;i++){
            total=total+num[i];
        }
        System.out.println(Arrays.toString(num));
        System.out.println(total);
    }
}