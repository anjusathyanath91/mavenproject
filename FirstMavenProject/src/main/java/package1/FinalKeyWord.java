package package1;

public class FinalKeyWord {
	final int speedlimit=100;
	
	

	
	final void run() {
		
		//speedlimit=120; final variable value can't be change
		System.out.println(speedlimit);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FinalKeyWord ob1=new FinalKeyWord();
		ob1.run();
		
	}

}
