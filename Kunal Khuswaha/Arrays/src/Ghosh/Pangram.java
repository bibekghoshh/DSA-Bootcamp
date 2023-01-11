package Ghosh;

import java.util.Arrays;

public class Pangram {
    public static void main(String[] args) {
        String sentence="thequickbrownfoxjumpsoverthelazydog";
        int l=sentence.length(),count=1;

        char[] ch=new char[l];
        int k=l;

        for(int i=0;i<l;i++){
            char c=sentence.charAt(i);
            ch[i]=c;
        }
        int j=0;
        Arrays.sort(ch);
        for (int i = 0; i < l-1; i++) {
            if(ch[i]!=ch[i+1]){
                ch[j++]=ch[i];
                count++;
            }
        }
        if(count==26){
            System.out.println("true");
        }else {
            System.out.println("false"+count);
        }
        }
    }

