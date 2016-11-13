import java.util.*;
public class RemoveDuplicates {
	
	public Linkedlist removeDup(Linkedlist obj)
	{
		Set<Integer> map=new HashSet<Integer>();
		Node temp=obj.start;
		while(temp!=null)
		{
			map.add(temp.data);
			temp=temp.link;
			
		}
		Iterator iter=map.iterator();
		
		Linkedlist newObj=new Linkedlist();
		
		while(iter.hasNext())
		{
			newObj.insertAtStart((int) iter.next());
			
		}
		
		
		return newObj;	
	}
	
	public Linkedlist iterateRemove(Linkedlist obj)
	{
		Node ptr1=obj.start;
		Node ptr2=null;
		
		while(ptr1!=null)
		{
			ptr2=ptr1;
			while(ptr2.link!=null)
			{
				if(ptr1.data==ptr2.link.data)
				{
					ptr2.link=ptr2.link.link;
				}
				else
				{
					ptr2=ptr2.link;
				}
			}
			ptr1=ptr1.link;
		}
		return obj;
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
		RemoveDuplicates obj1=new RemoveDuplicates();
		Linkedlist obj3=obj1.removeDup(obj);
		System.out.println("Printing after removing duplicants");
		obj3.display();
		
		obj3=obj1.iterateRemove(obj);
		System.out.println("Printing after removing duplicants using iterative method");
		obj3.display();
		
	}

}
