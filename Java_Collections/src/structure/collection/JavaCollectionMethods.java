package structure.collection;

import java.util.*;

public class JavaCollectionMethods {
	
	public static void main(String[] args)
	{
		//ArrayList Method
		List one = new ArrayList();
		one.add("Mohon");
		one.add("Eyamin");
		one.add("Julhas");
		System.out.println("ArrayList Elements");
		System.out.print("\t" + one);
		
		//LinkedList
		List two = new LinkedList();
		two.add("Eyamin");
		two.add("Hasan");
		two.add("Khan");
		System.out.println();
		System.out.println(" LinkedList Elements");
		System.out.print("\t" + two);
		
		//HashSet
		Set three = new HashSet();
		three.add("Julhas");
		three.add("Hossain");
		three.add("Mohon");
		System.out.println();
		System.out.println("HashSet Elements");
		System.out.print("\t" + three);
		
		//HashMap
		Map four = new HashMap();
		four.put("MOhon", "20");
		four.put("Eyamin", "50");
		four.put("Julhas", "60");
		System.out.println();
		System.out.println("Map Elements ");
		System.out.print("\t" + four);
		
	}

}
