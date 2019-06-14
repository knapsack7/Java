import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling1 {
	public static void main(String args[]) throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter("source.txt"));
		bw.write("Data to be copied....");
		bw.close();
		FileInputStream in = new FileInputStream(new File("source.txt"));
		FileOutputStream out = new FileOutputStream(new File("destination.txt"));
		byte[] buf = new byte[1024];
		int len;
		while ((len = in.read(buf)) > 0) {
			out.write(buf, 0, len);
		}
		in.close();
		out.close();
		System.out.println("Data in destination.txt file after copying...");
		BufferedReader br = new BufferedReader(
				new FileReader("destination.txt"));
		String str = null;
		while ((str = br.readLine()) != null) {
			System.out.println(str);
		}
		br.close();
	}
}