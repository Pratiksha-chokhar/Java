package com.dac.collections;

import java.util.HashSet;

	public class HashDemo {
		
		public static void main(String[] args) {
			HashSet<String> countrySet = new HashSet<>();
			
			//ADD
			countrySet.add("India");
			countrySet.add("China");
			countrySet.add("US");
			countrySet.add("London");
			
			String strIndia = new String("India");
			System.out.println("strIndia hashCode :: "+strIndia.hashCode());
			String str2 = new String("India");
			System.out.println("str2 hashCode :: "+str2.hashCode());
					
			//DUPLICATE ELEMETNS ARE IGNORED
			countrySet.add("india");
			countrySet.add("London");
			countrySet.add(strIndia);
			countrySet.add(str2);
			
			//SIZE AND EMPTY
			System.out.println("Size of the Set :: "+countrySet.size());
			System.out.println("Isempty :: "+countrySet.isEmpty());
			
			
			System.out.println( countrySet );
			
			
		}

	}

