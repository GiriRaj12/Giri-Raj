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
        int count=0;
        for(int i=0;i<n;i++){
            if(a[i]==i){
                count++;
                System.out.print(a[i]);
            }
        }
        if(count==0){
            System.out.print(-1);
        }
       
    }

}
