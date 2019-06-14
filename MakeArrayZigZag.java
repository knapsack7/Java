public class MakeArrayZigZag {
	static int[] arr={1,2,3,4,5,6,7};
	public static void convertZigZag(int[] arr){
    	int temp=0;
    	boolean flag=true;//true stands for "<"
    	for(int i=0;i<=arr.length-2;i++){
    		if(flag){
    			if(arr[i]>arr[i+1]){
    				temp=arr[i];
    				arr[i]=arr[i+1];
    				arr[i+1]=temp;
    			}
    		}
    		else{
    			if(arr[i]<arr[i+1]){
    				temp=arr[i];
    				arr[i]=arr[i+1];
    				arr[i+1]=temp;
    			}
    		}
    	flag=!flag;
    	}
    }
	public static void main(String[] args) {
	convertZigZag(arr);
	for(int i:arr)
	System.out.print(i+" ");
	}
}
