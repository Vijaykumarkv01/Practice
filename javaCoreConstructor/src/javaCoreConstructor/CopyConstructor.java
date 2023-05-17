package javaCoreConstructor;

public class CopyConstructor {
String nam,dep;
int ag;

	CopyConstructor(DefaultConstructor s){
		System.out.println("This is a Copy constructor");
		ag=s.age;
		nam=s.name;
		dep=s.Dep;
		
	}

}
