package Ghosh;

import java.util.Arrays;

public class ImageFlip {
    public static void main(String[] args) {
        int[][] image={{1,1,0},{1,0,1},{0,0,0}};

        int n=image.length;
        int m=image[0].length;
        int[][] rev=new int[n][m];

        for (int i = 0; i < n; i++) {
            int k=0;
            for (int j = m-1; j>=0; j--) {
                rev[i][j]=image[i][k];
                k++;
                if(rev[i][j]==1){
                    rev[i][j]=0;
                }else {
                    rev[i][j]=1;
                }
            }
        }
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//
//            }
//        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(rev[i][j]+" ");
            }
        }
    }
}
