package corejava;
import java.lang.*;
import java.util.*;


public class CircularLinkedList {

	public static void main(String[] args) {
		Scanner sobj=new Scanner(System.in);
		SinglyCL mycl=new SinglyCL();
		int iChoice=1;
		int ncnt=0;
		while(iChoice!=0)
		{
			System.out.println("Enter your choice");
			System.out.println("1: For Insert First");
			System.out.println("2: For Delete First");
			System.out.println("3: For Insert Last");
			System.out.println("4: For Delete Last");
			System.out.println("5: For Insert At Position");
			System.out.println("6: For Delete At Position");
			System.out.println("7: For Display");
			System.out.println("8: For Count");
			iChoice=sobj.nextInt();
			switch(iChoice)
			{
			case 1:
				System.out.println("Enter data you want to insert");
				int data=sobj.nextInt();
				mycl.InsertFirst(data);
				mycl.DisplayNode();
			break;
			
			case 2:
				node tmp=null;
				tmp=mycl.DeleteFirst();
				mycl.DisplayNode();
			break;	
				
			case 3:
				System.out.println("Enter data you want to insert");
				int data1=sobj.nextInt();
				mycl.InsertLast(data1);
				mycl.DisplayNode();
			break;	
			
			case 4:
				node tmp1=null;
				tmp1=mycl.DeleteLast();
				mycl.DisplayNode();
			break;
			
			case 5:
				System.out.println("Enter data you want to insert");
				int data2=sobj.nextInt();
				System.out.println("Enter position you want to insert at");
				int pos=sobj.nextInt();
				mycl.InsertAtPos(data2,pos);
				mycl.DisplayNode();
			break;
			
			case 6:
				System.out.println("Enter position you want to Delete node at");
				int pos1=sobj.nextInt();
				node temp=null;
				temp=mycl.DeleteAtPos(pos1);
				mycl.DisplayNode();
			break;	
				
				
				
			case 7:
				mycl.DisplayNode();
			break;
			
			case 8:
				
				ncnt=mycl.Sizeof();
				System.out.println("Number of nodes in linked list is: "+ncnt);
			break;	
				
			
			case 0:
				System.out.println("Thanks for using my Application!!!");
			break;
			
			default:
				System.out.println("Enter proper Choice!!!");
			break;	
			}
			
			
		}
		
		

	}

}
