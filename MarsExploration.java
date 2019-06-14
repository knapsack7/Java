import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class MarsExploration{
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	     String s=br.readLine();
	     int count=0;
	     for(int i=0;i<s.length();i=i+3){
	    	 if(s.charAt(i)!='S')
	    		 count++;
	    	 if(s.charAt(i+1)!='O')
	    		 count++;
	    	 if(s.charAt(i+2)!='S')
	    		 count++;
	     }
	     System.out.println(count);
	}
}