package collection;

import java.util.Iterator;

public class TreeSet {

	public void treeSetExample() {
		java.util.TreeSet<Integer> TreeSet= new java.util.TreeSet<Integer>();
		TreeSet.add(3);
		TreeSet.add(4);
		TreeSet.add(5);
		TreeSet.add(1);
		TreeSet.add(0);
		System.out.println("Ascending order "+TreeSet);
		
		//first
		System.out.println(TreeSet.first());
		//last
		System.out.println(TreeSet.last());
		//headset
		System.out.println("value lesser the given value "+TreeSet.headSet(4));
		//tailset
		System.out.println("value greater than or equal to the given value "+TreeSet.tailSet(1));
		//subset
		System.out.println("subset values "+TreeSet.subSet(1, 4));
	//comparator
		System.out.println("comparator will give null if the sorting is default n atural order "+TreeSet.comparator());
	
		System.out.println("higher "+TreeSet.higher(0));
		System.out.println("lower "+TreeSet.lower(4));
		System.out.println("++++++++++++++++");
		System.out.println("poll first "+TreeSet.pollFirst() );
		System.out.println("poll last "+TreeSet.pollLast());
		System.out.println("after pooling "+TreeSet);
		System.out.println("decending order "+TreeSet.descendingSet() );
		
		Iterator<Integer> Iterator= TreeSet.iterator() ;
		while(Iterator.hasNext()){
			System.out.println("Iterator "+Iterator.next());
			}
		Iterator<Integer> DecIterator= TreeSet.descendingIterator();
		while(DecIterator.hasNext()) {
			System.out.println("DecIterator "+DecIterator.next());
		}
	}
	public static void main(String[] args) {
		
		TreeSet treeset=new TreeSet();
		treeset.treeSetExample();
	}
}
