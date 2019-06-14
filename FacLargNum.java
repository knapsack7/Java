import java.util.Scanner;
public class FacLargNum {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int T=sc.nextInt();
    while(T-->0){
    	int m=1,temp=0,x=0;
    	int[] ans=new int[200];
    	ans[0]=1;
    	int num=sc.nextInt();
    	for(int i=1;i<=num;i++){
    		for(int j=0;j<m ;j++){
                x=ans[j]*i+temp;
    			ans[j]=x%10;
    			temp=x/10;
    		}
            while(temp>0){
                ans[m]=temp%10;
    			temp/=10;
    			m++;
    		}
    	}
       for(int i=m-1;i>=0;i--)
    	   System.out.print(ans[i]);
       System.out.println();
       }
    sc.close();
    }
}
