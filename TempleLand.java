import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class TempleLand {
      public static void main(String[] args) throws NumberFormatException,IOException{
    		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    	    int S=Integer.parseInt(br.readLine());
            while(S-->0){
            	int Ni=Integer.parseInt(br.readLine());
              	String[] s=br.readLine().split(" ");
              	int[] arr=new int[Ni];
              	for(int i=0;i<Ni;i++)
              		arr[i]=Integer.parseInt(s[i]);
              	boolean ans1=true,ans2=true;
              	if(arr[0]==1){
              		for(int i=0;i<Ni-1;i++){
              		if(Math.abs(arr[i]-arr[i+1])!=1)
              			ans1=false;
              		}
              	}
              	else
              		ans1=false;
              	for(int i=0,j=arr.length-1;i<=arr.length/2;i++,j--){
              		if(arr[i]!=arr[j]){
              		   ans2=false;
              		   break;
              		   }
              	}
              	if(ans1&&ans2)
              		System.out.println("yes");
              	else
              		System.out.println("no");
              	}
	}

}
