package oops_encap;

import java.util.Scanner;

public class student_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int high = 0;
		String n ="";
		student[] s = new student[3];
		for(int i=0; i<3; i++)
		{
			System.out.println("Enter the Student_Name : ");
			String a = sc.next();
			System.out.println("Enter the Student_ID : ");
			int b = sc.nextInt();
			System.out.println("Enter the CC_Mark : ");
			int c = sc.nextInt();
			System.out.println("Enter the ML_Mark : ");
			int d = sc.nextInt();
			s[i] = new student(a,b,c,d);
		}
		for(int i=0; i<3; i++)
		{
			s[i].disp();
			
		}
		for(int i=0; i<3; i++)
		{
			if(high < s[i].avg()) {
				high = s[i].avg();
				n = s[i].name;
			}
		}
		System.out.println("With "+high +", "+n+" is the higest scorer.");
		sc.close();	
	}

}
