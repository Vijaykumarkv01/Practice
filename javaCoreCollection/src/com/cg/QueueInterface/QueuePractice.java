package com.cg.QueueInterface;
import java.util.*;
public class QueuePractice {
public static void main(String Args[]) {
	Scanner sc=new Scanner(System.in);
	Queue<Integer>qu=new LinkedList<Integer>();
	System.out.println("Enter the number of elements to add");
	int n=sc.nextInt();
	System.out.println("Enter the elements");
	for(int i=0;i<n;i++) {
		int addd=sc.nextInt();
		qu.add(addd);
	}
	System.out.println(qu);
	System.out.println("The head of the Queuelist is "+qu.peek());
	System.out.println("The size of the queue is "+qu.size());
	qu.poll();
	qu.poll();
	System.out.println(qu);
	System.out.println("The size of the queuelist is "+qu.size());
	sc.close();
}
}
