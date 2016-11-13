import java.util.*;

public class RemoveMiddleNode {
	

	public Linkedlist removeNode(int value, Linkedlist obj)
	{
		Node ptr1=obj.start;
		Node ptr2;
		boolean status=false;
		while(ptr1.link!=null)
		{
			if(ptr1.link.data==value)
			{
				ptr2=ptr1.link;
				ptr1.link=ptr2.link;
				status=true;
				break;
			}
			ptr1=ptr1.link;
		}
		if (status)
			return obj;
			else
				return null;
	}
	
	public static void main(String[] args)
	{
		Linkedlist obj=new Linkedlist();
		Scanner scan=new Scanner(System.in);
		char ch;
		do
		{
			System.out.println("Enter the value to be stored in list");
			int value=scan.nextInt();
			obj.insertAtStart(value);
			System.out.println("Do you want to continue");
			ch=scan.next().charAt(0);
			
		}while(ch=='y' || ch=='Y');
		
		System.out.println("Printing initial contents of list");
		obj.display();
		RemoveMiddleNode obj2=new RemoveMiddleNode();
		System.out.println("Enter the value of the node to be deleated");
		int value=scan.nextInt();
		obj=obj2.removeNode(value, obj);
		System.out.println("Printing the removed contents");
		if (obj==null)
		{
			System.out.println("No element is found");
		}
		else
		{
			obj.display();
		}
	}

}