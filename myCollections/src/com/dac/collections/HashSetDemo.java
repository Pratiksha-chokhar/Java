package com.dac.collections;
import java.util.HashSet;
public class HashSetDemo {

	public static void main(String[] args) {
			HashSet<String> countSet = new HashSet<>();
			
			//ADD
			countSet.add("India");
			countSet.add("China");
			countSet.add("US");
			countSet.add("London");
			
			String strIndia = new String("India");
			System.out.println("strIndia hashCode :: "+strIndia.hashCode());
			String str2 = new String("India");
			System.out.println("str2 hashCode :: "+str2.hashCode());
					
			//DUPLICATE ELEMETNS ARE IGNORED
			countSet.add("india");
			countSet.add("London");
			countSet.add(strIndia);
			countSet.add(str2);
			
			//SIZE AND EMPTY
			System.out.println("Size of the Set :: "+countSet.size());
			System.out.println("Isempty :: "+countSet.isEmpty());
			
			
			System.out.println( countSet );
			
			
		}

	}


