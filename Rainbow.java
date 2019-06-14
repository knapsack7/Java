import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Rainbow {
	public static void main(String[] args) throws NumberFormatException,IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer T = Integer.parseInt(br.readLine());
		while (T-- > 0) {
			Integer N = Integer.parseInt(br.readLine());
			int[] arr = new int[N];
			String[] s = br.readLine().split(" ");
			for (int i = 0; i < N; i++)
				arr[i] = Integer.parseInt(s[i]);
			Boolean reach=false,isRainbow=false;
			int prev = arr[0];
			for (int i = 0, j = N - 1; i <= j; i++, j--) {
				if (arr[i] == arr[j] && (arr[i] == prev || arr[i] == prev + 1)
						&& (arr[i] > 0 && arr[i] <= 7)) {
					if(arr[i]==7)
						reach=true;
					isRainbow=true;;
					prev = arr[i];
				} else {
					isRainbow=false;
					break;
				}
			}
			if(reach&&isRainbow)
				System.out.println("yes");
			else
				System.out.println("no");
		}
	}
}
