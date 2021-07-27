package insertionsort;

public class Insertion_Sort {
	void sort(int arr[]) {
		int n = arr.length;
		for(int i =0; i<n; i++) {
			int key = arr[i];
			int j = i-1;
			while(j >= 0 && arr[j]> key){
				arr[j+1] = arr[j];
				j = j-1;
				}
			arr[j+1] = key;
		}
	}
	static void Display(int arr[]) {
		int n = arr.length;
		for (int i = 0; i<n; i++) {
			System.out.println(arr[i] + " ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int arr[] = {30, 40, 50, 20, 10};
		Insertion_Sort obj = new Insertion_Sort();
		obj.sort(arr);
		Display(arr);
		}
}
