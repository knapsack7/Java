import java.util.Scanner;
public class Lexi {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int k = sc.nextInt();
        String min="";
        String max="";
        for (int i = 0; i <= str.length() - k; i++) {
            String substr = str.substring(i,  i + k);
            if (min.isEmpty()||substr.compareTo(min) < 0) {
                min = substr;
            }
            if (max.isEmpty()||substr.compareTo(max) > 0 ) {
                max = substr;
            }
        }

        System.out.println(min);
        System.out.println(max);
    }
}
