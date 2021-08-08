package corejava;
import java.lang.*;
import java.util.*;

class student
{
	public int roll;
	public String name;
	public int marks;
	
	public student(int no,String str,int num)
	{
		this.roll=no;
		this.name=str;
		this.marks=num;
	}
	//for displaying the records
	public void display()
	{
		System.out.println("Roll No: "+this.roll+" | "+" Name: "+this.name+" | "+" Marks: "+this.marks);
	}
}

public class CollectionLL {
	public static void main(String args[])
	{
		LinkedList <student> li=new LinkedList<student>();
		li.add(new student(11,"Payal",85));
		li.add(new student(12,"Pratik",90));
		li.add(new student(13,"Ram",80));
		li.add(new student(14,"Sonal",75));
		
		System.out.println("Linked List: "+li);
		System.out.println("Size of Linked list: "+li.size());
		
		student ref=null;
		Iterator iobj=li.iterator();
		System.out.println("Containts of Linked list are: ");
		while(iobj.hasNext())
		{
			ref=(student)iobj.next();
			ref.display();
		}
		li.clear();
		
	}


}
