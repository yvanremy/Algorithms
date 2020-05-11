package mum.com.practice;



public class Practice {
	
	
	public static int partition(int []a , int right,int left) {
		int pivot = a[right];
		int i = right+1;
		
		while(i< left ) {
			if(a[i] > pivot) {
				
				while(a[left] > pivot && left >i) {
					left --;
				}
				if(a[left] < pivot) {
					int flag = a[i];
					 a[i]=a[left];
					 a[left]=flag;
				}

			}
			i++;
		}
		System.out.println("pivot is "+a[right] + " and j is "+a[left] + "and left is "+left);
		int flag = a[right];
		 a[right]=a[left-1];
		 a[left-1]=flag;
		 
		return left-1;
	}
	
	public static void quickSort(int arr[],int right,int left) {
		
	    if(right < left) {
	     int pivot =	partition(arr,right, left);
	    quickSort(arr,right, pivot);
	    quickSort(arr,pivot + 1, left);
	    }
	}
	
	public static void main(String [] args) {
		 
		int[]a = {10,5,8,12,15,6,3,9,16};
		
		try {
			quickSort(a, 0, a.length-1);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("this is the main methods");
		for(int g : a) {
			System.out.print(" "+g);
		}
	}
	
}
