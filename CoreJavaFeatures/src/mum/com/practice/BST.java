package mum.com.practice;



public class BST {
	
	
	
	public static boolean bst(int [] a,int start,int end,int key) {
		
		  if(end >start) {
			  
			  int middle = (start + end)/2;
			  System.out.println("the middle now" + a[middle]);
			  if(a[middle] == key) {
				  return true;
				  
			  }else if(a[middle] < key){
				 return   bst(a,middle +1 ,end,key);
				  
			  }else {
			   return  bst(a,start,middle,key);
			  }
			  
		  }else {
			  return false;
		  }
		  
	}
	
	
	
public static void main(String...x) {
	
	int[]a = {1,2,3,4,5,6,7,8,9,10,11,12,13, 14,15};
	
	System.out.print(bst(a,0,a.length,17));
	
	
}

}
