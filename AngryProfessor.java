import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class AngryProfessor{
	public static void main(String[] args)throws NumberFormatException,IOException{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int n=Integer.parseInt(br.readLine());
	while(n-->0){
		String st[]=br.readLine().split(" ");
		int num=Integer.parseInt(st[0]);
		int thresh=Integer.parseInt(st[1]);
		String str[]=br.readLine().split(" ");
		int early=0;
		int arr[]=new int[num];
		for(int i=0;i<num;i++){ 
			arr[i]=Integer.parseInt(str[i]);
			if(arr[i]<=0)
				early++;
		}
	    if(early>=thresh)
			System.out.println("NO");
	    else
	    	System.out.println("YES");
	    }
     }
 }
 
