package corejava;
import java.util.*;

class Addition
{
	public int a;
	public int b;
	Addition()
	{
		a=0;
		b=0;
		System.out.println("Constructor !!");
	}
	Addition(int x,int y)
	{
		a=x;
		b=y;
	}
	public int add()
	{
		return a+b;
	}
	
}

public class simple {
	public static void main(String args[])
	{
		Scanner sobj=new Scanner(System.in);
		Addition aobj=new Addition(10,5);
		int ret=aobj.add();
		System.out.println("Addition : "+ret);
		System.out.println("Enter numbers");
		int a=sobj.nextInt();
		int b=sobj.nextInt();
		Addition aobj1=new Addition(a,b);
		int iret1=aobj1.add();
		System.out.println("Addition is: "+iret1);
		
		
		
	}
}
