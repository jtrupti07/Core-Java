package corejava;
import java.lang.*;

class Demo
{
	public int Add(int x,int y)
	{
		return x+y;
	}
	
	public double Add(double a,double b)
	{
		return a+b;
	}
	
	public float Add(float p,float q)
	{
		return p+q;
	}
	public void fun(Double d,int i)
	{
		System.out.println("Inside Fun");
	}
	public void fun(int i,double d)
	{
		System.out.println("Inside Fun1");
	}
}

public class Overloading {
	public static void main(String args[])
	{
	Demo obj=new Demo();
	int ret1=obj.Add(10,20);
	double ret2=obj.Add(25.5,32.6);
	float ret3=obj.Add(5.2f,6.8f);
	obj.fun(20.5,12);
	obj.fun(15,25.63);
	System.out.println("Addition for int:"+ret1);
	System.out.println("Addition for double:"+ret2);
	System.out.println("Addition for float:"+ret3);
	}
	
	
	

}
