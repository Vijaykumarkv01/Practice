package constructorExample2;

public class ConExample2 {
	private String name;
    private int roll;
	private String usn;
	private String ph;
	private String dep;
	private int age;
	ConExample2(String name,int roll,String usn,String ph, String dep, int age){
		this.name=name;
		this.roll=roll;
		this.usn=usn;
		this.ph=ph;
		this.dep=dep;
		this.age=age;
		
	}
	public String name() {
		return this.name;
		
	}
	public int age() {
		return this.age;
		
	}
	public int roll() {
		return this.roll;
		
	}
	public String usn() {
		return this.usn;
		
	}
	public String ph() {
		return this.ph;
		
	}
	public String dep() {
		return this.dep;
		
	}
}
