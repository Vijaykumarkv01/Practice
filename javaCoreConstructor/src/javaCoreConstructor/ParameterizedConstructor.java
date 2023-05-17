package javaCoreConstructor;

public class ParameterizedConstructor {
	int a,b,add,sub;
	float div1,add1,sub1,c,d,div;
	ParameterizedConstructor(int a,int b){
		System.out.println("This is a parameterized constructor");
		this.a=a;
		this.b=b;
		add=a+b;
		sub=a-b;
		div=(float)a/(float)b;
		System.out.println("Addition of "+a+"and "+b+"is "+add);
		System.out.println("Substraction of "+a+" and "+b+"is "+sub);
		System.out.println("Division of "+a+" and "+b+" is "+div);	
		System.out.println("-------------------------------------------------------------------------------------------------------------");
	}
	ParameterizedConstructor(float a,float b){
		System.out.println("This is a parameterized constructor");
		this.c=a;
		this.d=b;
		add1=c+d;
		sub1=c-d;
		div1=(float)c/(float)d;
		System.out.println("Addition of "+a+"and "+b+"is "+add1);
		System.out.println("Substraction of "+a+" and "+b+"is "+sub1);
		System.out.println("Division of "+a+" and "+b+" is "+div1);	
	}


}
