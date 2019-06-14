public class Primefactors{
	public static String primeFactors(int num){
		String ans="";
		for(int i=2;num>1;){
			if(num%i==0){
				ans=ans+i+"X";;
				num/=i;
			}
			if(num%i!=0){
				i++;
			}
		}
		StringBuilder sb=new StringBuilder(ans);
		int length=ans.length();
		sb.deleteCharAt(length-1);
		ans=sb.toString();
		return ans; 
	}
	public static void main(String[] args){
		int num=93;
		String ans=primeFactors(num);
		System.out.println(ans);
	}
}
