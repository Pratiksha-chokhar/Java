package com.dac.myThread;

public class Test {
	public static void main(String[] args)
	{
	Test t=new Test();
	Test t1=new Test(t);
	}
	
		public Test()
		{
			
		}
		public Test(Test ref)
		{
			this(ref,"AAA");
		}
		public Test(Test ref,String str)
		{
			ref.Test(str);
			System.out.println("BBB");
		}
		public void Test(String str)
		{
			System.out.println(str);
		}
		
	}