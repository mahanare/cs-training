package in.careerscale.training.swetha;

public class BinarySearch {
	public static int binarySearch(int arr[],int start,int end,int key){
		int mid=start+(end-start)/2;
			if(key<arr[mid]){
				return binarySearch(arr,start,mid,key);
			}
			else if(key>arr[mid]){
				return binarySearch(arr,mid,end,key);
			}else {
				return mid;
			}
}
	public static void main(String args[]){
		int input[]={20,34,56,78,94,108};
		int searchKey=56;
		int k= binarySearch(input,0,input.length,searchKey);
		System.out.println("Element found at "+k);
	
	}
	}