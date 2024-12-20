package review;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> num=new ArrayList<Integer>();
		num.add(100);
		num.add(200);
		num.add(300);
		Iterator<Integer> itr=num.iterator();
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}
		
	}

}
