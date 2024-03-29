import java.util.Scanner;

public class BankAccounts{
    static String feeOrUpfront(int n, int k, int x, int d, int[] p) {
    float totfee=0;
    for(int i=0;i<n;i++)
    	totfee+=Math.max(k,(x*0.01)*p[i]);
    if(totfee<=d)
    	return "fee";
    else
    	return "upfront";
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int n = in.nextInt();
            int k = in.nextInt();
            int x = in.nextInt();
            int d = in.nextInt();
            int[] p = new int[n];
            for(int p_i = 0; p_i < n; p_i++){
                p[p_i] = in.nextInt();
            }
            String result = feeOrUpfront(n, k, x, d, p);
            System.out.println(result);
        }
        in.close();
    }
}
