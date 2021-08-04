class selectionSort{
	public static void main(String str[]){
		int a[] = new int[100000];
		int v =9999;
		for(int i=0;i<a.length;i++){
			a[i] = v;
			v--;
		}
		ss(a);
		for(int item: a){
			System.out.print(item + " ");
		}
	}
	
	static void ss(int []a){
	int i,j,minIndex;
	for(i=0;i<a.length;i++){
		minIndex = i;
		for(j=i+1;j<a.length;j++)
			if(a[minIndex] > a[j])
				minIndex  = j;
			swap(a,i,minIndex);
		}
	}
	
	static void swap(int a[], int i, int j){
		int tem = a[i];
		a[i] = a[j];
		a[j] = tem;
 	}
}