package com.cg.QueueInterface;
import java.util.*;
public class PriorityQueue1 {

	public static void main(String[] args) {
	PriorityQueue<String> pq=new PriorityQueue<>();
	pq.add("JAVA EE");
	pq.add("JAVA SE");
	pq.add("HTML");
	pq.add("CSS");
	pq.add("JavaScript");
	pq.add("MySql");
System.out.println(pq);
System.out.println(pq.add("React"));
System.out.println(pq.add("Angular"));
System.out.println("The peek element in the PriorityQueuelist is"+pq.peek());
System.out.println(pq.poll());
System.out.println(pq.poll());
System.out.println(pq.remove());
System.out.println(pq.remove("CSS"));
System.out.println(pq);
System.out.println("-------------------------------------------------------------------------------------------------------------");
Iterator <String> li=pq.iterator();
while(li.hasNext()) {
	System.out.print(li.next()+"\t");
}
System.out.println();
System.out.println("The size of the Priorityqueue is  " +pq.size());
}


}
