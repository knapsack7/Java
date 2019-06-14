
public class SimpleDotComTestDrive {
         public static void main(String[] args) {
		 SimpleDotCom dot=new SimpleDotCom();
		 int[] locations={2,3,4};
		 dot.setLocationCells(locations);
		 String users="2";
		 String result=dot.checkYourself(users);
		 }
}
class SimpleDotCom{
  int[] locationCells;
  int numOfHits;
  public void setLocationCells(int[] locs){
	  locationCells=locs;
	  //for(int i:locationCells)
		//  System.out.printf("%d ",i);
		  
  }
  public String checkYourself(String stringGuess){
	  int guess=Integer.parseInt(stringGuess);
	  String result="miss";
	  for(int cell:locationCells){
		  if(guess==cell){
			result="hit";
			numOfHits++;
			break;
		  }
	  }
	  if(numOfHits==locationCells.length){
		  result="kill";
	  }
	  System.out.println(result);
	  return result;
  }
}
