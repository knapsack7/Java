import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class TrafiicJam {
	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int na = 0, T = 4, sumtemp = 0, i = 0, j = 0;
		int[] sum = new int[4];
		int[] avg = new int[4];
		while (T-- > 0) {
			na = Integer.parseInt(br.readLine());
			String[] s = br.readLine().split(" ");
			for (String k : s) {
				sumtemp += Integer.parseInt(k);
			}
			sum[i] = sumtemp;
			avg[j] = Math.round(sum[i] / na);
			i++;
			j++;
		}
		int routepriorityA = (sum[0] + sum[1]) / (avg[0] + avg[1]);
		int routepriorityB = (sum[2] + sum[3]) / (avg[2] + avg[3]);
		if (routepriorityA > routepriorityB) {
			System.out.println("Route 1 and Route 2");
			System.out.println("Route 3 and Route 4");
		}
		if (routepriorityA < routepriorityB) {
			System.out.println("Route 3 and Route 4");
			System.out.println("Route 1 and Route 2");
		}
		if (routepriorityA == routepriorityB) {
			System.out.println("Route 1 and Route 2");
			System.out.println("Route 3 and Route 4");
		}
	}
}
