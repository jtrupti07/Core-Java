package corejava;
import java.util.*;

public class basic {
	public static void main(String args[])
	{
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter Number 1");
	    int a=sobj.nextInt();
	    System.out.println("Entered Number is: "+a);
	    System.out.println("Enter Number 2");
	    int b=sobj.nextInt();
	    System.out.println("Entered Number is: "+b);
	    int c=a+b;
	    System.out.println("Addition of "+a +" and "+ b +" is :"+c);
	    //int i=10;
	    float f=10.44f;
	   // i=f;//cannot convert from float to int
	    int i=(int)f;
	    System.out.println("i= "+ i+" f "+f);
	    
		 
	}

}
