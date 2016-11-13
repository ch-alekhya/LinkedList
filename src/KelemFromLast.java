import java.util.*;
public class KelemFromLast {
	
	public int kelementLast(int value,Linkedlist obj)
	{
		Node ptr1=obj.start;
		Node ptr2=obj.start;
		int i=0;
		while(i <value)
		{
			ptr2=ptr2.link;
			i++;
		}
		
		while (ptr2!=null)
		{
			ptr2=ptr2.link;
			ptr1=ptr1.link;
		}
		
		return ptr1.data;
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
			obj.insertAtEnd(value);
			System.out.println("Do you want to continue");
			ch=scan.next().charAt(0);
			
		}while(ch=='y' || ch=='Y');
		
		System.out.println("Enter the kth element from end");
		int k=scan.nextInt();
		
		System.out.println("Printing initial contents of list");
		obj.display();
		KelemFromLast obj2=new KelemFromLast();
		int ans=obj2.kelementLast(k, obj);
		System.out.println(ans);
	}

}
