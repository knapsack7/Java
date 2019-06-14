import java.util.Scanner;
public class GreatXOR{
	public static long totalNumber(long n){
		String s=Long.toBinaryString(n);
		char[] binary=s.toCharArray();
	    long total=0;
		for(int i=0;i<binary.length;i++){
	    	if(binary[i]==48){
	    	total+=Math.pow(2,binary.length-i-1);	
	    	}
	    }
		return total; 
	}
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		int q=scan.nextInt();
		while(q-->0){
			long  x=scan.nextLong();
			System.out.println(totalNumber(x));
		}
	scan.close();
	}
}