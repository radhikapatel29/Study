package oops;

/** 
 
 Rules:
 	1. final variable should either be initialize inline or in constructor or initialization block 
 	2. If the final variable is a reference then it cannot be assign/re-bound to another object but internal state of the object can be changed
 	3. final class cannot be inherited
 	4. final method cannot be overloaded
 	
 https://www.geeksforgeeks.org/final-keyword-in-java/
 
 **/
public class FinalKeyword 
{
	final int i ;
	final int[] list;
	final int j=10;										//scenario1
	final int k;
	
	{
		k=20;											//scenario1
	}
	
	public FinalKeyword() {								//scenario1
		i=10;
		list = new int[5];
	}
	
	public static void main(String[] args) {
		FinalKeyword f = new FinalKeyword();
		System.out.println(f.list[4]);
		f.list[4]=100;									//scenario2
		System.out.println(f.list[4]);
		f.list=new int[10];								//scenario2
	}

}
