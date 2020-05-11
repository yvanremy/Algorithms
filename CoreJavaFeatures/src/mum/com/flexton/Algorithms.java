package mum.com.flexton;

public class Algorithms {

	public static void mergeSort(int arr[], int l, int r) {

		if (l < r) {

			int m = l + (r - l) / 2;
			mergeSort(arr, l, m);
			mergeSort(arr, m + 1, r);
			merge(arr, l, m, r);

		}

	}

	public static void merge(int arr[], int l, int m, int r) {

		int n1 = m - l + 1;
		int n2 = r - m;

		int left[] = new int[n1];
		int right[] = new int[n2];

		for (int i = 0; i < n1; i++)
			left[i] = arr[l + i];
		for (int j = 0; j < n2; j++)
			right[j] = arr[m + 1 + j];
		int i = 0;
		int j = 0;
		int k = l;

		while (i < n1 && j < n2) {

			if (left[i] <= right[j]) {
				arr[k] = left[i];
				i++;

			} else {
				arr[k] = right[j];
				j++;

			}
			k++;
		}

		while (i < n1) {
			arr[k] = left[i];
			i++;
			k++;
		}
		while (j < n2) {
			arr[k] = right[j];
			j++;
			k++;
		}

	}

	public void quickSort(int arr[], int low, int high) {

	}

	public static boolean printPairs(int arr[], int num) {

		mergeSort(arr, 0, arr.length - 1);
		
        int l = arr.length -1;
        int k = 0;
        
        while(k< l) {
        	if((arr[k]+arr[l]) == num) {
        		return true;
        	}else if((arr[k] + arr[l]) > num) {
             l --;                
        }else {
        k++;	
        }
        }
		 
return false;
	}

	
	public static void printPermutation(int arr[],int start , int end) {
		
		 if (start == end) {
			 System.out.println( );
			 for(int i =0 ; i<arr.length ; i++) {
				 System.out.print(arr[i]+"  ");
			 }
			 System.out.println( );
		 }else {
			 for (int i = start ; i<= end; i++) {
				 
				 arr = swap(arr,start,i);
				 printPermutation(arr,start +1 ,end);
				 arr = swap(arr,start,i);
			 }
		 }
		
	}
	
	public static int[] swap(int a[], int k, int l) {
		
		int temp ;
		int [] ar = a;
		temp = ar[k];
		ar[k] = a[l];
		ar[l] = temp; 
		
		return ar;
	}
	public static void main(String... args) {

		int a[] = { 1, 4, 45 };

//		mergeSort(a, 0, a.length - 1);
//
//		for (int i = 0; i < a.length; i++)
//			System.out.println(a[i]);
		
		//boolean b = printPairs(a, 89);
		printPermutation(a,0,a.length-1);
		//System.out.println(b);
		
		String as ="ahage";
		StringBuilder s = new StringBuilder();
		char [] bb = as.toCharArray();
		
		
		
		

	}
	
	

}
