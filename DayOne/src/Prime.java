import java.util.*;
public class Prime {

	public static void main(String[] args) {
		int num,i=1,c=0;
		Scanner sc=new Scanner(System.in);
	      System.out.println("To Check Number Prime or Not\nEnter Number : ");
	      num=sc.nextInt();
	      while(i<=num)
	      {
	            if(num%i==0)
	            c++;
	            i++;
	      }
	      if(c==2) {
	           System.out.println(num+" is prime number");}
	      else {
	           System.out.println (num+" is Not Prime Number");}

	}

}
