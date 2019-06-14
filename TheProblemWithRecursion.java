import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class TheProblemWithRecursion{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int q=Integer.parseInt(br.readLine());
        while(q-->0){
            String s[]=br.readLine().split(" ");
            int n=Integer.parseInt(s[0]);
            int m=Integer.parseInt(s[1]);
           System.out.println(solve(n,m));
        }
    }
    public static long solve(long n,long m){
        long f0=0;
        long f1=1;
        if(n==0)return 0;
        if(n==1)return 1%m;
        long f2=0;
        for(int i=2;i<=n;i++){
            f2=((f1%m+f0%m)%m+(i-1)%m)%m;
            f0=f1%m;
            f1=f2%m;
        }
       return f2;
    }
}