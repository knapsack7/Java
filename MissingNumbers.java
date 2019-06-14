import java.util.*;
public class MissingNumbers{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int[] CountA=new int[1000010];
        int[] CountB=new int[1000010];
        int n=scan.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=scan.nextInt();
            CountA[a[i]]++;
        }
        int m=scan.nextInt();
        int[] b=new int[m];
        for(int i=0;i<m;i++){
            b[i]=scan.nextInt();
            CountB[b[i]]++;
        }
        for(int i=1;i<=1000010;i++){
            if(CountB[i]>CountA[i] )
                System.out.printf("%d ",i);
        }
        System.out.println();
        scan.close();    
    }
}