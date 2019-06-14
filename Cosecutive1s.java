import java.util.Scanner;
public class Cosecutive1s{
	public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    in.close();
    int max = 0;
    String binary=Integer.toBinaryString(n);
    for(String getMax:binary.split("0")){
    	int res=getMax.length();
        if(res>max){
            max=res;
        }
    }
    System.out.println(max);
}
}