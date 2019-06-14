
import java.io.IOException;


public class NextPermu {
	public static void main(String[] args) throws NumberFormatException,IOException{
		int[] arr=new int[]{9,8,7,6,4};
        int len=arr.length;
        int x=0,loc1=0;
        for(int i=1;i<len;i++){
        	if(arr[i-1]<arr[i]){
        		x=arr[i];
        		loc1=i;
        	}
        }
        System.out.println(x);
        int temp=0,loc2=0;
        if(loc1!=0){
        for(int j=loc1;j<len;j++)
        	if(arr[j]>arr[loc1-1]){
        		temp=arr[j];
        		loc2=j;
        	}
       System.out.println(temp);
       arr[loc2]=arr[loc1-1];
       arr[loc1-1]=temp;
       for(int k:arr)
    	   System.out.print(k+" ");
       System.out.println();
       for(int i=loc1,j=len-1;i<(loc1+len-1)/2+1;i++,j--){
    	   temp=arr[i];
    	   arr[i]=arr[j];
    	   arr[j]=temp;
    	  }
        }
       for(int k:arr)
    	   System.out.print(k+" ");
	}
}

