import java.util.*;
public class Linkedlist {
	
	protected Node start;
	protected Node end;
	int size;
	
	Linkedlist()
	{
		size=0;
		start=null;
		end=null;
	}
	
	public boolean isEmpty()
	{
		return start==null;
	}
	public int returnSize()
	{
		return size;
	}
	
	public void insertAtStart(int value)
	{
		Node n=new Node(value);
		if (start==null)
		{
			start=n;
			end=n;
		}
		else
		{
			n.setLink(start);
			start=n;
		}
		
		
	}
	
	public void insertAtEnd(int value)
	{
		Node n=new Node(value);
		if (start==null)
		{
			start=n;
			end=n;
		}
		else
		{
			end.setLink(n);
			end=n;
			
		}
	}
	
	public void insertAtMiddle(int value, int pos)
	{
		Linkedlist obj=new Linkedlist();
		Node n=new Node(value);
		if (pos ==1)
		{
			
			obj.insertAtStart(value);
		}
		else if (pos==size)
		{
			obj.insertAtEnd(value);
		}
		else
		{
			if (start!=null && end!=null)
			{
			Node temp=start;
			int count=1;
			while(count <pos)
			{
				System.out.println("hi");
				count++;
				if (count==pos)
					break;
				if (temp.getLink()!=null)
				{
					temp=temp.getLink();
					System.out.println(temp.getData());
				}
				
			}
			
			Node temp1=temp.getLink();
			temp.setLink(n);
			n.setLink(temp1);
			
			}	
			
		}
	}
	
	public void display()
	{
		System.out.println("Printing the LinkedList values");
		Node n=start;
		if (n==null)
		{
			System.out.println("There is no contents in the list");
		}
		while(n!=null)
		{
			System.out.print(n.data+"->");
			n=n.getLink();
		}
		System.out.println("\n");
	}
	
	
	public static void  main(String[] main)
	{
		Scanner scan= new Scanner(System.in);
		Linkedlist nn=new Linkedlist();
		char ch;
		
		do
		{
			System.out.println("Enetr any of the follwing operatins");
			System.out.println("1. insert at beginning");
			System.out.println("2.Insert at the end");
			System.out.println("3.insert at particular position");
			
			int choice=scan.nextInt();
			
			switch(choice)
			{
			case 1:
			{
				System.out.println("Enter the value to be inserted in the list");
				int value=scan.nextInt();
				nn.insertAtStart(value);
				break;
			}
			case 2:
			{
				System.out.println("Enter the value at the end of the list");
				int value=scan.nextInt();
				nn.insertAtEnd(value);
				break;
			}
			case 3:
			{
				System.out.println("Enter the value to be inserted in the list");
				int value=scan.nextInt();
				System.out.println("Enter the position to be inserted");
				int pos=scan.nextInt();
				nn.insertAtMiddle(value, pos);
				break;
				
			}
			}
			
		nn.display();
		System.out.println("Enter y or Y to continue");
		ch=scan.next().charAt(0);
		
		} while(ch=='y' || ch=='Y');
			
	}
	
	
	

}
