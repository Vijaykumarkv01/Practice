package gratestNumber;

public class GreatestCon {
	GreatestCon(int a, int b, int c){
		if(a>b && a>c)
			System.out.println(a+" is the gratest number");
		if(b>c&&b>a)
			System.out.println(b+" is the greatest number");
		if(c>a&&c>b)
			System.out.println(c+" is the gratest number");
	}
}
