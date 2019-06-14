import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;
public class SeiveOfEratosthenes{
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number upto which you want to know prime numbers:");
        int n=Integer.parseInt(br.readLine());
        boolean num[]=new boolean[n+1];
        long lStartTime= new Date().getTime(); // end time
        for(int i=1;i<n+1;i++)
        num[i]=true;
        for(int k=2;k*k<=n;k++){
        	if(num[k]==true){
        		for(int i=k*2;i<=n;i+=k)
                num[i]=false;}
        }
        for(int i=2;i<=n;i++){
        if(num[i]==true)
        System.out.print(i+" ");}
        long lEndTime = new Date().getTime(); // end time
        long difference = lEndTime - lStartTime; // check difference
        System.out.println("\nElapsed milliseconds:"+difference);}
}