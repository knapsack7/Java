import java.io.File;

public class FileHandling3 {
	public static void main(String[] args) {
		File file = new File("/home/knapsack120/Desktop/workspace/ClassRoom");
		File[] list = file.listFiles();
		for (File f : list) {
			if (f.isFile())
				System.out.println("File : " + f);
			else if (f.isDirectory())
				System.out.println("Directory : " + f);
		}

	}

}
