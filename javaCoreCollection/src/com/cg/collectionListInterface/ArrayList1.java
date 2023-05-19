package com.cg.collectionListInterface;
import java.util.*;

public class ArrayList1 {

	public static void main(String[] args) {
		List <Integer> al=new ArrayList<>();
		List <Integer> bl=new ArrayList<>();
		bl.add(56);
		bl.add(153);
		bl.add(1001);
		bl.add(369);
		bl.add(789);
		al.add(15);
		al.add(11);
		al.add(7);
		al.add(78);
		al.add(77);
		al.add(63);
		al.add(230);
	    al.addAll(0, bl);
		al.add(5,100);
System.out.println(al);
System.out.println(al.remove(6)+" is removed from the list");
System.out.println(al.set(5, 1500));
System.out.println(al);
Iterator<Integer> ia=al.iterator();
while(ia.hasNext())
	System.out.println(ia.next());
al.removeAll(bl);
System.out.println("The new list is ");
System.out.println(al);
}
}

