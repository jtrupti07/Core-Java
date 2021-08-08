
/*
 * MAin class for Singly linked list code (SinglyLL.java) 
 * 
 */


package corejava;
import java.lang.*;
import java.util.*;

public class LinkedList {

	public static void main(String[] args) {
		SinglyLL myll=new SinglyLL();
		myll.InsertFirst(11);
		myll.InsertFirst(10);
		myll.InsertFirst(9);
		myll.InsertFirst(8);
		myll.InsertLast(12);
		myll.DisplayLL();
		int i=myll.SizeOf();
		System.out.println("Size of Linked list is: "+i);
		
		node temp=null;
		temp=myll.DeleteFirst();
		System.out.println("Deleted node is:"+temp.data);
		myll.DisplayLL();
		int j=myll.SizeOf();
		System.out.println("Size of Linked list is: "+j);
		
		node ret=null;
		ret=myll.DeleteLast();
		System.out.println("Deleted node is:"+ret.data);
		myll.DisplayLL();
		int k=myll.SizeOf();
		System.out.println("Size of Linked list is: "+k);
		
		myll.InsertAtPos(8,1);
		myll.DisplayLL();
		myll.InsertAtPos(12,3);
		myll.DisplayLL();
		myll.InsertAtPos(100,2);
		myll.DisplayLL();
	System.out.println("*******************");	
		node ret1=null;
		ret1=myll.DeleteAtPos(1);
		myll.DisplayLL();
		
		node ret2=null;
		ret2=myll.DeleteAtPos(3);
		myll.DisplayLL();
		
		node ret3=null;
		ret3=myll.DeleteAtPos(4);
		myll.DisplayLL();
		int l=myll.SizeOf();
		System.out.println("Size of Linked list is: "+l);
		
		
		
		
		
	

	}

}
