package com;

import java.util.Scanner;

public class Soluction {
	static Scanner scan=new Scanner(System.in);
	static int a;
	static int b;
	static void acceptInput(){
		System.out.println("Enter 1st Number:");
		a=scan.nextInt();
		System.out.println("Enter 2nd Number");
		b=scan.nextInt();
	}
	public static void main(String[] args) {
		Calculator calc=new CalculatorImpl();//upcasting->abstraction
		while(true){//INFINITI LOOP
			System.out.println("1 : Addition");
			System.out.println("2 : Substraction");
			System.out.println("3 : Multification");
			System.out.println("4 : Division");
			System.out.println("5 : EXIT");
			System.out.println("ENTER THE CHOICE");
			int choice= scan.nextInt();

			if(choice>=1 && choice<=4){
				acceptInput();
			}

			switch(choice){
			case 1:
				System.out.println( calc.add(a, b));
				break;

			case 2:
				System.out.println( calc.sub(a, b));
				break;

			case 3:
				System.out.println( calc.mul(a, b));
				break;

			case 4:
				System.out.println( calc.div(a, b));
				break;

			case 5:
				System.out.println( "THANKYOU");
				System.exit(0);
               
			default:
				System.out.println(calc.displayErrorMessage());

			}
		}
	}
}


