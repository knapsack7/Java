import java.util.*;
/*This algorithm works if each character is distinct*/
class Permute{
	static char[] str;
	public static void swap(int i,int j){
		char temp=str[i];
		str[i]=str[j];
		str[j]=temp;
	}
	public static void permute(int start,int end){
		int index;
		if(start==end){
			for(char ch1:str)
				System.out.print(ch1);
			System.out.println();
			return;
		}
		else{
			for(index=start;index<=end;index++){
				swap(start,index);
				permute(start+1,end);
				swap(start,index);
			}
		}
	}		
	public static void main(String[] args){
		String str1="MMM";
		str=str1.toCharArray();
		permute(0,str1.length()-1);
	}
}
