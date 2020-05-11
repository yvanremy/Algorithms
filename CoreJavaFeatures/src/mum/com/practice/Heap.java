package mum.com.practice;

public class Heap {
	
	
//	public static void heapSort(Integer[] a) {
//		
//		Integer[] newArr = new Integer[a.length];
//		if(length > 0) {
//			Integer index  = 0;
//			newArr[index1] =a[index];
//			index1++;
//			
//		}
//		
//		
//	}
	public static void arrange2(Integer [] a,Integer length,Integer index) {
		
		if(length >0) {
			
			if(length >= 2*index +1) {
				if(a[2*index +1] > a[2*index] && a[2*index +1] > a[index]) {
					Integer temp = a[2*index +1];
					a[2*index +1] =a[index];
					a[index]= temp;
				}
				
			}else if(length >= 2*index) {
				
			}else if(index == length) {
				
			}
			
		}
		
	}
	

	public static Integer[] heap(Integer[] a) {
		Integer[] arr2 = new Integer[a.length];
		 
		
		for(int i =0;i<arr2.length; i++) {
				arr2[i]= a[i];
				arrange(arr2,i);
		}
		
		return arr2;
	}
	
	
	public static void arrange(Integer[] a, Integer index) {
		
		if(a[index] > a[index/2]) {
			Integer temp = a[index/2];
			a[index/2] =a[index];
			a[index]= temp;
			arrange(a,index/2);
		}
	}
	
	public static void main(String...arg) {
		
		Integer [] a = {5,2,5,4,2,23,4,7,1,8,9,12};
		
		for(Integer i : heap(a)) {
			System.out.print(i+" ");
		}
		
	}

}
