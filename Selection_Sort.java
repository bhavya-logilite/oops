package selectionsort;

public class Selection_Sort {
	void sort(int arr[]) {
		int n= arr.length;
		for (int i = 0; i<n-1; i++) {
			int min = i;
			for (int j= i+1; j<n; j++) {
				if (arr[j] < arr[min]) {
					min = j;
				}
			}
			int temp = arr[min];
			arr[min]= arr[i];
			arr[i]=temp;
		}
	}
	void Display(int arr[]) {
		int n = arr.length;
		for (int i = 0; i< n; i++) {
			System.out.println(arr[i] + "");
		}
	} 
	public static void main(String[] args) {
			Selection_Sort obj = new Selection_Sort();
			int arr[] = {10, 50, 40, 30};
			obj.sort(arr);
			System.out.println("the given elements are sorted by selection sort:");
			obj.Display(arr);

	}

}
