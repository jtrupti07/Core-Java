package corejava;
import java.lang.*;
import java.util.*;


public class MyHashTable {

	public static void main(String[] args) {
		Hashtable <Integer,String> ht=new Hashtable<Integer,String>();
		ht.put(1,"Amit");
		ht.put(2,"Ram");
		ht.put(3,"Tushar");
		ht.put(4,"Aniket");
		System.out.println("Elements of HashTable is: "+ht);
		
	    System.out.println(ht.getOrDefault(3,"Not Found"));//if else statement as argument
	    System.out.println(ht.getOrDefault(5,"Not Found"));
		if(ht.containsKey(2))
		{
		    String str=ht.get(2);
		    System.out.println("Data : "+str);
		}
		ht.remove(1);
		System.out.println("Updated Hash table is: "+ht);
		
		Integer i=null;
		
		Set<Integer> keys=ht.keySet();//fetch keys from HashTable
		
		Iterator itr=keys.iterator();
		
		while(itr.hasNext())
		{
			i=(Integer)itr.next();
			System.out.println("Key "+i+" Data "+ht.get(i));
		}
		
		
		
		
		

	}

}
