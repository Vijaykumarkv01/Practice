package gratestNumber;
import java.util.Scanner;

public class MainGreatest {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter any three integer values to find greatest");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		GreatestCon gre=new GreatestCon(a,b,c);
	}

}
