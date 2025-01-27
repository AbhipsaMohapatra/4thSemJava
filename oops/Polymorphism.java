package oops;

import java.util.function.IntConsumer;
//COMPILE TIME POLYMORPHISM

class Calc{
	static int Multiply(int a,int b) {
		return a*b;
	}
	static double Multiply(double a,double b) {
		return a*b;
	}
	static int Multiply(int a,int b,int c) {
		return a*b*c;
	}
}

public class Polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Calc.Multiply(2, 4));
		System.out.println(Calc.Multiply(4.5,7.0 ));
		System.out.println(Calc.Multiply(3, 2, 1));
		

	}

}
