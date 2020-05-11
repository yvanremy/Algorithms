package mum.testPrep;

public class Prep1 {
	
	
	public static int factorial2(int n) {

		if(n==0)
			return 0;
		if(n==1)
			return 1;
		
		int fac =1;
		while(n > 0) {
			fac = fac * n;
			n--;
		}
		return fac;
	}
	
	public static int factorial(int n) {
		
		if(n==0)
			return 0;
		if(n==1)
			return 1;
		return n * factorial(n-1);
	}
	
	
	public static int fibbonaci(int n) {
		
		int fib[] = new int[n+1];
		
		fib[0] = 0;
		fib[1] = 1;
		if(n<=1)
			return n;
		 
		for(int i =2 ; i <=n ; i++ ) {
			fib[i] = fib[i-1] + fib[i-2];
		}
		return fib[n];
		
		
		
	}
	
	public static int fibbonaci2(int n) {
		
		if(n<= 1) {
			return n;
		}
		return fibbonaci2(n-1) + fibbonaci2(n-2);
	}
	
	
	public static void bubbleSort(int [] a) {
		int count =0;
		
		for(int i =0 ; i < a.length ; i++) {
			
			for(int j =0 ; j < a.length-1 ; j ++) {
				
				if(a[j] > a[j+1] ) {
					count++;
					System.out.println(count);
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
				
			}
			
		}
		 
	}
	
	public static void selectionSort(int [] a ) {
		
		int min_index =0;
		int count =0;
		
		for(int i =0 ; i< a.length -1 ; i++) {
			
			min_index= i;
			for(int j = i +1 ; j< a.length ; j ++) {
				
				if(a[min_index] > a[j]) {
					count++;
					System.out.println(count);
					
					min_index = j;
					
					int tem = a[min_index];
					a[min_index] = a[i];
					a[i] = tem;
					
				}
				
			}
			
		}
		
	}
	
	public static void main(String...arsg) {
		
		//System.out.println(fibbonaci2(5));
		int [] a = {8,4,2,1};
		
		selectionSort(a);
		
		for(int i : a) {
			
			//System.out.println(i);
		}
		
		
	}

}
