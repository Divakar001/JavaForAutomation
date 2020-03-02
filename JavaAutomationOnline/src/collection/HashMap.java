package collection;

import java.util.Map;

public class HashMap {

	public void HashmapExample() {
		java.util.HashMap<Integer, String> employeeMap=new java.util.HashMap<Integer, String>();
		employeeMap.put(1,"divakar");
		employeeMap.put(2,"arun");
		employeeMap.put(3,"dhana");
		employeeMap.put(4,"anto");
		employeeMap.put(5,"prashanth");
		employeeMap.put(6,"gokul");
		System.out.println("employee id and name : "+employeeMap);

		//to make copy of existing map
		Map<Integer, String> duplicate= new java.util.HashMap<Integer, String>();
		duplicate.putAll(employeeMap);
		System.out.println("duplicate "+duplicate);
		//clear
		duplicate.clear();
		System.out.println("after clearing "+duplicate);
		//check whether it is present or not
		System.out.println(employeeMap.containsKey(4));
		System.out.println(employeeMap.containsValue("gokul"));
		System.out.println(employeeMap.containsKey(7));
		//check it is empty or not
		System.out.println(duplicate.isEmpty());
//to retrive the key set
		System.out.println(employeeMap.keySet());
		//find the value with key
		System.out.println(employeeMap.get(3));
		
		//find the all value
		System.out.println(employeeMap.values()) ;
		
		//entry set
		System.out.println(employeeMap.entrySet());
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap employee=new HashMap();
		employee.HashmapExample();
	}

}
