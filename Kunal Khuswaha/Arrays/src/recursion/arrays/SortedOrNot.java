package recursion.arrays;

public class SortedOrNot {
    public static void main(String[] args) {
        int[] arr={1,2,7,9,45,36};
        System.out.println(sorted(arr,0));
    }

    static boolean sorted(int[] a,int index){
        if(index==a.length-1) return true;

        return a[index]<a[index+1] && sorted(a,index+1);
    }
}

