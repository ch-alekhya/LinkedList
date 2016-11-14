import java.util.*;
public class SumLists {
	
	public Linkedlist add(Linkedlist obj1, Linkedlist obj2)
	{
		Linkedlist sum=new Linkedlist();
		Node ptr1=obj1.start;
		Node ptr2=obj2.start;
		int carry=0;
		while(ptr1!=null && ptr2!=null)
		{
			int value=ptr1.data+ptr2.data;
			value=value+carry;
			if (value>9)
			{
				carry=value/10;
				value=value%10;
				
			}
			else
			{
				carry=0;
			}
			sum.insertAtEnd(value);
			ptr1=ptr1.link;
			ptr2=ptr2.link;
	
		}
		while(ptr1!=null)
		{
			int value=ptr1.data+carry;
			if (value>9)
			{
				carry=value/10;
				value=value%10;
				
			}
			else
			{
				carry=0;
			}
			sum.insertAtEnd(value);
			ptr1=ptr1.link;
			
		}
		while(ptr2!=null)
		{
			int value=ptr2.data+carry;
			if (value>9)
			{
				carry=value/10;
				value=value%10;
				
			}
			else
			{
				carry=0;
			}
			sum.insertAtEnd(value);
			ptr2=ptr2.link;
			
		}
		if (carry >0)
		{
			sum.insertAtEnd(carry);
		}
		return sum;
		
	}
	public static void main(String[] args)
	{
		Linkedlist obj1=new Linkedlist();
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter 1st linkedlist objects");
		char ch;
		do
		{
			System.out.println("Enter the value to be stored in list");
			int value=scan.nextInt();
			obj1.insertAtEnd(value);
			System.out.println("Do you want to continue");
			ch=scan.next().charAt(0);
			
		}while(ch=='y' || ch=='Y');
		System.out.println("Enter 2nd Linkedlist contenst");
		Linkedlist obj2=new Linkedlist();
		do
		{
			System.out.println("Enter the value to be stored in list");
			int value=scan.nextInt();
			obj2.insertAtEnd(value);
			System.out.println("Do you want to continue");
			ch=scan.next().charAt(0);
			
		}while(ch=='y' || ch=='Y');
		
		SumLists obj3=new SumLists();
		Linkedlist obj4=obj3.add(obj1, obj2);
		System.out.println("Printing the sum");
		obj4.display();
	}

}
