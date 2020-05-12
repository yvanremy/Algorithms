package mum.com.practice;


class Node{
	private  Integer value;
	private  Node left;
	private Node right;
	 
	public Node(Integer value) {
		super();
		this.value = value;
	}
	public Node(Integer value, Node left, Node right) {
		super();
		this.value = value;
		this.left = left;
		this.right = right;
	}
	public Integer getValue() {
		return value;
	}
	public void setValue(Integer value) {
		this.value = value;
	}
	public Node getLeft() {
		return left;
	}
	public void setLeft(Node left) {
		this.left = left;
	}
	public Node getRight() {
		return right;
	}
	public void setRight(Node right) {
		this.right = right;
	}
	  
}

public class BST {
	
	public static  Node nde;
	
	public BST() {
		nde = null;
	}
	
	public static void add(Integer a) {
		if(nde == null) {
			nde = new Node(a,null,null);
		    return;
		}
		Node root = nde;
	    boolean  inserted = false;
	    while(!inserted) {
	    	
	    	if(root.getValue() > a) {
	    		if(root.getLeft() != null) {
	    			root = root.getLeft();
	    		}else {
	    			root.setLeft(new Node(a, null, null));
	    			inserted =true;
	    		}
	    		
	    	}else if(root.getValue() < a) {
	    		if(root.getRight() != null) {
	    			root = root.getRight();
	    		}else {
	    			root.setRight(new Node(a, null, null));
	    			inserted =true;
	    		}
	    		
	    	}
	    }
		
	
	}
	
	public static void print(Node a) {
		 
		if(a == null) {
			return;
		}else {
			print(a.getLeft());
			System.out.println(a.getValue());
			print(a.getRight());
		}
	}
	 
	public static boolean bst(Integer [] a,Integer start,Integer end,Integer key) {
		
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
	
	
	public static boolean search(Node n, Integer a) {
		
		if(n == null) {
			return false;
		}else {
		 
				if(n.getValue() == a) {
					return true;
				}else if(n.getValue() > a ) {
					return search(n.getLeft(),a);
				}else if(n.getValue() < a) {
					return search(n.getRight(),a);
				}else {
					return false;
				}
		}
	}
	
	
	
public static void main(String...x) {
	
	Integer[]a = {1,8,2,3,9,5,4};
	
//	System.out.print(bst(a,0,a.length,17));
	
	
	for(Integer i : a) {
		add(i);
	}
	 
	//print(nde); 
	 System.out.println("the element is found : "+search(nde,0));
}

}
