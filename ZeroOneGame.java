import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class ZeroOneGame{
    static int[] num=new int[1000000];
    public static void delete(int add,int size){
    	for(int k=add;k<size-1;k++){
    		num[k]=num[k+1];
    	}
    }
    public static void main(String[] args) throws NumberFormatException,IOException{
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    int G=Integer.parseInt(br.readLine());
	    while(G-->0){
	    	int no=Integer.parseInt(br.readLine());
	    	String[] s=br.readLine().split(" ");
	    	for(int i=0;i<no;i++)
	    		num[i]=Integer.parseInt(s[i]);
	    	int loop=0;
	    	boolean enter=false;
	    	for(int i=1;i<no-1-loop;){
	    		if(i==1)
	    			enter=false;
	    		if(num[i-1]==0&&num[i+1]==0){
	    			delete(i,no-loop);
	    			loop++;
	    			enter=true;
	    			i=1;
	    		}
	    		if(enter==false)
	    			i++;
	    	}
	    	//System.out.println(loop);
	    	//for(int i=0;i<no-loop;i++)
	    	//System.out.print(num[i]+" ");
	    	if(loop%2==0)
	    		System.out.println("Bob");
	    	else
	    		System.out.println("Alice");
	    }
    }
}