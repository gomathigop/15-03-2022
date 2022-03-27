package secondpackage;

import java.util.Scanner;


public class Inheritance2 {
	class Parent{
		private int sal; //data accessed with in class , scope is with in class
		public String name;
		protected int age;
		int accno;
		void input() {
			Scanner sc=new Scanner(System.in);

			System.out.println("Enter age");
			age=sc.nextInt();
			System.out.println("Enter salary");
			sal=sc.nextInt();
			System.out.println("Enter Accno");
			accno=sc.nextInt();
			System.out.println("Enter name");
			name=sc.next();
		}
		void printSal() {
			System.out.println("Salary="+sal);
		}
	}
	class Child extends Parent{ //dependent class

		void display() {
			//System.out.println("sal ="+sal); //private not accesseble
			System.out.println("Name="+name);
			System.out.println("age="+age);
			System.out.println("accno="+accno);
		}
	

}
}
