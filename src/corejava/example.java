package corejava;
import java.lang.*;
import java.util.*;

class A
{
	 void fun()
	{
		System.out.println("Class A fun()");
	}
}
class B extends A
{
	void fun()
	{
		System.out.println("Class B fun()");
	}
}
/*class C extends A
{
	void fun()
	{
		System.out.println("Class C fun()");
	}
}
*/

public class example {
	public static void main(String args[])
	{
	A obj=new B();
		obj.fun();
	System.out.println("Hello Java");
	}

}
