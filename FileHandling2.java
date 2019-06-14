import java.io.File;
import java.util.Date;
public class FileHandling2{
   public static void main(String[] args) {
      File file = new File("Tutorial.java");
      Long lastModified = file.lastModified();
      Date date = new Date(lastModified);
      System.out.println(date);
   }
}