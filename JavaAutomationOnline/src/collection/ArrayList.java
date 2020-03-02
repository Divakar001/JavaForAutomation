package collection;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayList {


	public void arrayListExample() {
		List<String> arraylist=new java.util.ArrayList<String>();
		arraylist.add("dhana");  
		arraylist.add("divakar");
		arraylist.add("arun");
		arraylist.add("anto");
		arraylist.add("anto");
		System.out.println(arraylist);//it wil print the added names

		System.out.println(arraylist.get(2));//it will give the string based on the index value
		System.out.println(arraylist.indexOf("anto"));//it will give number position
		System.out.println(arraylist.lastIndexOf("anto"));//it will give last position

		List<String> anotherlist= new java.util.ArrayList<String>();
		anotherlist.addAll(arraylist);

		/*
		 * System.out.println(anotherlist); 
		 * anotherlist.clear();
		 * System.out.println(anotherlist); 
		 * System.out.println(anotherlist.isEmpty());
		 */
		//arraylist.remove(2);
		//System.out.println(arraylist);


		arraylist.remove("arun");
		System.out.println(arraylist);
		arraylist.set(0, "divakar");
		System.out.println(arraylist);
		System.out.println(arraylist);

		System.out.println(arraylist.isEmpty());
		//for each
		for (String string : arraylist) {
			System.out.println(string);

		}//using for loop
		for(int i=0;i<arraylist.size();i++) {
			System.out.println(arraylist.get(i));
		}

		System.out.println("=====================");
		ListIterator<String> iterator=arraylist.listIterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());

		}

		while(iterator.hasPrevious()) {
			System.out.println(iterator.previous());
		}System.out.println("________");


		Iterator<String>	iterator1=arraylist.iterator();
		while (iterator1.hasNext()) {
			System.out.println(iterator1.next());
		}

	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list=new ArrayList();
		list.arrayListExample();
	}

}
