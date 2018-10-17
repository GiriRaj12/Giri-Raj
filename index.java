import java.util.*;
import java.lang.annotation.*;
public class Project {
    public static void main(String []args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=in.nextInt();
        }
        for(int i=0;i<n;i++){
            if(a[i]==i){
                System.out.print(a[i]);
            }
        }
       
    }

}
