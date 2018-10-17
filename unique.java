import java.util.*;
public class Project {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n=0;
        n=in.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=in.nextInt();
        }
        int count=0;
        int b[]=new int[9];
        for(int i=0;i<n;i++){
            b[a[i]]++;
        }
        for(int i=0;i<n;i++){
            if(b[i]>1){
                count++;
                System.out.print(i+" ");
            }
        }
        if(count==0){
            System.out.print("unique");
        }

    }
}
