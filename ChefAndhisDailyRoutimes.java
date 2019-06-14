import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChefAndhisDailyRoutimes{
    public static void main(String[] args) throws NumberFormatException,IOException{
	 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     int t=Integer.parseInt(br.readLine());
     while(t-->0){
    	 int i=0;
    	 String s=br.readLine();
    	 //char[] arr=s.toCharArray();
    	 boolean flag=true;
         for(;i<s.length()-1;){
        	if(s.charAt(i)=='E'&&s.charAt(i+1)=='C'){
        		flag=false;
        		break;
        	}
        	if(s.charAt(i)=='S'&&s.charAt(i+1)=='C')
        		flag=false;        	    
        	    break;
         }
        if(flag)
        	System.out.println("yes");
        else
        	System.out.println("no");
     }
   }
}
