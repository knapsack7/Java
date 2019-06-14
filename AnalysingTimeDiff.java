import java.math.BigInteger;
public class AnalysingTimeDiff{
	public static BigInteger factUsingIte(int N){
        BigInteger b=new BigInteger("1");
        for(int i=2;i<=N;i++)
            b=b.multiply(BigInteger.valueOf(i));
         return b;
    }
	public static BigInteger factUsingRec(int N){
        if(N==1)
        	return BigInteger.ONE;
        else
        	return (BigInteger.valueOf(N)).multiply(factUsingRec(N-1));
    }
	public static void main(String[] args) {
		int n=10;
		long t1=System.currentTimeMillis();
		BigInteger ans=factUsingIte(n);
		long t2=System.currentTimeMillis();
		System.out.println("factorial of "+n+" is "+ans+" and Time Taken by Iterative Method is "+(t2-t1)+" milliseconds");
        System.out.println();
		t1=System.currentTimeMillis();
		ans=factUsingRec(n);
		t2=System.currentTimeMillis();
		System.out.println("factorial of "+n+" is "+ans+" and Time Taken by Recursive Method is "+(t2-t1)+" milliseconds");
    }
}
