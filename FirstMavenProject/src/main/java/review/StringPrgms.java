package review;

public class StringPrgms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Program";

		String s2="java";
		String s3= new String("program");


		System.out.println(s1.length());
		System.out.println(s2.charAt(2));
		System.out.println(s2.toUpperCase());
		System.out.println(s3.toLowerCase());
		System.out.println(s3.substring(2));

		System.out.println(s3.substring(2,4));
		System.out.println(s3.equals(s1));
		System.out.println(s3.equalsIgnoreCase(s1));
		System.out.println(s1==s3);
		System.out.println(s1==s2);
		System.out.println(s1.contains(s3));

		/*System.out.println(s1.concat("test"));

		System.out.println ("String buffer");
		StringBuffer sb1=new StringBuffer("hello");

		System.out.println(sb1);
		sb1.append("anju");
		System.out.println(sb1);
		System.out.println(sb1.reverse());


		StringBuilder sb2=new StringBuilder("hello");
		System.out.println(sb2);
		sb2.append("anju");
		System.out.println(sb2);
		System.out.println(sb2.reverse());*/


	}

}
