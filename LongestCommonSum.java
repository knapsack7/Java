public class LongestCommonSum{
	public static int biggestSpan(byte arr1[],byte[] arr2,int N){
		int maxspan=0;
		for(int i=0;i<N;i++){
			int sum1=0,sum2=0;
			for(int j=i;j<N;j++){
				sum1+=arr1[j];
				sum2+=arr2[j];
				if(sum1==sum2){
					int len=j-i+1;
					if(len>maxspan)
						maxspan=len;
				}
			}
		}
		return maxspan;
	}
    public static void main(String[] args){
	byte arr1[]={0,0,1,0};
	byte arr2[]={1,1,1,1};
	System.out.println(biggestSpan(arr1,arr2,arr1.length));
	}

}
