import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountNumberTriplets {

	/**
	 * Count Number Of Triplets having sum less than a given number,desired time Complexity O(n^2)
	 */
	public static int countTriplets(int[] nums, int tot) {
		int ans = 0;
		for (int i = 0; i < nums.length - 2; i++) {
			int j = i + 1, k = nums.length - 1;
			while (j < k) {
				if (nums[i] + nums[j] + nums[k] >= tot)
					k--;
				else {
					ans += k - j;
					j++;
				}
			}
		}
		return ans;
	}

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter array..");
		String[] s = br.readLine().split(" ");
		int[] arr = new int[s.length];
		for (int i = 0; i < s.length; i++)
			arr[i] = Integer.parseInt(s[i]);
		System.out
				.println("Enter the number below which sum is to be found...");
		int tot = Integer.parseInt(br.readLine());
		System.out.println("Number of such triplets are..."
				+ countTriplets(arr, tot));

	}

}
