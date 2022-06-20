package oops;

import java.util.List;
/**
 Rules:
  1. When we have two overloaded version of same method, JVM will always call most specific method.
  2. Compilation error 
  
  links : https://java2blog.com/method-overloading-and-overriding-interview-questions-in-java/
  
 **/


public class OverLoadingExample {

	public static void main(String[] args) {
		scenario1(null);
		scenario2(null);
	}
	
	static void scenario1(Object obj) {System.out.println("Object");}
	static void scenario1(String obj) {System.out.println("String");}
	
	static void scenario2(String obj) {System.out.println("String");}
	static void scenario2(Integer obj) {System.out.println("Integer");}

}
