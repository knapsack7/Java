import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
public class TimeOfIndia{
   public static void main(String[] args){
	   SimpleDateFormat sd = new SimpleDateFormat("yyyy.MM.dd G 'at' HH:mm:ss z");
	   Date d=new Date();
	   sd.setTimeZone(TimeZone.getTimeZone("IST"));
       System.out.println(d.getDate()+" "+sd.format(d));
   }
}