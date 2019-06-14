
public class CommonEleInThreeSortedArrays {

	/**
	 *Finding common Elements in Three Sorted Arrays
	 */
	private static void findEle(int[] arr1,int[] arr2,int arr3[],int len1,int len2,int len3){
		int i=0,j=0,k=0;
		while(i<len1&&j<len2&&k<len3){
			if(arr1[i]==arr2[j]&&arr2[j]==arr3[k]){
				System.out.print(arr1[i]+" ");
				i++;j++;k++;
			}
			else if(arr1[i]<arr2[j])
				i++;
			else if(arr1[i]>arr2[j])
				j++;
			else
				k++;
		}
	}
	public static void main(String[] args) {
		int[] arr1={1,5,5,14};
		int[] arr2={3,4,5,5,10,14};
		int[] arr3={5,5,10,14};
		findEle(arr1,arr2,arr3,arr1.length,arr2.length,arr3.length);

	}

}
