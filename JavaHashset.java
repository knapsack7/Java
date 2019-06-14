import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
public class JavaHashset{
public static void main(String[] args) throws NumberFormatException,IOException{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    HashSet<String> pairs = new HashSet<String>();
    long n = Long.parseLong(br.readLine());
    for (int i = 0; i < n; i ++) {
      String pair = br.readLine();
      pairs.add(pair);
      System.out.println(pairs.size());
    }
  }
}