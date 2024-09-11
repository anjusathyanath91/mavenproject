package package1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
public class ArrayListEx {

	public static void main (String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> fruits2=new HashSet<String>();
		
		fruits2.add("apple");
		fruits2.add("mango");
		fruits2.add("orange");
		fruits2.add("grapes");
		fruits2.add("grapes");
		System.out.println(fruits2);
		fruits2.remove("apple");
		
		
		
		LinkedList<Integer> num=new LinkedList<Integer>();
	num.add(100);
	num.add(200);
	num.add(300);
	System.out.println(num);
		
		
		
	HashMap<Integer,String> map=new HashMap<Integer,String>();//Creating HashMap    
	   map.put(1,"Mango");  //Put elements in Map  
	   map.put(2,"Apple");    
	   map.put(3,"Banana");   
	   map.put(4,"Grapes");   
	       
	   System.out.println("Iterating Hashmap...");  
	   for(Map.Entry m : map.entrySet()){    
	    System.out.println(m.getKey()+" "+m.getValue());    
		
	   }

		
		
		
		
		
		/*

		ArrayList<String> fruits=new ArrayList<String>();
		fruits.add("apple");
		fruits.add("orange");
		fruits.add("grapes");
		fruits.add("grapes");
		fruits.add("mango");
		//fruits.remove("mango");
		System.out.println(fruits);
		fruits.add(1,"pineapple");
		fruits.add(2,"pear");
		
		System.out.println(fruits.get(2));
		System.out.println(fruits.remove(1));
		fruits .set(1,"anar");
		System.out.println(fruits.contains("apple"));
		System.out.println(fruits.lastIndexOf("grapes"));
		Collections.sort(fruits);
		
		
		ArrayList<String> veg=new ArrayList<String>();
		veg.add("tomato");
		veg.add("potato");
		veg.add("pumpkin");
		System.out.println(veg.get(2));
		fruits.addAll(veg);
		Iterator<String> itr=fruits .iterator();
		
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}
		
		for (String f:fruits) {
			
			System.out.println(f);
		}*/
		
	}

}
