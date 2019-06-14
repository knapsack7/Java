import java.util.Scanner;
/* A element is leader if it is greater than all the elements to its right side.And the rightmost element is always a leader*/
public class LeadersInAnArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the Array");
		int N = sc.nextInt();
		System.out.println("Enter the elements of the Array");
		int[] arr = new int[N];
		for (int i = 0; i < N; i++)
			arr[i] = sc.nextInt();
		System.out.print(arr[N - 1]);
		int leader = arr[N - 1];
		for (int i = N - 2; i >= 0; i--) {
			if (arr[i] > leader) {
				System.out.print(" " + arr[i]);
				leader = arr[i];
			}
		}
		sc.close();
	}
}
