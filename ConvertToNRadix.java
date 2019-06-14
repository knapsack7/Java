import java.util.Scanner;
public class ConvertToNRadix {
	public static StringBuffer convertToRadix(int num, int radix) {
		StringBuffer sb = new StringBuffer();
		int rem = 0;
		while (num != 0) {
			rem = num % radix;
			if (rem > 9)
				sb.append((char) (65 + (rem - 10)));
			else
				sb.append(rem);
			num /= radix;
		}
		sb = sb.reverse();
		return sb;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while (T-- > 0) {
			int radix = sc.nextInt();
			int num = sc.nextInt();
			System.out.println(convertToRadix(num, radix));
		}
		sc.close();
	}
}
