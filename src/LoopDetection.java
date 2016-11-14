import java.util.*;

public class LoopDetection {

	
	public boolean loopDetection(Linkedlist obj)
	{
		boolean status=true;
		
		
		Node ptr1=obj.start;
		Node ptr2=obj.start;
		
		while(true)
		{
			ptr1=ptr1.link.link;
			ptr2=ptr2.link;
			if (ptr1==ptr2)
			{
				status=false;
				break;
			}
			else if (ptr1==null)
			{
				break;
			}
		}
		return status;
	}
	
	
	public static void main(String[] main)
	{
		Scanner scan =new Scanner(System.in);
		Linkedlist obj=new Linkedlist();
		char ch;
		do
		{
			System.out.println("Enter the value to be stored in list");
			int value=scan.nextInt();
			obj.insertAtEnd(value);
			System.out.println("Do you want to continue");
			ch=scan.next().charAt(0);
			
		}while(ch=='y' || ch=='Y');
		
		
		
		
	}
}
