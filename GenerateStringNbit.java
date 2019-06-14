public class GenerateStringNbit{
	int[] arrA;
    public GenerateStringNbit(int n) {
		arrA = new int[n];
	}
    public void nBits(int n) {
		if (n < 1) {
			for(int i:arrA)
			System.out.print(i);
			System.out.println();
		} else {
			arrA[n - 1] = 0;
			nBits(n - 1);
			arrA[n - 1] = 1;
			nBits(n - 1);
		}
	}
    public static void main(String[] args) throws java.lang.Exception {
		int n = 3;
		GenerateStringNbit i = new GenerateStringNbit(n);
		i.nBits(n);
	}
}