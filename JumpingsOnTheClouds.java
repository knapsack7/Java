import java.util.Scanner;
public class JumpingsOnTheClouds{
	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int total_clouds=scan.nextInt();
    int[] cloudtype=new int[total_clouds];
    for(int i=0;i<total_clouds;i++)
    	cloudtype[i]=scan.nextInt();
    int min=0,i=0;
    while(i<total_clouds){
    	if(i==total_clouds-1)
    		break;
    	if((i+2<=total_clouds-1)&&(cloudtype[i+2]==1)){
    		i=i+1;
    		min++;
    	}
    	else{
    		i=i+2;
    		min++;
    	}
    }
	scan.close();
	System.out.println(min);
	}
}