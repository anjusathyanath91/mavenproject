package package1;

public class ThrowClass {
	
	public static void validate(int age) {
		
		if(age>18) {
			  throw new ArithmeticException("not eligible to vote");    
        }  
        else {  
            System.out.println("eligible to vote");  
        }  
		}
			
	

	public static void main(String[] args) {
	validate(20);
    System.out.println("inside main class");
	}

}
