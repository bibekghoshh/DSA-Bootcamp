package Patterns;

public class Pattterns {
    public static void main(String[] args) {
        pattern4(5);
    }
    static void pattern4(int n){
        for (int i = 1; i<=n; i++) {
            for (int j = 1; j<=i ; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    static void pattern3(int n){
        for (int i = 0; i < n; i++) {
            for (int j = n-i; j >0 ; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
