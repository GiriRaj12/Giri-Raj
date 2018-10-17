import java.util.*;
import java.lang.annotation.*;
public class Project {
    public static void main(String []args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter Seat number");
        int n=in.nextInt();
        if(n==1||n%8==1){
            System.out.println(n+"->"+" "+"Lower Birth");
        }
        if(n==2||n%8==2){
            System.out.println(n+"->"+" "+"Middle Birth");
        }
        if(n==3||n%8==3){
            System.out.println(n+"->"+" "+"Upper Birth");
        }
        if(n==4||n%8==4){
            System.out.println(n+"->"+" "+"Upper Birth");
        }
        if(n==5||n%8==5){
            System.out.println(n+"->"+" "+"Middle Birth");
        }
        if(n==6||n%8==6){
            System.out.println(n+"->"+" "+"Lower Birth");
        }
        if(n==7||n%8==7){
            System.out.println(n+"->"+" "+"Side Lower");
        }
        if(n==8||n%8==0){
            System.out.println(n+"->"+"Side Upper");
        }
    }

}
