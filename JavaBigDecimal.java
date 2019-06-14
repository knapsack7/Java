import java.math.BigDecimal;
import java.util.Comparator;
import java.util.*;
public class JavaBigDecimal{
        public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		String[] s=new String[N];
		for(int i=0;i<N;i++){
			s[i]=sc.next();
		}
		Comparator<String> MyComparator=new Comparator<String>(){
			public int compare(String s1,String s2){
				BigDecimal b1 = new BigDecimal(s1);
                BigDecimal b2= new BigDecimal(s2);
				return b2.compareTo(b1);
			}
		};
		Arrays.sort(s,MyComparator);
		for(int i=0;i<N;i++)
			System.out.println(s[i]);
		sc.close();
		}
}

