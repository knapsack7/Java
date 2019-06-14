import java.io.IOException;
import java.util.Scanner;
public class DrawingBook{
	public static int fromBeggining(int n,int p){
		int count=0;
		int a=2,b=3;
		if(p==1||p==0)
			return count;
		else{
			while(a!=p&&b!=p){
				a=a+2;
				b=b+2;
				count++;
			}
        return count+1;
		}
	}
	public static int fromBehind(int n,int p){
		int count=0;
		if(n%2==0){
	    int a=n-1,b=n-2;
	    if(n==p)
	    	 return count;
	     else{
	    	 while(a!=p&&b!=p){
	    		 a =a-2;
	    		 b =b-2;
	    		 count++;
	    	 }
	    	 return count+1;
	     }
	   }
	   else{
		 int a=n,b=n-1;
		 while(a!=p&&b!=p){
   		 a =a-2;
   		 b =b-2;
   		count++;
	}
	return count;
	}
 }
	public static void main(String[] args) throws IOException,NumberFormatException{
    Scanner scan=new Scanner(System.in);
    int n=scan.nextInt();
    int p=scan.nextInt();
    int ans1,ans2;
    ans1=fromBeggining(n,p);
    ans2=fromBehind(n,p);
    if(ans1<=ans2){
    	if(ans1<0)
    	System.out.println(0);
    	else
    	System.out.println(ans1);
    }
    else{
    	if(ans2<0)
    	System.out.println(0);
    	else
    	System.out.println(ans2);
    }
	scan.close();
	}
}
