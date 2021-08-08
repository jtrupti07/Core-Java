import java.util.*;
import java.lang.*;

class Hi extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Hi");
			try{Thread.sleep(1000);} catch(Exception obj) {}
		}
	}
	
}

class Hello extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Hello");
			try{Thread.sleep(1000);} catch(Exception obj) {}
		}
	}
}



public class Demo {

	public static void main(String[] args) {
		Hi obj1=new Hi();
		Hello obj2=new Hello();
		
		obj1.start();
		try{Thread.sleep(10);} catch(Exception obj) {}
		obj2.start();
		
		


	}

}
