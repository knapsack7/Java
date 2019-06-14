import java.util.Arrays;
import java.util.Scanner;
public class TheHurdleRace {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] height = new int[n];
        for(int height_i=0; height_i < n; height_i++){
            height[height_i] = in.nextInt();
        }
        int l=height.length;
        int count=0;
        Arrays.sort(height);
        if(height[l-1]>=k){
            count = height[l-1]-k;
        }
        System.out.println(count);
		in.close();
		}

}
