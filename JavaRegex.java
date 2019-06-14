import java.util.Scanner;
class MyRegex{
	String pattern="([01]\\d{2}|2[0-4][0-9]|25[0-5]|\\d{1,2})\\.([01]\\d{2}|2[0-4][0-9]|25[0-5]|\\d{1,2})\\.([01]\\d{2}|2[0-4][0-9]|25[0-5]|\\d{1,2})\\.([01]\\d{2}|2[0-4][0-9]|25[0-5]|\\d{1,2})";
}
class JavaRegex{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }
        in.close();
    }
}