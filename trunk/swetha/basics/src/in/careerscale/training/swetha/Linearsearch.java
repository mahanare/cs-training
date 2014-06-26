package in.careerscale.training.swetha;

public class Linearsearch {
	public static int linearSearch(int arr[],int key){
		for(int i=0;i<arr.length;i++){
			if(key==arr[i]){
				return i;
			}
			
		}

return -1;
}
	public static void main(String args[]){
		int input[]={20,34,56,78,94,108};
		int searchKey=94;
		int k= linearSearch(input, searchKey);
		System.out.println("Element found at "+k);
		
	}
}