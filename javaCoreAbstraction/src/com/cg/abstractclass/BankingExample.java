package com.cg.abstractclass;
abstract class Bank{
	abstract int rateOfInterest();
}
class SBI extends Bank{

	@Override
	int rateOfInterest() {
		// TODO Auto-generated method stub
		return 8;
	}
}
class HDFC extends Bank{

	@Override
	int rateOfInterest() {
		// TODO Auto-generated method stub
		return 12;
	}
	
}
public class BankingExample{
	public static void main(String args[]) {
		SBI sbi=new SBI();
		HDFC hdfc=new HDFC();
		System.out.println("The rate of interest in SBI is "+sbi.rateOfInterest()+"%"+"\nThe rate of interest in HDFC is "+hdfc.rateOfInterest()+"%");
		
	}
}