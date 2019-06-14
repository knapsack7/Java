public class LargestSubArrayWithContiguousEle {

	/**
	 * Find Largest Contiguous SubArray
	 */
	public static int findLength(int[] arr) {
		int max_len = 1;
		for (int i = 0; i < arr.length - 1; i++) {
			int mx = arr[i], mn = arr[i];
			for (int j = i + 1; j < arr.length - 1; j++) {
				mx = Math.max(mx, arr[j]);
				mn = Math.min(mn, arr[j]);
				if (mx - mn == j - i) {
					max_len = Math.max(max_len, j - i + 1);
				}
			}
		}
		return max_len;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 56, 58, 57, 90, 92, 94, 93, 91, 45 };
		System.out.println(findLength(arr));
	}

}
