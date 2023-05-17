package com.cg.abstractclass;
abstract class Shape{
	abstract void draw(); 
}
class Rectangle extends Shape{
	void draw() {
		System.out.println("Drawing a rectangle");
	}
}
class Circle extends Shape{
	void draw() {
		System.out.println("Drawing a Circle");
	}
}
public class Client {

	public static void main(String[] args) {
		Rectangle a=new Rectangle();
		a.draw();
		Circle b=new Circle();
		b.draw();

	}

}
