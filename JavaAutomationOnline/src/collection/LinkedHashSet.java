package collection;

import java.util.Set;

public class LinkedHashSet {
	
	public void linkedhashSet() {
		Set linkedhashset= new java.util.LinkedHashSet();
		
		linkedhashset.add("a");
		linkedhashset.add("b");
		linkedhashset.add(1);
		linkedhashset.add("c");
		linkedhashset.add("d");
		linkedhashset.add("a");
		System.out.println(linkedhashset);
		linkedhashset.remove("d");
		System.out.println(linkedhashset);
		System.out.println(linkedhashset.size());
		
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet linked=new LinkedHashSet();
		linked.linkedhashSet();
	}

}
