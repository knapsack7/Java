import java.util.Scanner;
public class AppleAndOrange{
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int apple_count=0;
        int orange_count=0;
        int[] apple = new int[m];
        for(int apple_i=0; apple_i < m; apple_i++){
            apple[apple_i] = in.nextInt();
            if(apple[apple_i]>0){
            	int temp=a+apple[apple_i];
            	   if(temp>=s&&temp<=t)
            		   apple_count++;
            }
        }
        int[] orange = new int[n];
        for(int orange_i=0; orange_i < n; orange_i++){
            orange[orange_i] = in.nextInt();
            if(orange[orange_i]<0){
            	int temp=b+orange[orange_i];
            	   if(temp>=s&&temp<=t)
            		   orange_count++;
            }
        }
        System.out.println(apple_count);
        System.out.println(orange_count);
        in.close();
    }
}
