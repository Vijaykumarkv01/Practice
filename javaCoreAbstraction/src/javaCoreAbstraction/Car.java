package javaCoreAbstraction;

public abstract class Car{
public abstract void modelName();
public abstract void carColour();
public abstract void carModel();
public void start () {
	System.out.println("car engine is Starting");
};
public void stop() {
	System.out.println("car engine Stopping");
};
}
