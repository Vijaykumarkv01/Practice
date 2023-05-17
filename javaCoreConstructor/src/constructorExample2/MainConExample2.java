package constructorExample2;
import java.util.*;
public class MainConExample2 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Student details");
	System.out.println("Enter Student name");
	String name=sc.nextLine();
	System.out.println("Enter Student Roll in interger format");
	int roll=sc.nextInt();
	sc.nextLine();
	System.out.println("Enter Student usn");
	String usn=sc.nextLine();
	System.out.println("Enter Student ph");
	String ph=sc.nextLine();
	System.out.println("Enter Student department");
	String dep=sc.nextLine();
	System.out.println("Enter Student age");
	int age=sc.nextInt();
	ConExample2 st=new ConExample2(name,roll,usn,ph,dep,age);
	System.out.println("------------------------------------------------------------------------------------------------------------");
	System.out.println("Name ="+st.name());
	System.out.println("Age ="+st.age());
	System.out.println("RollNumber ="+st.roll());
	System.out.println("Usn ="+st.usn());
	System.out.println("PhoneNumber ="+st.ph());
	System.out.println("Department ="+st.dep());
	sc.close();
	}

}
