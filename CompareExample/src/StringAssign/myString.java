package StringAssign;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class myString {
	
	public static void main(String[] args)
	{
		
	ArrayList<String> List= new ArrayList<>();
	
	List.add("pratiksha");
	List.add("tom");
	List.add("abc");
	List.add("jerry");
	List.add("welcome");
	
	System.out.println("sort by Length of the string");
	
	Collections.sort(List, Comparator.comparing(String::length));
	List.forEach(System.out::println);
	
    
//Collections.sort(List, String.CASE_INSENSITIVE_ORDER);
//List.forEach(System.out::println);
	}
}
