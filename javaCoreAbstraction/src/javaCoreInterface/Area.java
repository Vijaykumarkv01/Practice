package javaCoreInterface;
import java.util.Scanner;
interface Area {
	void area(int a, int b);
}
interface Perimeter{
	void perimeter();
}
 class Rectangle implements Area,Perimeter{
int length, breadth;
double area;
	@Override
	public void area(int a,int b) {
		length=a;
		breadth=b;
		area=(length*breadth);
		System.out.println("The area of the rectangle is "+area+" Sq-m");	
	}
	@Override
	public void perimeter() {
		int peri=(2*length)+(2*breadth);
		System.out.println("The perimeter of the rectangle is "+peri+" m");
		
	}	
 }
class Circle implements Area,Perimeter{
int radius;
	@Override
	public void perimeter() {
double peri=2*3.142*radius;
System.out.println("The perimeter of the circle is "+peri);
		
	}

	@Override
	public void area(int a, int b) {
		radius=a;
		double area=3.142*radius*radius;
		System.out.println("The Area of the Circle is "+area);
	}}
class Triangle implements Area,Perimeter{
	int height,base;
double area,peri;
	@Override
	public void perimeter() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the three sides length of the triangle");
		int a=sc.nextInt();int b=sc.nextInt();int c=sc.nextInt();
		peri=(a+b+c);
		System.out.println("The perimeter of the Triangle is "+peri+" m");
		
	}

	@Override
	public void area(int a, int b) {
		// TODO Auto-generated method stub
		height=a;
		base=b;
		area=(0.5*base*height);
		System.out.println("The area of the Rectangle is "+area+"Sq-m");
	}
	
}

