import java.util.Scanner;

public class HILLJUMP {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Q = sc.nextInt();
		int[] hei = new int[N];
		for (int i = 0; i < N; i++)
			hei[i] = sc.nextInt();
		int type = 0, i, k, L, R, X;
		while (Q-- > 0) {
			type = sc.nextInt();
			if (type == 1) {
				i = sc.nextInt();
				i--;
				k = sc.nextInt();
				int nextindex = i, jumpcount = 0;
				boolean terminated=false;
				for (int j = i+1 ; j<hei.length &&j <= nextindex + 100 && jumpcount < k; j++) {
					if (hei[j] > hei[nextindex]) {
						nextindex = j;
						jumpcount++;
					} else if (j>hei.length || j == nextindex + 100) {
						System.out.println(nextindex + 1);
						terminated = true;
						break;
					}
				}
				if(!terminated)
					System.out.println(nextindex+1);
			} else if (type == 2) {
				L = sc.nextInt();
				R = sc.nextInt();
				X = sc.nextInt();
				for (int j = L - 1; j <= R - 1; j++)
					hei[j] += X;
			}
		}
	sc.close();	
	}
}
