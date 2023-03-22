package Array;

public class MaxInArray {
    public static void main(String[] args) {
        int findMax[]={34,65,78,23,54,87,9,0,34};
        int Max=findMax[0];
        
        for (int i = 0; i < findMax.length; i++) {
            if(Max<findMax[i]){
                Max=findMax[i];
            }
        }
        System.out.println(Max);
    }
}
