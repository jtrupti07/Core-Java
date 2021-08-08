/*
 * Author name: Trupti Vilas Jadhav.
 * 
 * INFO ABOUT THE CODE:-
 * 
 * It's a singly circular linked list code which contains
 * Following functions:-
 * Insert firt in the linked list
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

/*class node
{
	public int data;
	public node next;
	
	public void DisplayData()
	{
		
		System.out.println("{ "+data+" }");
	}
}
*/

public class SinglyCL {
	
	private node head;
	private node tail;
	private int count;
	
	public void InsertFirst(int data)
	{
		node newn=new node();
		newn.data=data;
		newn.next=newn;
		if(head==null || tail==null)
		{
			head=newn;
			tail=newn;
			count++;
			tail.next=head;
		}
		else
		{
			newn.next=head;
			head=newn;
			count++;
			tail.next=head;
		}
	}
	
	public node DeleteFirst()
	{
		node temp=head;
		if(head==null || tail==null)
		{
			System.out.println("List is Emplty!!!");
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
		newn.next=newn;
		
		if(head==null || tail==null)
		{
			head=newn;
			tail=newn;
			count++;
			tail.next=head;
		}
		else
		{
			tail.next=newn;
			tail=tail.next;   //or also we can write tail=newn
			count++;
			tail.next=head;
		}
	}
	
	public node DeleteLast()
	{
		node tmp=null;
		node temp=head;
		if(count==1)
		{
			head=null;
			tail=null;
			count--;			
		}
		else
		{
			while(temp.next.next!=head)
			{
				temp=temp.next;
			}
			tmp=temp.next;
			temp.next=null;
			tail=temp;
			count--;		
			
		}
		return tmp;
	}
	
	
	public void InsertAtPos(int data,int pos)
	{
		node newn=new node();
		newn.data=data;
		newn.next=newn;
		if(pos==1)
		{
			InsertFirst(data);
		}
		else if(pos==count)
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
	
	public int Sizeof()
	{
		return count;
	}
	
	public void DisplayNode()
	{
		System.out.println("Displaying Linked List: ");
		node temp=head;
		for(int i=1;i<=count;i++)
		{
			temp.DisplayData();
			temp=temp.next;
		}
		System.out.println();
	}

}
