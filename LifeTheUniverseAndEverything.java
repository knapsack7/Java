import java.util.Scanner;
public class LifeTheUniverseAndEverything{
	public static void main(String[] args) {
	Scanner scan =new Scanner(System.in);	
    int num=scan.nextInt();
    while(num!=42){
    	System.out.println(num);
    	num=scan.nextInt();
    	}
    scan.close();
	}
}
