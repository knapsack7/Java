import java.util.*;
public class SaveThePrisoner{
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t;
        t=sc.nextInt();
        while(t-->0){
            int n,m,s;
            n=sc.nextInt();
            m=sc.nextInt();
            s=sc.nextInt();
            m+=s-1;
            m%=n;
            if(m==0) System.out.println(n);
            else System.out.println(m);
             }
        sc.close();
    }
}