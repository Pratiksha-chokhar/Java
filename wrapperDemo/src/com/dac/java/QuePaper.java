package com.dac.java;
import java.lang.Exception;

public class QuePaper  {
	
	public static void main(String[] args)throws Exception
	{
	/*{
		try{
    QuePaper q =new QuePaper();
    q.method();
    System.out.println("print");
		}catch(Exception n)
    {
    	System.out.println("catch is there");
    }
}
	public void method()throws Exception
	{
		throw new Exception();
	}
	*/
		
		String s1=new String ("Test");
		String s2=new String ("Test");
		if(s1==s2)
			System.out.println("same");
		if(s1.equals(s2))
			System.out.println("Equals");
}
}