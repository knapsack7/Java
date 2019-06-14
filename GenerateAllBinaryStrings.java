import java.util.*;
class GenerateAllBinaryStrings{
	static int[] arr;
	public static void permuteAll(int start,int size){
		int loc=start;
		if(start==size){
			for(int i:arr)
				System.out.print(i);
			System.out.println();
			return;
		}
		else{
			arr[loc]=0;
			permuteAll(start+1,size);
			arr[loc]=1;
			permuteAll(start+1,size);
		}
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int string_length=sc.nextInt();
		arr=new int[string_length];
		permuteAll(0,string_length);
		sc.close();
	}
}
