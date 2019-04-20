package com.dac.collections;


	import java.util.Iterator;
	import java.util.TreeSet;

	public class TreeSetDemo {
		public static void main(String[] args) {
		TreeSetDemo.strTreeSet();

			TreeSetDemo.Student1TreeSet();
			
			System.out.println("End");
		}

		public static void strTreeSet() {
			TreeSet<String> osSet = new TreeSet<>();
			osSet.add("Windows");
			osSet.add("Linxu");
			osSet.add("MacOs");
			Iterator<String> iterator = osSet.iterator();
			while (iterator.hasNext()) {
				String value = iterator.next();
				System.out.println("Country Name :: " + value);
			}
		}
		
		public  static void Student1TreeSet(){
			
			//DESCENDING ORDER
			Student1Comparator comparator = new Student1Comparator();
		TreeSet<Student1> set = new TreeSet<>(comparator);
			
			//ASCENDING ORDER
			TreeSet<Student1> set1 = new TreeSet<>();
			
			
			Student1 s1 = new Student1();
			s1.setName("Atul");
			s1.setId(101);
			s1.setMark(99);
			
			Student1 s2 = new Student1(102, "Amit",95);
			Student1 s3 = new Student1(103,"Maturi",100);
			
			set1.add(s1);
			set1.add(s2);
			set1.add(s3);
			
			Iterator<Student1> iterator = set1.iterator();
			while ( iterator.hasNext() ){
				Student1 s = iterator.next();
				System.out.println(s.toString());
			}
		}
	}


