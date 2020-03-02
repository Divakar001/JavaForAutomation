package StringConcept;

public class StringBufferExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuffer name=new StringBuffer("Divakar");
		System.out.println(name.reverse());//reverse the string

		StringBuffer name1=new StringBuffer("Divakar");
		System.out.println(name1.replace(0, 7, "Dramesh"));
		StringBuffer name2=new StringBuffer("xyzdiva");
		System.out.println(name2.delete(0, 3));

		
		StringBuffer name3=new StringBuffer("mon");
		System.out.println(name3.insert(3, "ika"));
		System.out.println(name3.capacity());

	}

}
