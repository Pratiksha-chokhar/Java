package com.dac.collections;

import java.util.Comparator;

	public class Student1Comparator implements Comparator<Student1>{
		@Override
		public int compare(Student1 o1, Student1 o2) {
			
			if(o1.getMark() == o2.getMark())
				return 0;
			else if(o1.getMark() > o2.getMark())
				return -1;
			else if( o1.getMark() < o2.getMark())
				return 1;
			return 0;
		}
	}


