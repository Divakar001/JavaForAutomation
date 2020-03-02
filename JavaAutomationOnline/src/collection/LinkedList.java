package collection;
public class LinkedList {

	public void linkedListOperation() {

		java.util.LinkedList<Integer> linked=new java.util.LinkedList<Integer>();
		linked.add(0);
		linked.add(1);
		linked.add(2);
		linked.add(3);
		linked.add(3);
		System.out.println(linked);
		linked.addFirst(1);
		System.out.println(linked);//adding number 1 at first
		
		linked.addLast(6);
		System.out.println(linked); //adding number 6 at last
		
		System.out.println(linked.getFirst());
		System.out.println(linked.get(2));
		System.out.println(linked.removeFirst());
		System.out.println(linked.removeLast());
		System.out.println("======");
		System.out.println(linked);
		System.out.println(linked.poll());//it will remove the first number
		System.out.println(linked);
		System.out.println(linked.pollLast());//it will remove the last number
		System.out.println(linked);
		System.out.println(linked.removeFirstOccurrence(2));
		System.out.println(linked);
		System.out.println("++++++++");
		linked.add(4);
		linked.add(5);
		linked.add(6);
		linked.add(8);
		System.out.println(linked);
		
		/*for (Integer integer : linked) {
			System.out.println(integer);
		*/	
		
		for (int i = 0; i < linked.size(); i++) {
			System.out.println(linked.get(i));
			
			
		} 
		 
	}
	public static void main(String[] args) {

		LinkedList list=new LinkedList();
		list.linkedListOperation();
	}
	
}
