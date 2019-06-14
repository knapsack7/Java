import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class PatternCount{
	    public static void main(String[] args) throws NumberFormatException,IOException{
	      	 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	         int Q=Integer.parseInt(br.readLine());
	         while(Q-->0){
	        	 String s1=br.readLine();
	        	 String[] s=s1.split("[0]+");
	        	 int count=0;
	        	 //System.out.println(s1);
	        	 for(int i=0;i<s1.length()-1;i++){
	        		 if(s1.charAt(i)=='1'&&s1.charAt(i+1)=='1')
	        			 count++;
	        	 }
	        	 s1="";
	        	 //System.out.println(count);
	        	 for(int i=0;i<s.length;i++)
	        		 s1+=s[i];
	        	 int count1=0;
	        	 for(int i=0;i<s1.length()-1;i++){
	        		 if(s1.charAt(i)==s1.charAt(i+1))
	        			 count1++;
	        	 }
	        	 //System.out.println(count1);
	        	 System.out.println(count1-count);
	         }
        }
}
