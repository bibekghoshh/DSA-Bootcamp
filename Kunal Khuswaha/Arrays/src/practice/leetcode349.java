package practice;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leetcode349 {
    public static void main(String[] args) {
        int[] a={1,2,2,1},m={2,2};

        System.out.println(Arrays.toString(intersection(a,m)));
    }
    static int[] intersection(int[] nums1,int[] nums2){
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        List<Integer> ans=new ArrayList<>();
        int n1=nums1.length,n2=nums2.length;

        if(n1<n2){
            for(int i=0;i<n1;i++){
                for(int j=0;j<n2;j++){
                    if(nums1[i] == nums2[j]){
                        ans.add(nums1[i]);
                        break;
                    }
                }
            }
        }else{
            for(int i=0;i<n2;i++){
                for(int j=0;j<n1;j++){
                    if(nums2[i]==nums1[j]){
                        ans.add(nums2[i]);
                        break;
                    }
                }
            }
        }
        int ar=ans.size();
        int[] a=new int[ar];
        for(int i=0;i<ar;i++) {
            a[i]=ans.get(i);
        }
        //System.out.print(Arrays.toString(a));

        int j=0;
        for (int i=0;i<ar-1;++i){
            if(a[i]!=a[i+1]) {
                a[j++]=a[i];
            }
            a[j++]=a[ar-1];
        }

        return a;
    }
}
