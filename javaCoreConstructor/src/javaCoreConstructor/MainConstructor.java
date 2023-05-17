package javaCoreConstructor;

import java.util.Scanner;

public class MainConstructor {

	public static void main(String[] args) {
		DefaultConstructor s1 =new DefaultConstructor();
		System.out.println("The name of the Student is "+s1.name);
		System.out.println("The age of the Student is "+s1.age);
		System.out.println("Departmnet = "+s1.Dep);
		System.out.println("------------------------------------------------------------------------------------------------------");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any two integer number to perform addition,Substraction and division");
		int a=sc.nextInt();
		int b=sc.nextInt();
		ParameterizedConstructor s2= new ParameterizedConstructor(a,b);
		System.out.println("Enter any two floating point number to perform addition,Substraction and division");
		float c=sc.nextFloat();
		float d=sc.nextFloat();
		ParameterizedConstructor s3= new ParameterizedConstructor(c,d);
		System.out.println("------------------------------------------------------------------------------------------------------");
		CopyConstructor c1=new CopyConstructor(s1);
		System.out.println("The name of the Student is "+c1.nam);
		System.out.println("The age of the Student is "+c1.ag);
		System.out.println("Department is "+c1.dep);
		

	}

}
