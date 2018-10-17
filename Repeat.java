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
        int b[]=new int[10];
        for(int i=0;i<n;i++){
            b[a[i]]++;
        }
        for(int i=0;i<10;i++){
            if(b[i]==1){
                System.out.print(i+" ");
            }
        }

    }

}
