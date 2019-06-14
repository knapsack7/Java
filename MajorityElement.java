import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class MajorityElement {
	private static int printingMajorityElement(int[] arr) {
		int maj_index = 1, count = 1;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] != arr[maj_index]) {
				count--;
				if (count == 0) {
					maj_index = i;
					count = 1;
				}
			} else
				count++;
		}
		int temp = 0;
		int maj_element = arr[maj_index];
		for (int i : arr) {
			if (i == maj_element) {
				temp++;
				if (temp > arr.length / 2)
					break;
			}
		}
		if (temp > arr.length / 2)
			return maj_element;
		else
			return 0;
	}

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number for the count of elements in the array");
		int N = Integer.parseInt(br.readLine());
		System.out.println("Enter array elements:");
		int[] arr = new int[N];
		String[] s = br.readLine().split(" ");
		for (int i = 0; i < N; i++)
			arr[i] = Integer.parseInt(s[i]);
		int flag = printingMajorityElement(arr);
		if (flag != 0)
			System.out.println(flag);
		else
			System.out.println("Majority element does not exist");
	}
}
