import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Triplets {
	public static int mod=1000000007;
      public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Integer T=Integer.parseInt(br.readLine());
        while(T-->0){
        	String[] s=br.readLine().split(" ");
        	int Asize=Integer.parseInt(s[0]);
        	int Bsize=Integer.parseInt(s[1]);
        	int Csize=Integer.parseInt(s[2]);
        	long[] Aarr=new long[Asize];
        	long[] Barr=new long[Bsize];
        	long[] Carr=new long[Csize];
        	String[] s1=br.readLine().split(" ");
        	for(int i=0;i<Asize;i++)
        		Aarr[i]=Long.parseLong(s1[i]);
        	String[] s2=br.readLine().split(" ");
        	for(int i=0;i<Bsize;i++)
        		Barr[i]=Long.parseLong(s2[i]);
        	String[] s3=br.readLine().split(" ");
        	for(int i=0;i<Csize;i++)
        		Carr[i]=Long.parseLong(s3[i]);
        	long p=0,q=0,r=0,big=0;
        	for(int i=0;i<Asize;i++){
        		for(int j=0;j<Bsize;j++){
        			for(int k=0;k<Csize;k++){
        				p=Aarr[i];
        				q=Barr[j];
        				r=Carr[k];
        				if(p<=q&&q>=r){
        					big=(big%mod+((p+q)%mod*(q+r)%mod)%mod)%mod;
        				}
        			}
        		}
        	}
        	System.out.println(big%mod);
        	}
	}
}
