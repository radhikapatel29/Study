package oops;
import java.io.IOException;
import java.util.List;

/**

  Rules :
  1. Can't make access modifier more restrictive (eg public to private) :: As per oops child class has all functionality of parent, with restrictive modifier this will break
  2. Covariant return type : Should have same or child class as return type
  3. If super class does not throw checked Exception , subclass cannot throw checked exception but can have unchecked
  4. If super throw checked exception, subclass can throw same or subtype of that exception or runtimeexception
  5. final , private and static methods cannot be overriden. 
  6. final method can be inherited
  
**/


public class OverridingExample {
	public static void main(String[] args) {
		OverridingSuper obj = new OverridingSub();
	}
}

class OverridingSuper {
	public void scenario1() {}
	public OverridingSuper scenario2() {return null;}
	public void scenario3() {}
	public void scenario4() throws IOException {throw new IOException();}
	public static void scenario5_1() {System.out.print("super 5.1");}
	public final void scenario5_2() {System.out.print("super 5.2");}
	public void scenario5_3() {System.out.print("super 5.3");}
	public final void scenario6() {System.out.print("super 6");}
}

class OverridingSub extends OverridingSuper{
	protected void scenario1() {}
	public Object scenario2() {return null;}
	public void scenario3() throws ArrayIndexOutOfBoundsException {throw new ArrayIndexOutOfBoundsException();}
	public void scenario4() throws Exception {throw new Exception();}
	public static void scenario5_1() {System.out.print("sub 5.1");}
	public final void scenario5_2() {System.out.print("sub 5.2");}
	public void scenario5_3() {System.out.print("sub 5.3");}
	public void scenario5_4() {System.out.print("sub 5.4");}
}