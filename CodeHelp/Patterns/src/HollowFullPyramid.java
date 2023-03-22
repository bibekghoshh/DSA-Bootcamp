public class HollowFullPyramid {
    public static void main(String[] args) {

        int num=6;

        for (int i = 0; i < num; i++) {
            int k=0;
            for (int j = 0; j < num*2-1; j++) {
                if(j<num-i-1){
                    System.out.print(" ");
                } else if (k<i*2+1) {
                    System.out.print("*");
                    k++;
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
