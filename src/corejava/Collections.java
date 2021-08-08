package corejava;
import java.lang.*;
import java.util.*;

public class Collections {

	public static void main(String[] args) {
		ArrayList <Integer> iobj=new ArrayList<Integer>();
		iobj.add(10);
		iobj.add(20);
		iobj.add(30);
		System.out.println("Elements are : "+iobj);
		System.out.println("Size of arraylist is : "+iobj.size());
		System.out.println("Element at 0th position: "+iobj.get(0));
		
		iobj.set(0,15); //updating values at perticuler position
		System.out.println("Elements are : "+iobj);
		iobj.add(1,40);  //add value at perticuler position
		System.out.println("Elements are : "+iobj);
		
		ArrayList <Float> fobj=new ArrayList<Float>();
		//fobj.add(5.2); while declaring it we have to add f after the number otherwise it will generate error
		fobj.add(5.2f);
		fobj.add(45.2f);
		fobj.add(3.5f);
		System.out.println("Elements are : "+fobj);
		System.out.println("Size of arraylist is : "+fobj.size());
		System.out.println("Element at 1st position: "+fobj.get(1));
		
		System.out.println("Output by loop");
		for(Integer i : iobj)
		{
			
			System.out.println(i);
		}
		System.out.println("Output by Iterator");
		
		Iterator itr=iobj.iterator(); //Iterator to iterate the loop
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		iobj.clear();
		fobj.clear();
		
		

	}

}
