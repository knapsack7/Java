import java.util.Scanner;


public class FindDigits{
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
        	int number=in.nextInt();
        	int rem=0,count=0,temp=number;
        	while(temp>0){
        		rem=temp%10;
        		if(rem!=0){
        		if(number%rem==0)
        			count++;
        		}
        		temp/=10;
        		}
        	System.out.println(count);
        }
    in.close();
    }
}