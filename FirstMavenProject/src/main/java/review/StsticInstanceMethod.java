package review;

import java.util.Scanner;

public class StsticInstanceMethod {

	int id;
	String name;
	static String college="dfgrfg";
	public static void main(String[] args) {
		StsticInstanceMethod s1=new StsticInstanceMethod();
		changeCollege();
				s1.getDetails();
		s1.display();
		StsticInstanceMethod.show();

		int result=s1.calc();
		System.out.println(result);
	}
	
	public void getDetails() {
	/*	Scanner sc=new Scanner(System.in);
		System.out.println("enter id");
	 id=sc.nextInt();
	 System.out.println("enter name");
	 name=sc.next();
	 */
		id=10;
		name="dfdr";
		
		
	}
	
	public void display() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(college);
	}
	
	public int calc() {
		
		int a=10;
		int b=20;
		int result =a+b;
		
		return result;
		
		
	}
	static void show() {
		System.out.println("Inside static method");
		
	}
	static void changeCollege() {
		
		college="RDE";
	}

}
