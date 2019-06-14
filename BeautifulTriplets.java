import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class BeautifulTriplets{
        public static void main(String[] args) throws NumberFormatException,IOException{
    	BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
    	Scanner scan=new Scanner(System.in);
    	String s[]=br.readLine().split(" ");
    	int n=Integer.parseInt(s[0]);
    	int d=Integer.parseInt(s[1]);
    	int count=0;
    	String s1[]=br.readLine().split(" ");
    	int[] num=new int[10000];
    	for(int i=0;i<n;i++)
    		num[i]=Integer.parseInt(s1[i]);
    	for(int i=0;i<n-2;i++){
    		for(int j=i+1;j<n-1;j++){
    			if(num[j]-num[i] == d){
    			for(int k=j+1;k<n;k++){
    				if((num[k]-num[j])==d)
    					count++;
    			}
    		    }
    		}
    	}
		System.out.println(count);
		scan.close();
		}
}
