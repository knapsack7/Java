import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class TaumAndBday{
	public static void main(String[]args) throws NumberFormatException,IOException{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int t=Integer.parseInt(br.readLine());
    Long black,white,bprice,wprice,cprice;
    while(t-->0){
    	long total=0;
    	String s1[]=br.readLine().split(" ");
        String s2[]=br.readLine().split(" ");
    	black=Long.parseLong(s1[0]);
    	white=Long.parseLong(s1[1]);
    	bprice=Long.parseLong(s2[0]);
    	wprice=Long.parseLong(s2[1]);
    	cprice=Long.parseLong(s2[2]);
    	Long temp=0L;
    	total=black*bprice+white*wprice;
    	if(bprice<=wprice)
    		temp=bprice;
    	else
    		temp=wprice;
    	if((temp+cprice)<=bprice)
    		total=black*(temp+cprice)+white*wprice;
    	if((temp+cprice)<=wprice)
    		total=white*(temp+cprice)+black*bprice;
    	System.out.println(total);
    	}
	}
}