import java.util.*;
public class Count {
	Count(int a,int b){
		
		int count=0;
		for(int i=a;i<=b;i++) 
		{
		System.out.println(i);
		count +=i;
		}
		System.out.println("The counting from "+a+" and "+b+" is " +count);
		}

}
