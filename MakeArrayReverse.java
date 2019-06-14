import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MakeArrayReverse {
	static char[] ch;

	/**
	 * reverse arrays without affecting special characters
	 */
	public static boolean isSpecialCh(int index) {
		return !((ch[index] >= 'A' && ch[index] <= 'Z') || (ch[index] >= 'a' && ch[index] <= 'z'));
	}

	public static void reverseString() {
		int start = 0, last = ch.length - 1;
		char temp;
		while (start < last) {
			if (isSpecialCh(start) == true) {
				start++;
			} else if (isSpecialCh(last) == true) {
				last--;
			}
			if (isSpecialCh(start) == false && isSpecialCh(last) == false) {
				temp = ch[start];
				ch[start] = ch[last];
				ch[last] = temp;
				start++;
				last--;
			}
		}
	}

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter String..");
		String s = br.readLine();
		ch = s.toCharArray();
		reverseString();
		System.out.println("String after Reverse...");
		for (char i : ch)
			System.out.print(i);

	}
}
