import java.util.*;
import java.lang.annotation.*;
public class Project {
    public static void main(String []args) {
        Scanner in=new Scanner(System.in);
        String s=new String();
        s=in.next();
        int count=1;
        for(int i=0;i<s.length()-1;i++){
                if(Integer.parseInt(s.substring(i,i+2))<=26) {
                    count++;
                }
        }
        for(int i=0;i<s.length();i++){
            if(s.length()<4){
                break;
            }
            if(i+4<s.length()) {
                if (Integer.parseInt(s.substring(i, i + 2)) <= 26 && Integer.parseInt(s.substring(i + 2, i + 4)) <= 26) {
                    count++;
                }
            }
        }
        System.out.print(count);


    }

}

