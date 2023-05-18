package javaCoreInterface;
import java.util.Scanner;
interface Area {
	void area(int a, int b);
	void show() ;
}
interface Perimeter{
	void perimeter();
}


 class Rectangle implements Area,Perimeter{
int length, breadth;
double area,peri;
	@Override
	public void area(int a,int b) {
		length=a;
		breadth=b;
		area=(length*breadth);	
	}
	@Override
	public void perimeter() {
		peri=(2*length)+(2*breadth);
	}
	@Override
	public void show() {
		System.out.println("The area of the rectangle is "+area+" Sq-m");	
		System.out.println("The perimeter of the rectangle is "+peri+" m");
	}	
 }
 
 
class Circle implements Area,Perimeter{
int radius;
double area,peri;
	@Override
	public void perimeter() {
 peri=2*3.142*radius;	
	}
	@Override
	public void area(int a, int b) {
		radius=a;
		 area=3.142*radius*radius;
	}
	@Override
	public void show() {
		System.out.println("The Area of the Circle is "+area);
		System.out.println("The perimeter of the circle is "+peri);
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
		sc.close();
	}

	@Override
	public void area(int a, int b) {
		// TODO Auto-generated method stub
		height=a;
		base=b;
		area=(0.5*base*height);
	}

	@Override
	public void show() {
		System.out.println("The perimeter of the Triangle is "+peri+" m");
		System.out.println("The area of the Rectangle is "+area+"Sq-m");
	}
	
}

