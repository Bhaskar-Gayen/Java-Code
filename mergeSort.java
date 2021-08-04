
public class mergeSort{
	
public static void main(String str[]){
	int[] a = {11,90,40,50,22,10,9,8,7,5,6,3,1,0};
	MergeSort(a,0,a.length-1);
	System.out.print("Sorted Array After Apply MergeSort: \n");
	for(int i: a) {
		System.out.print(i + " ");
	}

}

static void MergeSort(int[] a, int p, int r){
	if(p<r){
		int q = (r+p)/2;
		MergeSort(a, p, q);
		MergeSort(a, q+1, r);
		merge(a, p, q, r);
	}
}

static void merge(int[] a, int p, int q, int r){
	int Big = 9999;
	int n1 = q-p+1;
	int n2 = r-q;
	int[] L = new int[n1+1];
	int[] R = new int[n2+1];
	for(int i=0; i<n1; i++)
		L[i] = a[p+i];
	for(int i=0; i<n2; i++)
		R[i] = a[q+1+i];
	L[n1] = Big;
	R[n2] = Big;
	int i=0,j=0;
	for(int k=p; k<=r; k++){
		if(L[i]<=R[j]){
			a[k] = L[i];
			i++;
		}
		else{
			a[k] = R[j];
			j++;
		}
	}

}

}