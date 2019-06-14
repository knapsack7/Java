import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Pangrams{
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	     String s=br.readLine();
	     String s1=s.toLowerCase();
	     int[] chcnt=new int[26];
	     for(int i=0;i<s1.length();i++)
	    	if(s1.charAt(i)!=' ') 
	    	chcnt[s1.charAt(i)-97]++;
	     boolean all=true;
	     for(int i=0;i<26;i++){
	    	 if(chcnt[i]==0){
	    		 all=false;
	    		 break;
	    		 }
	     }
	     for(int i:chcnt)
	    	 System.out.print(i+" ");
	     System.out.println();
	     if(all)
	    	 System.out.println("pangram");
	     else
	    	 System.out.println("not pangram");
	 }

}
