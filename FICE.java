import java.util.*;
class FICE{
	public static long fact(int k,int m){
		long a=0;long b=1;long c=0;
		for(int i=2;i<=k;i++){
				c=(a%m+b%m)%m;
				a=b;
				b=c;
			}
		return 2*c;
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0){
			int n=sc.nextInt();
			int m=sc.nextInt();
			System.out.println(fact(n,m));
		}
		sc.close();
	}
}
