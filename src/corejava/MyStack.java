package corejava;
import java.lang.*;
import java.util.*;

public class MyStack {

	public static void main(String[] args) {
		Stack <Integer> sobj=new Stack<Integer>();
		sobj.push(11);
		sobj.push(12);
		sobj.push(13);
		sobj.push(14);
		sobj.push(15);
		System.out.println("Elements of stack: "+sobj);
		System.out.println("Size of Stack is: "+sobj.size());
		int i=sobj.pop();
		System.out.println("Popped element of stack is: "+i);
		System.out.println("Elements of stack: "+sobj);
		System.out.println("Top Element of stack: "+sobj.peek());
		
		System.out.println("Output by iterator");
		
		Iterator itr=sobj.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		if(sobj.empty())
		{
			System.out.println("Stack is empty");
		}
		else
		{
			System.out.println("stack is not empty");
		}
		
   
	}

}
