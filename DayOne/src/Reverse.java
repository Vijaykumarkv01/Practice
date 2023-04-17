import java.util.*;
public class Reverse {

	public static void main(String[] args) {
		int n ;
		Scanner sc = new Scanner ( System .in ) ;
		System.out.println("Enter the number : ");
		n = sc . nextInt ( ) ;
		int rev=0;
		while(n!=0)
		{
		int rem=n%10;
		rev=rev*10+rem;
		n=n/10;
		}
		System.out.println("reverse of the number is : " + rev);
	}

}
