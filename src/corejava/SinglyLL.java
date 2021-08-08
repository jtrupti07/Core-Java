/*
 * Author name: Trupti Vilas Jadhav.
 * 
 * INFO ABOUT THE CODE:-
 * 
 * It's a singly linked list code which contsins
 * Following functions:-
 * Insert first in the linked list
 * Insert last in the linked list
 * Insert at position in linked list
 * Delete Fisrt from linked list
 * Delete last from linked list
 * Delete at position from Linked list
 * Display nodes from Linked list
 * Count the number of nodes in linked list
 */




package corejava;
import java.lang.*;
import java.util.*;

class node
{
	public int data;
	public node next;
	
	public void DisplayData()
	{
		System.out.println("{ "+data+" }");
	}
}


 public class SinglyLL
{
	private node head;
	private int count=0;
	

	public void InsertFirst(int data)
	{
		node newn=new node();
		newn.data=data;
		newn.next=null;
		if(head==null)
		{
			head=newn;
		}
		else
		{
		newn.next=head;
		head=newn;
		}
		count++;
		
	}
	
	public node DeleteFirst()
	{
		node temp=head;
		if(count==0)
		{
			System.out.println("Linked list is Emplty!!!");
		}
		else if(count==1)
		{
			head=null;
			count--;
		}
		else
		{		
		head=head.next;	
		count--;
		}
		return temp;	
		
	}
	
	public void InsertLast(int data)
	{
		node newn=new node();
		newn.data=data;
		newn.next=null;
		if(head==null)
		{
			head=newn;
			count++;
		}
		else
		{
		node temp=head;
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		temp.next=newn;
		count++;
		}
		
	}
	
	public node DeleteLast()
	{
		node temp=head;
		node dtemp=null;
		if(count==0)
		{
			System.out.println("Linked list is empty!!!");
		}
		else if(count==1)
		{
			head=null;
			count--;
			return temp;
		}
		else
		{
		while(temp.next.next!=null)
		{
			temp=temp.next;
		}
		dtemp=temp.next;
		temp.next=null;
		count--;
		}
		return dtemp;
	}
	
	public void InsertAtPos(int data,int pos)
	{
		node newn=new node();
		newn.data=data;
		newn.next=null;
		if(pos==1)
		{
			InsertFirst(data);
		}
		else if(pos==count+1)
		{
			InsertLast(data);
		}
		else
		{
		node temp=head;
		for(int i=1;i<pos-1;i++)
		{
			temp=temp.next;
		}
		newn.next=temp.next;
		temp.next=newn;
		count++;
		}
	}
	
	public node DeleteAtPos(int pos)
	{
		node temp=head;
		node tmp=null;
		if(count==0)
		{
		  System.out.println("Linked list is Emplty!!!");
		}
	    if(pos==1)
		{
			DeleteFirst();
		}
		else if(pos==count)
		{
			DeleteLast();
		}
		else
		{
			for(int i=1;i<pos-1;i++)
			{
				temp=temp.next;
			}
		    tmp=temp.next;
			temp.next=temp.next.next;
			count--;
	    }
		return tmp;
			
	}
	
	public void DisplayLL()
	{
		System.out.println("Printing linked list Head to last");
		node temp=head;
		while(temp!=null)
		{
			temp.DisplayData();
			temp=temp.next;
		}
		System.out.println();
	}
	
	public int SizeOf()
	{
		return count;
	}
	
	
	
}
