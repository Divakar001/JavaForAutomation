package collection;

import java.util.HashMap;

public class LinkedHashMap {




	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//linked hashMap
		java.util.LinkedHashMap<String, String> linkedMap=new java.util.LinkedHashMap<String, String>();
		linkedMap.put("Iron Man", "Tony Stark");
		linkedMap.put("Bat Man", "Bruce Wayne");
		linkedMap.put("Super Man", "clark");
		System.out.println(linkedMap);	

		//hashMap
		HashMap<String, String> hashmap=new HashMap<String, String>();
		
		hashmap.put("Iron Man", "Tony Stark");
		hashmap.put("Bat Man", "Bruce Wayne");
		hashmap.put("Super Man", "clark");
		System.out.println(hashmap);	




	}

}
