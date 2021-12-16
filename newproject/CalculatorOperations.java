package newproject;

public class CalculatorOperations {
	private double a;
	private double b;
	private double c;
	
	public double getA() {
		return a;
	}
	public void setA(double a) {
		this.a=a;
	}
	public double getB() {
		return b;
	}
	public void setB(double b) {
		this.b=b;
	}
	public double getC() {
		return c;
	}
	public void setC(double c) {
		this.c=c;
	}
	public double add(double a,double b) {
		return a+b;
	}
	public double add(double a,double b,double c) {
		return a+b+c;
	}
	public double multiply(double a,double b) {
		return a*b;
	}
	public double multiply(double a,double b,double c) {
		return a*b*c;
	}
	public double subtraction(double a,double b) {
		return a-b;
	}
	public double subtraction(double a,double b,double c) {
		return a-b-c;
	}
	public double division(double a,double b) {
		return a/b;
	}
	public double division(double a,double b,double c) {
		return a/b/c;
	}
	

}
