class QuickSort{
	
	
	public static void main(String atr[]){
		int a[] ={1, 4, 2, 4, 2, 4, 1, 2, 4, 1, 2, 2, 2, 2, 4, 1, 4, 4, 4};
		System.out.println("After Apply Quick Sort\n");
		quickSort(a, 0, a.length -1);
		for(int i: a){
			System.out.print(i + " ");
		}
		
	}
	static void quickSort(int a[], int p, int r){
		if(p<r){
			int q = parition(a,p,r);
			quickSort(a,p,q-1);
			quickSort(a, q+1, r);
		}
	}
	
	
	static int parition(int a[], int p, int r){
		int x= a[r];
		int i = p - 1, temp;
		for(int j = p; j<= r-1; j++){
			if(a[j] <= x){
				i++;
				temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
		a[r] = a[i+1];
		a[i+1] = x;
		return i+1;
	}
}