package week4.day4;

import java.util.HashSet;
import java.util.Set;

public class Unique {

	public static void main(String[] args) {
		String name="babub";
		
		char[]charArray =name.toCharArray();
		System.out.println(charArray);
		Set<Character> name1=new HashSet<Character>();
		Set<Character> name2=new HashSet<Character>();

		
//		name1.add('b');
//		name1.add('a');
//		name1.add('b');
//		name1.add('u');
//		name1.add('b');
		//System.out.println(name1);
		
//		for(int i=0;i<name1.size();i++){
//			for(int j=i+1;j<name1.size();j++) {
//				if(name1!=charArray) {
//					System.out.println(charArray);
//					//System.out.println(name1);
//				}
//				}
//				}
//				
			
			for(Character value:charArray) {
//				System.out.println(value);
			
				if(name1.contains( value)){
				name1.add(value);
				name2.remove(value);
				
				}
				else {
				name1.add(value);
				name2.add(value);
	
			System.out.println(name2);
				}
			
	}
}
}	

