import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class REVADD {
	static int removeLeadingZeroes(int n) {
		  while(n%10==0){
			  n/=10;
		  }
		  return n;
		}
	public static void main(String[] args) throws NumberFormatException,IOException{
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    int T=Integer.parseInt(br.readLine());
	    while(T-->0){
	    	int a,b,c;
	    	String[] in=br.readLine().split(" ");
	    	String sa=in[0];
	    	String sb=in[1];
	    	StringBuffer sba=new StringBuffer(sa);
	    	StringBuffer sbb=new StringBuffer(sb);
	    	sba.reverse();
	    	sbb.reverse();
	    	sa=sba.toString();
	    	sb=sbb.toString();
	    	a=Integer.parseInt(sa);
	    	a=removeLeadingZeroes(a);
	    	b=Integer.parseInt(sb);
	    	b=removeLeadingZeroes(b);
	    	c=a+b;
	    	String sc=Integer.toString(c);
	    	StringBuffer sbc=new StringBuffer(sc);
	    	sbc.reverse();
	    	sc=sbc.toString();
	    	c=Integer.parseInt(sc);
	    	c=removeLeadingZeroes(c);
	    	System.out.println(c);
	    }
	}

}
