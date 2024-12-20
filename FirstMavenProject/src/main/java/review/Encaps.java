package review;

public class Encaps {

	private int age;
	private String name;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Encaps e1=new Encaps();
e1.setAge(10);
e1.setName("Anju");
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	

}
