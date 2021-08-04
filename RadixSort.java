class RadixSort{
	public static void main(String str[]){
		int a[] ={432,8,53,90,88,231,11,45,677,199};
		radixSort(a);
		System.out.println("After Apply Radix Sort Algorithm: ");
		print(a);
	}
	
	static int getMax(int a[]){
		int max=a[0];
		for(int i=1; i<a.length; i++)
			if(max<a[i])
				max=a[i];
		return max;
	}
	
	static void radixSort(int a[]){
		int max = getMax(a);
		for(int pos=1; max/pos>0; pos=pos*10)
			countSort(a,pos);
	}
	
	public static void countSort(int []a,int pos){
		int n= a.length;
		int[] count = new int[10];
		int[] temp = new int[a.length];
		
		for(int i=0;i<n;i++)
			++count[(a[i]/pos)%10];
		
		for(int i=1; i<count.length; i++)
			count[i] = count[i]+count[i-1];
		
		for(int i= n-1; i>=0; i--){
			temp[--count[(a[i]/pos)%10]] = a[i];
		}
		for(int i=0; i<temp.length; i++)
			a[i] = temp[i];
	}
	
	static void print(int a[]){
		for(int item: a)
			System.out.print(item + " ");
	}
}