package javaCoreInterface;

import java.util.Scanner;

public class MainArea {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter your Choice to Find Area and Perimeter of the\n1.Rectangle or Square\n2.Circle\n3.Triangle");
		 int choice=sc.nextInt();
		 switch(choice) {
		 case 1:{
			 System.out.println("Enter the Length and Breadth of Rectangle or Square");
			 int len=sc.nextInt();
			 int bre=sc.nextInt();
			 Rectangle rec=new Rectangle();
			 rec.area(len, bre);
			 rec.perimeter();
			 rec.show();
			 break;
		 }
		 case 2:{
			 System.out.println("Enter the radius of the Circle");
			 int red=sc.nextInt();
			 Circle ci=new Circle();
			 ci.area(red, 0);
			 ci.perimeter();
			 ci.show();
			 break;
		 }
		 case 3:{
			 System.out.println("Enter the Base and Height of the Triangle");
			 int base=sc.nextInt();
			 int hei=sc.nextInt();
			Triangle tri=new Triangle();
			 tri.area(base,hei);
			 tri.perimeter();
			 tri.show();
			 break;
		 }
		 default :{
			 System.out.println("You enterd wrong Choice");
		 }
		 }
		 sc.close();
	}

}
