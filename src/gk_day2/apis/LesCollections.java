package gk_day2.apis;

import java.util.ArrayList;
import java.util.TreeSet;

public class LesCollections {

	
	public static void main(String[] args) {
	
		//ArrayList<Integer> l1 = new ArrayList<>();
		/*TreeSet <Integer> l1 = new TreeSet();
		
		l1.add(20);
		l1.add(30);
		l1.add(20);
		l1.add(1);
		System.out.println(l1);*/
		
		TreeSet<String>names = new TreeSet<>();
		//ArrayList<String> names = new ArrayList<>();
		names.add("marc");
		names.add("sam");
		names.add("jean");
		names.add("marc");
		System.out.println(names);
		
	}
}
