package linearsearch;

public class Linear_Search {
	public static int search(int arr[], int x) {
		int n =arr.length;
			for (int i =0; i<n; i++) {
				if(arr[i] == x)	
					return i;
			}
			return -1;
	}
	public static void main(String[] args) {
		
		int arr[]= {10,20,30,40,50};
		int x=50;
		int result = search(arr, x);
		if (result == -1) 
			System.out.println("the element is not there in array");
		else 
			System.out.println("the result found at index:" + result);
			
		}
	}


