package corejava;
import java.lang.*;
import java.util.*;

class CircleArea
{
	public int r;
	public CircleArea(int x)
	{
		r=x;
	}
	
	public double CalcArea()
	{
		return 3.14*r*r;;
	}
}

class TriangleArea 
{
	 public double b,h;
	
	
	public TriangleArea(double x,double y)
	{
		b=x;
		h=y;
	}
	
	public double CalcArea()
	{
		return (b*h)/2;
	}
}

public class Area {
	public static void main(String args[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter Radious");
		int r=sobj.nextInt();
		
		System.out.println("Enter base and height");
		double b=sobj.nextInt();
		double h=sobj.nextInt();
		
		CircleArea obj=new CircleArea(r);
		double ret=obj.CalcArea();
		System.out.println("Area of Circle is: "+ret);
		TriangleArea tobj=new TriangleArea(b,h);
		double ret1=tobj.CalcArea();
		System.out.println("Area of Triangle is: "+ret1);
		
		
		
	}

}
