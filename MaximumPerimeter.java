import java.util.Scanner;
public class MaximumPerimeter{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int arr[]=new int[n];
	int num[]=new int[3];
	for(int i=0;i<n;i++){
		arr[i]=sc.nextInt();
	}
	int max=0,a1,a2,a3,t1=0,t2=0,t3=0;
	for(int i=0;i<n-2;i++){
		for(int j=0;j<n-1;j++){
			for(int k=0;k<n;k++){
			  if((arr[i]+arr[j]+arr[k])>=max){
				  max=(arr[i]+arr[j]+arr[k]);
				  t1=i;t2=j;t3=k;}
		                        }
	                          }
                           }
    num[0]=arr[t1];num[1]=arr[t2];num[2]=arr[t3];
    if(((num[0]+num[1])>num[2])&&((num[1]+num[2])>num[0])&&((num[2]+num[0])>num[1])){
    	for(int i=0;i<3;i++){
    		int max1=arr[i];
    		if(i!=2){
    			for(int j=i+1;j<3;j++){
    			if(arr[j]<max1){
    				int temp=arr[j];
    				arr[j]=arr[i];
    				arr[i]=temp;
    			}
    		}
    		}
    	}
    System.out.printf("%d %d %d",num[0],num[1],num[2]);
    }
    else
    System.out.println("-1");	
  }
}
