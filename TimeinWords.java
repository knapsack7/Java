import java.util.Scanner;
public class TimeinWords{
public static void main(String[] args) {
    Scanner scan=new Scanner (System.in);
    String time[]= {" ","one ","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","ninteen","twenty","twenty one","twenty two","twenty three","twenty four","twenty five","twenty six","twenty seven","twenty eight","twenty nine","half"};
    int h=scan.nextInt();
    int m=scan.nextInt();
    if(m==0)
        System.out.print(time[h]+" o' clock");
    if(m==1)
        System.out.print("one minute past "+time[h]);
    if(m==15)
        System.out.print("quarter past "+time[h]);
    if(m<30 && m!=0 && m!=1 && m!=15)
        System.out.print(time[m]+" minutes past "+time[h]);
    if(m==30)
        System.out.print(time[m]+" past "+time[h]);
    if(m>30 && m!=45)
        System.out.print(time[60-m]+" minutes to "+time[h+1]);
    if(m==45)
        System.out.print("quarter to "+time[h+1]);
    scan.close();
}
}