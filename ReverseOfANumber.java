import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class ReverseOfANumber {
	public static void main(String[] args) throws NumberFormatException, IOException{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	String n=br.readLine();
	System.out.println("Enter the number whose reverse is to be find::");
	int num=Integer.parseInt(n);
	System.out.println(n);
	int reverse=0;
	while(num>0){
		int rem=num%10;
		reverse=reverse*10+rem;
		num=num/10;
	}
    System.out.println("Reverse:"+reverse);
	}

}
