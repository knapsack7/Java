class Arrange{
	int[] arr={1,2,3,4,5,6,7,8,9};
	void swap(int i,int j){
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	void arranging(){
		int i=0,j=arr.length-1;
		while(i<j){
			while(arr[i]%2==1)
				i++;
			while(arr[j]%2==0)
				j--;
			if(i<j)
				swap(i,j);
		}
		for(int k:arr){
			System.out.print(k+" ");
		}
	}
}
public class ArrangeMain{
    public static void main(String[] args) {
	Arrange arrange=new Arrange();
	arrange.arranging();
	}
}
