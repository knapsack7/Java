import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.BitSet;
public class PrimeGenerator{
	public static BitSet primes(final int MAX){
	BitSet primes=new BitSet(MAX);
	for(int i=3;i<=MAX;i+=2)
	primes.set(i);
	primes.set(2,true);
	for(int i=3;i<=MAX;i+=2){
		if(primes.get(i)){
		  int j=3*i;
		  while(j<=MAX){
			  if(primes.get(j))
			  primes.set(j,false);
			  j +=(2*i);
		  }
		}
	}
	return primes;
}
public static void main(String[] args) throws NumberFormatException,IOException{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int t=Integer.parseInt(br.readLine());
    while(t-->0){
    String[] s=br.readLine().split(" ");
    int n1=Integer.parseInt(s[0]);
    int n2=Integer.parseInt(s[1]);
    BitSet num=new BitSet(n2);
    num=primes(n2);
    if(n1==1)
    	n1++;
    for(int i=n1;i<=num.length();i++)
    if(num.get(i)==true)
    	System.out.println(i);
	}
 }
}