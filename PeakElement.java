
public class PeakElement {
   public static int peakElement(int[] arr,int first,int last,int size){
   int mid=(first+last)/2;
   if((mid==0||arr[mid]>=arr[mid-1])&&(mid==size-1||arr[mid]>=arr[mid+1]))
      return arr[mid];
   else if(arr[mid]<arr[mid-1])
	  return peakElement(arr,first,mid-1,size);
   else
	  return peakElement(arr,mid+1,last,size);
   }
   public static void main(String[] args) {
    int[] arr={5,10,20,15};
    System.out.println(peakElement(arr,0,arr.length-1,arr.length));
	}

}
