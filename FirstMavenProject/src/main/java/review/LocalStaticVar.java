package review;

public class LocalStaticVar {
	int localid;
	int id=20;
	String name;
static	String college="fdrgd";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		LocalStaticVar ob1=new LocalStaticVar();
		
		ob1.name="anju";
		ob1.localid=100;
		
		System.out.println(ob1.id+" "+ob1.name+" "+college);
System.out.println(ob1.localid);
	}

}
