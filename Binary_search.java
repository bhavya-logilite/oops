package binarysearch;

public class Binary_search {
	int Search(int arr[], int l, int r, int x) {
		if (r >= l) { 
			int mid = l + (r - l) / 2;
			if (arr[mid] == x) 
				return mid;
			if (arr[mid] > x)
				return  Search(arr, l, mid - 1, x);
		    return Search(arr, mid + 1, r, x);
		}
		return -1;
	}
	public static void main(String[] args) {
		Binary_search obj= new Binary_search();
		int arr[] = {10, 20, 30, 40, 50 };
		int n = arr.length;
		int x = 40; 
		int result = obj.Search(arr, 0, n - 1, x);
	    if (result == -1)
	        System.out.println("Element is not present in an array");
	    else
	       System.out.println("Element found at index " + result);
	}

}
