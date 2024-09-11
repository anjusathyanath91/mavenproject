package package1;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionColours {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> colours=new ArrayList<String>();
		colours.add("Red");
		colours.add("Black");
		colours.add("White");
		colours.add("Yellow");
		colours.add("Violet");
		//System.out.println(colours);
		
		//System.out.println(colours.get(2));
	/*	Iterator<String> itr=colours .iterator();
		
	while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}*/

//System.out.println(colours.contains("orange"));
System.out.println(colours.remove(2));
System.out.println(colours);

System.out.println(colours.contains("Black"));

	}

}
