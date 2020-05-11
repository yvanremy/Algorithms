package mum.testPrep;

public class Prep2 {
	
	
	public static void mergeSort(int []a,int start,int end) {
		 
		if(start < end) {
			int mid = (start+end)/2;
			mergeSort(a, start, mid);
			mergeSort(a,mid+1,end);
			merge2(a,start,mid,end);
		}
		
	}
	
	public static void merge(int a[],int start,int mid,int end) {
		
        		int p = start;
        		int q = mid+1;
        		int k =0;
        		int arr [] = new int[end-start+1];
        		
        		for(int i=start; i<=end ; i++) {
        			
        			if(p > end) {
        				arr[k] = a[q];
        				k++;
        				q++;
        			}else if(q > end) {
        				arr[k] =a[p];
        				k++;
        				p++;
        			}else if (a[p] <a[q]) {
        				arr[k]= a[p];
        				k++;
        				p++;
        			}else {
        				arr[k] =a[q];
        				k++;
        				q++;
        			}
        		}
        		
        		for(int i=0; i< k; i++) {
        			a[start] =arr[i];
        			start++;
        		}
	}
	
	
	
	public static void merge2(int a[],int start,int mid,int end) {
		
		int n1 = mid -start +1;
		int n2 = end-mid;
		
		int []arr1 = new int[n1];
		int[] arr2  = new int[n2];
		
		for(int i=0 ; i< n1 ; ++i)
			arr1[i] = a[start+i];
		for (int j=0; j<n2 ; ++j)
			arr2[j] =a[mid+1+j];
		   
		int j=0,i=0,k=start;
		
		while(i<n1 && j<n2){
			
			if(arr1[i] <=arr2[j]) {
				a[k] = arr1[i];
				i++;
			}else {
				a[k]=arr2[j];
				j++;		
				
			}
			k++;
		}
		while(i < n1) {
			a[k] = arr1[i];
			i++;
			k++;
		}
		while(j < n2) {
			a[k] = arr2[j];
			j++;
			k++;
		}
		
		
	}
	
	
	public static void main(String...h) {
		
		int []a = {5,2,9,7,1,6,4,0,3,0,4,0,7};
		mergeSort(a, 0,12);
		
		for(int x :a ) {
			System.out.println(x);
		}
		
		
	}
	
	
	
	

}
