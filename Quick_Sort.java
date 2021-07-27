package quicksort;

public class Quick_Sort {
	static void swap(int arr[], int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	} 
	static int partation(int arr[], int low, int high) {
		int pivot = arr[high];
		int i = (low-1);
		for(int j = low; j <= high-1; j++) {
			if (arr[j]<pivot) {
				i++;
				swap(arr, i, j);
			}
		}
		swap(arr,i+1, high);
		return(i+1);
	}
	static void sort(int arr[], int low, int high) {
		if(low<high) {
			int pi = partation(arr, low, high );
			sort(arr, low, pi-1);
			sort(arr, pi+1, high);
		}
		
	} 
static void Display(int arr[], int size) {
	for (int i =0 ; i<size; i++) {
		System.out.println(arr[i] + "");
	}
	System.out.println();
}
	public static void main(String[] args) {
		int arr[] = {10, 30, 40, 20};
		int n = arr.length;
		sort(arr, 0, n-1);
		System.out.println("the sorted array by quick sort is:");
		Display(arr, n);
	}

}
