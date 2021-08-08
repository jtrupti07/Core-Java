package corejava;
import java.lang.*;
import java.util.*;

class Base
{
	Base()
	{
		System.out.println("Base class Constructor");
	}
	public void fun()
	{
		System.out.println("Base fun()");
	}
	public int Add(int x,int y)
	{
		return x+y;
	}
	
}

class Derived extends Base
{
	Derived()
	{
		System.out.println("Derived class constructor");
	}
	
	public void gun()
	{
		System.out.println("Derived gun()");
	}
	public int Sub(int a,int b)
	{
		return a-b;
	}
}

class Mult extends Derived
{
	Mult()
	{
		System.out.println("Mult class Constructor");
	}
	
	public int Mul(int p,int q)
	{
		return p*q;
	}
}

public class Inheritance {
	public static void main(String args[])
	{
		Base bobj=new Base();
		bobj.fun();
		int ret1=bobj.Add(20,30);
		System.out.println("Addition is:"+ret1);
		//int ret4=bobj.Sub(40,20);  undefined by base class
		Derived obj=new Derived();
		//Derived dobj=new Base(); downcasting
		obj.fun();
		obj.gun();
		int ret2=obj.Add(20,20);
		System.out.println("Addition is:"+ret2);
		int ret3=obj.Sub(60,30);
		System.out.println("Substraction is:"+ret3);
		
		Mult mobj=new Mult();
		int ret5=mobj.Mul(5,2);
		System.out.println("Multiplication is:"+ret5);
		
		int ret6=mobj.Sub(40,20);
		System.out.println("Substraction is:"+ret6);
		
		int ret7=mobj.Add(10,20);
		System.out.println("Addition is:"+ret7);
		
		
		
		
		
		
	}

}
