import java.util.*;
public class TimeConversion{
public static void main(String[] args) {
    Scanner in= new Scanner(System.in);
    String Time = in.nextLine();
    String [] tempArray = Time.split(":");
    String hours = tempArray[0];
    String minutes = tempArray[1];
    String seconds = tempArray[2].substring(0, 2);
    int tempHours;
    if (tempArray[2].substring(2, 4).equalsIgnoreCase("PM")) {
      if (Integer.parseInt(hours) < 12) {
        tempHours = Integer.parseInt(hours);
        tempHours += 12;
        hours = Integer.toString(tempHours);
      }
    }
    if (tempArray[2].substring(2, 4).equalsIgnoreCase("AM")) {
      if (Integer.parseInt(hours) == 12) {
        hours = "00";
      }
    }
    System.out.println(hours + ":" + minutes + ":" + seconds);
    }
}