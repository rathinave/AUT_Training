package pkg1;

import java.util.Scanner;

public class Demo8_Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = 20, b = 15, d = 0;
		System.out.print("Enter the Arithmetic operator you want to do : ");
		char c = sc.next().charAt(0);
		switch(c)
		{
		case '+':
			d = a + b;
			System.out.println("Addition");
			break;
		case '-':
			d = a - b;
			System.out.println("Subtraction");
			break;
		case '*':
			d = a * b;
			System.out.println("Multiplication");
			break;
		case '/':
			d = a / b;
			System.out.println("Division");
			break;
		default:
			System.out.println("Nothing is Matched");
		}
		System.out.println(a+" "+c+" "+b+" = "+d);
		
		sc.close();

	}

}
