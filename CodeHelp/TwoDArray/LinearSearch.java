package TwoDArray;

public class LinearSearch {
    public static void main(String[] args) {
        int[][] a={{3,4,6},{1,2,7},{9,8,5}};
            int find=51;
            boolean flag=false;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if(find==a[i][j]){
                    flag=true;
                    break;
                }
            }
        }
        if(flag){
            System.out.println("Found");
        }else{
            System.out.println("Not Found");
        }
    }

    
}
