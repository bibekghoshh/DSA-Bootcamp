package Ghosh;

import java.util.Arrays;

public class Altitude {
    public static void main(String[] args) {

       int[] gain = {-5,1,5,0,-7};

        int n=gain.length;
        int m=n+1;
        int[] g=new int[m];

        g[0]=0;
        g[1]=gain[0];
        for(int i=1;i<m-1;i++){
            g[i+1]=g[i]+gain[i];
        }
        int max=g[0];
        for (int i = 0; i < m; i++) {
            if(g[i]>max) {
            max=g[i];
            }
        }
        System.out.println(max);
        System.out.println(Arrays.toString(g));
    }
}
