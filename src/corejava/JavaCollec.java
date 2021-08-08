package corejava;
import java.lang.*;
import java.util.*;

public class JavaCollec {
	public static void main(String args[])
	{
		Vector <String> vobj1=new Vector<String>();//vector of capacity 10
		Vector <String> vobj2=new Vector<String>(20);//vector of capacity 20
		Vector <String> vobj3=new Vector<String>(20,10);//vector of capacity 20 within the 10 iterations.
		
		vobj3.add("ABC");
		vobj3.add("PQR");
		vobj3.add("XYZ");
		
		System.out.println("Elements are: "+vobj3);
		
		System.out.println("By using loop");
		
		for(int i=0;i<vobj3.size();i++)
		{
			System.out.println(vobj3.get(i));
		}
		
		System.out.println("By using Iterator");
		Iterator itr=vobj3.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		System.out.println("Size of vob1: "+vobj1.size());
		System.out.println("Size of vobj2: "+vobj2.size());
		System.out.println("Size of vobj3: "+vobj3.size());
		System.out.println("Capacity of vobj1: "+vobj1.capacity());
		System.out.println("Capacity of vobj2: "+vobj2.capacity());
		System.out.println("Capacity of vobj3: "+vobj3.capacity());
		
		
	}

}
