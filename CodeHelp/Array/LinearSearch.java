package Array;

public class LinearSearch {
    public static void main(String[] args) {
        int a[]={34,65,324,12,43,67,87,1};
        
        int find=2;
        int i;
        for (i = 0; i < a.length; i++) {
            if (a[i]==find) {
                System.out.println(find+" is Present");
                break;
            }
        }
        if(i==a.length){
            System.out.println("Not Found");
        }
    }
}
