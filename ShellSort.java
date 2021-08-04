class ShellSort{
public static void main(String at[]){
	int a[] ={10,11,9,8,7,6,5,4,3,2,1};
	shellSort(a);
	System.out.println("Array After Apply Shell Sort Algorithm:");
	print(a);
}

	static void shellSort(int []a){
		int n = a.length-1;
		int gap = n/2;

		for(gap=gap; gap>=1; gap=gap/2){
			for(int j=gap; j<=n; j++){
				for(int i=j-gap; i>=0&&a[i+gap]<a[i]; i=i-gap)
					swap(a,i+gap,i);
			}
		}
	}
	
	static void swap(int a[], int i, int j){
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	static void print(int a[]){
		for(int item: a)
			System.out.print(item + " ");
	}
}
