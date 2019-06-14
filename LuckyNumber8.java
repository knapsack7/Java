import java.util.Scanner;
public class LuckyNumber8{
	public static void count8(int num[]){
		long count=0;
		for(int i=1;i<(1<<num.length);i++){
			int temp=0,k=1;
			for(int j=0;j<num.length;j++){
				if((i&(1<<j))>0){
					temp=temp*k+num[j];
					k*=10;
				}
			}
			if(temp%8==0)
		    count++;
	}
      if(count<1000000000)
    	  System.out.println(count);
      else
    	  System.out.println(count%(1000000007));
}
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		int len=scan.nextInt();
		String input=scan.next();
		char[] ch=input.toCharArray();
		int[] num=new int[len];
		for(int i=0;i<len;i++)
			num[i]=Character.getNumericValue(ch[i]);
		count8(num);
		scan.close();
	}
}
