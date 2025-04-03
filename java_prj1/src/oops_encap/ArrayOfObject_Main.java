package oops_encap;

import java.util.Scanner;

public class ArrayOfObject_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Student_ArrayOfObject[] sa = new Student_ArrayOfObject[3];
		for(int i=0; i<3; i++)
		{
			System.out.println("Enter the Student Name : ");
			String a = sc.next();
			System.out.println("Enter the Student ID : ");
			int b = sc.nextInt();
			System.out.println("Enter the CC_Mark : ");
			int c = sc.nextInt();
			System.out.println("Enter the ML_Mark : ");
			int d = sc.nextInt();
			sa[i] = new Student_ArrayOfObject(a,b,c,d);	
		}
		for(int i=0; i<3; i++)
		{
			sa[i].disp();
		}
		Student_ArrayOfObject max = Student_ArrayOfObject.findmax(sa);
		
		System.out.println("With "+max.fname +", "+max.a+" is the higest scorer.");
		
		
		sc.close();
		
		
		

	}

}
