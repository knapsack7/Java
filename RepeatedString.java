import java.util.Scanner;
public class RepeatedString {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String s=scan.next();
		long len=s.length();
		long n=scan.nextLong();
		int a_times=0,i=0;
		for(i=0;i<len;i++){
			if(s.charAt(i)=='a')
				a_times++;
		}
		if(n%len==0)
			System.out.println(a_times*(n/len));
		else{
			int aa_times=0;
			long k=n%len;
			for(i=0;i<k;i++){
				if(s.charAt(i)=='a')
					aa_times++;
			}
			System.out.println(a_times*(n/len)+aa_times);
		}
		scan.close();
	}
}