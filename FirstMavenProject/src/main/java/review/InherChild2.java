package review;

public class InherChild2 extends InherChild1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//InherChild1 ob1=new InherChild1();
		InherChild2 ob2=new InherChild2();
		ob2.show1();
		ob2.show();
		ob2.display();
		
	}
	
	public void show1() {
		
		System.out.println("Inside second child class");
	}

}
