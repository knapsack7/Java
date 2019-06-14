import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
class Checker implements Comparator<Player>{
	public int compare(Player plr1,Player plr2){
		int a=plr1.score,b=plr2.score;
		String s1=plr1.name,s2=plr2.name;
		if(a>b)
			return -1;
		else if(a<b)
			return 1;
		else
			return s1.compareTo(s2);
					
	}
}
class Player{
    String name;
    int score;
    Player(String name, int score){
        this.name = name;
        this.score = score;
    }
}
public class JavaComparator{
        public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Player[] player = new Player[n];
        Checker checker = new Checker();
        for(int i = 0; i < n; i++){
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();
        Arrays.sort(player,checker);
        for(int i=0;i<player.length;i++){
            System.out.printf("%s %s\n",player[i].name,player[i].score);
        }
    }
}