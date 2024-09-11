package package1;

public class ThrowsClass {

	public int div(int i,int j) throws ArithmeticException{
		
	int result=i/j;
	return result;
		
		
	}
	/*public void div() throws ArithmeticException{
		
		int res=12/0;
		
	}*/
	
	
	public static void main(String[] args) {
		
		ThrowsClass ob1=new ThrowsClass();
		try {
			
			System.out.println(ob1.div(12,0));
	//ob1.div();
		}
		catch(ArithmeticException e) {
			
			System.out.println("division not possible");
		}
		
		System.out.println("outside class");

	}

}
