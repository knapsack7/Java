import java.io.IOException;
import java.util.Scanner;

public class PERFCONT {
	public static void main(String[] args) throws NumberFormatException,
			IOException {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while (T-- > 0) {
			int cakewalk = 0, hard = 0;
			int N = sc.nextInt();
			int P = sc.nextInt();
			for (int i = 0; i < N; i++) {
				int temp = sc.nextInt();
				if (temp <= (P / 10))
					hard++;
				else if (temp >= (P / 2))
					cakewalk++;
			}
			if (cakewalk == 1 && hard == 2)
				System.out.println("yes");
			else
				System.out.println("no");
		}
		sc.close();
	}

}
