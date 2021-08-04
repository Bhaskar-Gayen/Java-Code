class CountSort{
	public static void main(String str[]){
		int a[] ={2,5,3,0,2,3,0,3};
		countSort(a,getMax(a));
		System.out.println("After Apply Count Sort Algorithm: ");
		print(a);
	}
	
	static int getMax(int a[]){
		int max=a[0];
		for(int i=1; i<a.length; i++)
			if(max<a[i])
				max=a[i];
		return max;
	}
	
	public static void countSort(int []a, int k){
		int n= a.length;
		int[] count = new int[k+1];
		int[] temp = new int[a.length];
		
		for(int i=0;i<n;i++)
			++count[a[i]];
		
		for(int i=1; i<count.length; i++)
			count[i] = count[i]+count[i-1];
		
		for(int i= n-1; i>=0; i--){
			temp[--count[a[i]]] = a[i];
		}
		for(int i=0; i<temp.length; i++)
			a[i] = temp[i];
	}
	
	static void print(int a[]){
		for(int item: a)
			System.out.print(item + " ");
	}

}