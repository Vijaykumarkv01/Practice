package javaCoreAbstraction;

public class MainAbs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Suzuki su=new Suzuki();
System.out.print("The name of the car is =");su.modelName();
System.out.print("The colour of the car is =");su.carColour();
System.out.print("The modelof the car is =");su.carModel();
su.start();
su.stop();
System.out.println("--------------------------------------------------------------------------------------------------------------");
Mahindra ma=new Mahindra();
System.out.print("The name of the car is =");ma.modelName();
System.out.print("The colour of the car is =");ma.carColour();
System.out.print("The modelof the car is =");ma.carModel();
ma.start();
ma.stop();
	}

}