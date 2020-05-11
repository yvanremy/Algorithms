package mum.com.String;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;

public class StringAlgorithm {
	
	public static String longestCommonString(String [] arr) {
		int length = arr.length;
		
		String first = arr[0];
		 
		return "";
	}
	
	
	public static void firstUnrepeatable(String a) {
	 int flag = 0;
		for (int i =0 ; i<a.length() ; i++) {
			for(int j = i +1 ; j < a.length() ;j++) {
				if (a.charAt(i) == a.charAt(j)) {
					flag = 1;
				}
				 
			}
			if(flag == 0) {
				System.out.println(a.charAt(i));
				break;
			}else {
				flag=0;
			}
		}
		
	}
	
	
	public static void getDuplicates(String a) {
		List<Character>chars = new ArrayList<>();
		
		for (int i =0 ; i <=a.length() ; i++) {
			for(int j = i +1 ; j < a.length() ; j++) {
				if(a.charAt(i) == a.charAt(j)) {
					if(!chars.contains(a.charAt(i))) {
						chars.add(a.charAt(i));
						System.out.print(a.charAt(i) +" ");
					}
					
				}
			}
		}
		
	}
	
	public static void swapString(String one, String two) {
		
		 one = one +two;
		 two = one.substring(0,one.length() - two.length());
		 one = one.substring(two.length());
		 
		 System.out.println("first one :: "+one+" second :: "+two);
	}
	
	
	public static boolean getAnagram(String one, String two) {
			if(one.length() == two.length()) {
				 for(int i =0 ; i<one.length() ; i++) {
				    	if(!two.contains(one.subSequence(i, i+1))) {
				    		return false;
				    	}
				    }
				 return true;
			}else {
				return false;
			}
			 
	}
	
	static {
		System.out.println("this is the static block");
	}
	
public static void main(String...z) {
//	String one = "arty";
//	String two = "mary";
//	String numbers = "779939";
	
//	Pattern p = Pattern.compile("-?\\d+(\\.\\d+)?");
//	
//	if(p.matcher(numbers).matches()) {
//		System.out.println("this matches");
//	}else {
//		System.out.println("this is does not matches");
//	}
	
	//swapString(one,two);
	//firstUnrepeatable("MMorning");
	//getDuplicates("hagenimana");
	
	System.out.println("this is the main me");
	StringAlgorithm s = new StringAlgorithm();
	StringAlgorithm s2 = new StringAlgorithm() ;
	
	 
	 
	
	
}
}
