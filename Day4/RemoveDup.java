import java.util.Scanner;
class Node
{
	int data;
	Node next;
}
public class RemoveDup
{

	Node head;
	public void create(int n)
	{
		Scanner s = new Scanner(System.in);
		Node temp = null;
		System.out.println("Enter the data to insert");
		while(n > 0)
		{
			n--;
			int d = s.nextInt();
			Node newnode = new Node();
			newnode.data = d;
			if(head == null)
			{
				head = newnode;
				temp = newnode;
			}
			else
			{
				temp.next = newnode;
				temp = temp.next;
			}
		}
	}
	public void display()
	{
		Node temp = head;
		while(temp != null)
		{
			System.out.println(temp.data + " ");
			temp = temp.next;
		}
	}
	public void  removeDupli()
	{
		Node temp = head;
		while(temp.next != null)
		{
			if(temp.data == temp.next.data)
			{
				temp.next = temp.next.next;
			}
			else
				temp = temp.next;
		}

	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of linklist");
		int n = sc.nextInt();
		RemoveDup obj = new RemoveDup();
		obj.create(n);
		System.out.println("original linklist is");
		obj.display();
		obj.removeDupli();
		System.out.println("After removing duplicates linklist is");
		obj.display();
	}
}