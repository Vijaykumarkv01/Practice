package com.cg.abstractclass;
abstract class Bike{
	abstract void run();//Declaration
	void display() {
		System.out.println("Bike is moving");
	}
}
//Concrete Class
class Honda extends Bike{
	void run() {
		System.out.println("Honda Bike is Running");
	}
}
public class Main {

	public static void main(String[] args) {
 Honda a=new Honda();
 a.display();
 a.run();

	}

}
