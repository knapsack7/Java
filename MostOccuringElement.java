/*This algorithm does not works if the given array is read only.
  This solution will work only if the array elements are positive
  If the elements range is not in 0 to n-1 then it may give exceptions
*/
import java.util.Scanner;
public class MostOccuringElement{
	static int [] arr;
	public static void mostRepeatedElement(){
		int max=0,maxInd=0;
		int len=arr.length;
		for(int i=0;i<len;i++){
			arr[arr[i]%len]+=len;
		}
		for(int i=0;i<len;i++){
			if(arr[i]/len>max){
				max=arr[i]/len;
				maxInd=i;
			}
		}
		System.out.println("Maximum repeated element is "+maxInd);
	}	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int len=sc.nextInt();
		arr=new int[len];
		int i=0;
		while(len-->0){
			arr[i]=sc.nextInt();
			i++;
		}
		for(int j:arr){
			System.out.print(j+" ");
		}
		mostRepeatedElement();
	}
}
