package collection;
//import java.util.HashSet;

import java.util.Iterator;

public class HashSet {
	
	
	public void basicHashset() {
		java.util.HashSet<String> hash= new java.util.HashSet<String>();
		hash.add("a");
		hash.add("b");
		hash.add("c");
		hash.add("c");
		hash.add(null);
		hash.add("d");
		hash.add("e");
		System.out.println(hash);
		System.out.println(hash.remove("d"));
		System.out.println(hash);
		System.out.println(hash.contains("a"));
	}
		//using iterator
	public void usingIterator() {
		java.util.HashSet<String> hashset=new java.util.HashSet<String>();
		hashset.add("a");
		hashset.add("b");
		hashset.add("c");
		hashset.add("d");
		Iterator<String> hash= hashset.iterator();
		{
			while(hash.hasNext()){
			System.out.println("Iterator "+hash.next());
			}
		//}
		//public void hashset12() {
			//java.util.HashSet<String> hashset1=new java.util.HashSet<String>();
			/*
			 * hashset1.add("a"); hashset1.add("b"); hashset1.add("c"); hashset1.add("d");
			 */
			for (String string : hashset) {
				System.out.println("forEach "+string);
			}
				
			}
		}

	public static void main(String[] args) {
		HashSet hashset=new HashSet();
		hashset.basicHashset();
		hashset.usingIterator();
	
		
		


	}

}
