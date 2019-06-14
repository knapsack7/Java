import java.util.*;
import java.math.*;
public class FibonacciModified{
	public static void main(String[] args) {
        int i,n;
        BigInteger a,b;
        Scanner scan=new Scanner(System.in);
        a=scan.nextBigInteger();
        b=scan.nextBigInteger();
        n=scan.nextInt();
        BigInteger[] val = new BigInteger[n];
        val[0]=a;
        val[1]=b;
        for(i=2;i<n;i++){
            val[i]= (val[i-1].pow(2)).add(val[i-2]);
        }
        System.out.println(val[i-1]);
        scan.close();
    } 
}