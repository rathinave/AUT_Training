package collections;

import java.util.LinkedList;

public class linkedlist1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> ll = new LinkedList<>();
		ll.add("red");
		ll.add("yellow");
		ll.add("green");
		System.out.println(ll);
		ll.add("black");
		System.out.println(ll);
		ll.add(1,"blue");
		System.out.println(ll);
		
		System.out.println("First : "+ll.getFirst());
		System.out.println("Last : "+ll.getLast());
		ll.removeFirst();
		ll.removeLast();
		System.out.println(ll);

	}

}
