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
        Arrays.sort(a);
        int count=0;
        for(int i=0;i<n;i++){
            if(a[i]==0){
                count++;
            }
        }
        if(count==n){
            System.out.print(0);
        }
        else{
            for(int i=0;i<n;i++){
                System.out.print((a[n-1])-i);
            }
        }
    }

}

