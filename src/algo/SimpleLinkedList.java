package algo;

import java.util.LinkedList;

public class SimpleLinkedList {
	public static void main(String[] args){
		LinkedList<Integer> l = new LinkedList<>();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
		l.add(3);
		
		if(l.contains(3)){
			System.out.println(l.indexOf(3) + " "+l.getLast());
			l.remove(3);
		}
		
		System.out.println(l);
	}

}
