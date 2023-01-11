package stringg;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        String name="hello World";

        Scanner in=new Scanner(System.in);

            String a=in.nextLine();
            int i=0;

            for(i=0;i<a.length();i++){
                if(a.charAt(i)=='a'){
                    break;
                }
            }
            String s=a;
            if(i==a.length()) System.out.println("fuck off");
            else {
                 s = a.substring(0, (i)) + a.substring(i + 1);
          }
        System.out.println(s);
    }
}
