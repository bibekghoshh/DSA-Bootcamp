package practice;

public class Demi {
    public static void main(String[] args) {

    String str=new String("Sakkett");
    int count=0;
        char[] chars=str.toCharArray();
        for(int i=0;i<str.length();i++){
            for(int j=0;j<str.length(); j++){
                if(chars[i]==chars[j]){
                    System.out.println(chars[j]);
                    count++;
                    break;
                }
            }
        }
    }
}
