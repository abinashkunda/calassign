package newproject;

import java.util.Scanner;

public class Testing {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		CalculatorOperations cal=new CalculatorOperations();
		char operator;
		int count;
		
		System.out.println("enter an operator: +,-,*,/");
		operator=input.next().charAt(0);
		
		System.out.println("choose the count of numbers");
		count=input.nextInt();
		
		double[] arr=new double[count];
		for(int i=0;i<count;i++) {
			System.out.println("enter number"+ (i+1));
			arr[i]= input.nextDouble();
		}
		switch(operator) {
		case '+':
			if(count==2) {
				cal.setA(arr[0]);
				cal.setB(arr[1]);
				System.out.println("output is"+ cal.add(cal.getA(), cal.getB()));
			}else if(count==3) {
				cal.setA(arr[0]);
				cal.setB(arr[1]);
				cal.setC(arr[2]);
				System.out.println("output is"+ cal.add(cal.getA(), cal.getB(),cal.getC()));
			}
			break;
		case '*':
			if(count==2) {
				cal.setA(arr[0]);
				cal.setB(arr[1]);
				System.out.println("output is"+ cal.multiply(cal.getA(), cal.getB()));
			}else if(count==3) {
				cal.setA(arr[0]);
				cal.setB(arr[1]);
				cal.setC(arr[2]);
				System.out.println("output is"+ cal.multiply(cal.getA(), cal.getB(),cal.getC()));
			}
			break;
		case '-':
			if(count==2) {
				cal.setA(arr[0]);
				cal.setB(arr[1]);
				System.out.println("output is"+ cal.subtraction(cal.getA(), cal.getB()));
			}else if(count==3) {
				cal.setA(arr[0]);
				cal.setB(arr[1]);
				cal.setC(arr[2]);
				System.out.println("output is"+ cal.subtraction(cal.getA(), cal.getB(),cal.getC()));
			}
			break;
		case '/':
			if(count==2) {
				cal.setA(arr[0]);
				cal.setB(arr[1]);
				System.out.println("output is"+ cal.division(cal.getA(), cal.getB()));
			}else if(count==3) {
				cal.setA(arr[0]);
				cal.setB(arr[1]);
				cal.setC(arr[2]);
				System.out.println("output is"+ cal.division(cal.getA(), cal.getB(),cal.getC()));
			}
			break;
			default:
				System.out.println("invalid operator");
				break;
			

			}
		input.close();
		}

	}


