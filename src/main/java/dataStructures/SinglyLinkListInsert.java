package dataStructures;
public class SinglyLinkListInsert {
	Node head;
	class Node{ //Node head, next, last, new_node, currNode
		int data;
		Node next;
		public Node(int d){//Node head, next			
			data=d;
			next = null;
		}
	}
	public SinglyLinkListInsert insert(SinglyLinkListInsert list, int data){
		Node new_node = new Node(data);
		new_node.next=null; //means node's next is null and tht node contain data and next value.	
		if( list.head==null){//while adding first node
			list.head = new_node;				
		}
		else {
			Node last = list.head;
			while(last.next!=null){
			last = last.next;
			}
			last.next = new_node;		
		}		
		return list;
	}
	public static void printList(SinglyLinkListInsert list){
		Node currNode = list.head;
		System.out.println("Single Link List!");
		while(currNode!=null){
			System.out.print(currNode.data + " ");
			currNode = currNode.next;
		}		
	}	
	public static void main(String args[]){
		SinglyLinkListInsert list = new SinglyLinkListInsert();
		list = list.insert(list, 1);
		list = list.insert(list, 4);
		list = list.insert(list, 7);
		printList(list);
	}
}
