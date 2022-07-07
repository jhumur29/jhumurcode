package java_practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

public class CollectionsInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//arraylist follows insertion order;
		//arralist allows duplicate;
		List<String>array = new ArrayList<String>();
		array.add("milk");
		array.add("egg");
		array.add("banana");
		array.add("milk");
		array.add("Apple");
		array.add("orange");
		array.add(null);
		
		System.out.println(array.toString());

		List<String>array2 = new LinkedList<String>();
		array2.add("milk");
		array2.add("egg");
		array2.add("banana");
		array2.add("milk");
		array2.add("Apple");
		array2.add("orange");
		array2.add(null);
		System.out.println(array2.toString());
		
		
		HashSet<String> x= new HashSet<String>();
		x.add("Milk");
		x.add("Egg");
		x.add("Banana");
		x.add("Milk");
		x.add("Apple");
		x.add("Orange");
		x.add(null);
		System.out.println(x.toString());
		
		LinkedHashSet<String> y = new LinkedHashSet<String>();
		y.add("Milk");
		y.add("Egg");
		y.add("Banana");
		y.add(null);
		y.add("Milk");
		y.add("Apple");
		y.add("Orange");
		y.add(null);
		System.out.println(y.toString());
		
		TreeSet<String> z =new TreeSet<String>();
		z.add("Milk");
		z.add("Egg");
		z.add("Banana");
		//z.add(null); TressSet does not allow null value;
		z.add("Milk");
		z.add("Apple");
		z.add("Orange");
		//z.add(null);
		System.out.println(z.toString());
		
		
		
		
		
		
		

	}

}
