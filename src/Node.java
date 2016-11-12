import java.util.*;
public class Node {
	
	protected int data;
	protected Node link;
	
	Node()
	{
		data=0;
		link=null;
	}
	Node(int d,Node n)
	{
		data=d;
		link=n;
	}
	Node (int d)
	{
		data=d;
		link=null;
	}
	
	public void setLink(Node n)
	{
		link=n;
	}
	public void setData(int d)
	{
		data=d;
	}
	public Node getLink()
	{
		return link;
	}
	public int getData()
	{
		return data;
	}
	
	

}
