package review;

public class InterfaceClass implements InterfaceP,InterfaceP2 {

	public static void main(String[] args) {
		
		InterfaceClass obj= new InterfaceClass();
		 obj.print();
		 
		 obj.print2();

	}
	
	public void print() {
		
		System.out.println("Inside child class");
	}
	
	
public void print2() {
		
		System.out.println("Inside child class2");
	}
	
}
