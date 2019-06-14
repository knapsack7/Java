import java.util.Scanner;
public class StrangeCounter{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		long final_time=scan.nextLong();
		long time=1,value=3,initial=3;
		while(time!=final_time){
			if(value!=1)
				value--;
			else{
				value=2*initial;
				initial=2*initial;
			}
			time++;
		}
		System.out.println(value);
		scan.close();
	}
}
