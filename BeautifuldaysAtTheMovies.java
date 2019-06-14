import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class BeautifuldaysAtTheMovies{
	public static void main(String[] args) throws NumberFormatException,IOException{
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     String[] s=br.readLine().split(" ");
     int i=Integer.parseInt(s[0]);
     int j=Integer.parseInt(s[1]);
     int k=Integer.parseInt(s[2]);
     int count=0;
     int m=j-i+1;
     for(int l=0;l<m;l++){
    	 int temp=reverse(i);
    	 if(Math.abs(i-temp)%k==0)
    		 count++;
    	 i++;
     }
    System.out.println(count);	
	}
	public static int reverse(int num){
		int reverse=0,rem=0;
		while(num>0){
			rem =num%10;
			reverse=reverse*10+rem;
			num =num/10;
		}
	    return reverse;
	}

}
