package com.cg.collectionListInterface;
import java.util.*;
public class Linkedlist {

	public static void main(String[] args) {
	LinkedList<Integer> list=new LinkedList<Integer>();
	list.add(1);
	list.add(50);
	list.add(3);
	list.add(28);
	list.addFirst(2);
	list.addLast(100);
	list.add(2,85);
	System.out.println("The list of elements are "+list);
	System.out.println("The first element is "+list.getFirst());
	System.out.println("The Last element is "+list.getLast());
	System.out.println("Removing First element in the List is "+list.removeFirst());
	System.out.println("Removing Last element in the List is "+list.removeLast());
	System.out.println("The list of element is"+list);
	ListIterator<Integer >li=list.listIterator();
	while (li.hasNext()) {
		System.out.print(li.next()+"\t");
	}
	System.out.println();
	li=list.listIterator(list.size());
	while(li.hasPrevious())
	{
		int n=li.previous();
		System.out.print(n+"\t");
		if(n==50)
			li.add(1000);
		if(n==1)
			li.set(9595);
		}
	System.out.println();
	System.out.println(list);
	}
		
}
