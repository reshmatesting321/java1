package dataStructures;

import dataStructures.SinglyLinkListInsert.Node;

public class SinglyLinkListDelete {
Node1 head;
	static class Node1{
		int data;
		Node1 next;
		public Node1(int d){
			data = d;
			next = null;
		}
	}
	public static SinglyLinkListDelete insert(SinglyLinkListDelete list,int data){
		Node1 new_node = new Node1(data);
		new_node.next=null; //means node's next is null and tht node contain data and next value.	
		if( list.head==null){//while adding first node
			list.head=new_node;
		}
		else{
			Node1 last = list.head;
			while(last.next!=null){//Traversing to last node
				last=last.next;
			}
			last.next=new_node;
		}
		return list;
	}
public static void printList(SinglyLinkListDelete list){
	Node1 currNode = list.head;
	System.out.println("Single Link List!");
	while(currNode!=null){
		System.out.print(currNode.data + " ");
		currNode = currNode.next;
	}		
}
public static SinglyLinkListDelete deleteAtPosition(SinglyLinkListDelete list,int index){//DELETE BY INDEX
	Node1 prev=null, currNode = list.head;
	//Case 1: index =0
	if(index==0 && currNode!=null){
		list.head = currNode.next;
		System.out.println(index + " position element deleted"); 
		return list;
	}
	int counter=0;
	while(currNode!=null){
		if(counter==index){
			prev.next=currNode.next;
			System.out.println(index + " position element deleted"); 
            break; 
		}
		else{
			// If current position is not the index  // continue to next node 
            prev = currNode; 
            currNode = currNode.next; 
            counter++;
		}
		if (currNode == null) { 
            // Display the message 
            System.out.println(index + " position element not found"); 
        }
	}
	return list;
}
public static SinglyLinkListDelete deleteByKey(SinglyLinkListDelete list, int key) 
{ 
    Node1 currNode = list.head, prev = null; 
    if (currNode != null && currNode.data == key) { 
        list.head = currNode.next; // Changed head         // Display the message 
        System.out.println(key + " found and deleted"); 
        return list;  // Return the updated List 
    } 
    while (currNode != null && currNode.data != key) { 
        prev = currNode; 
        currNode = currNode.next; 
    } 
    if (currNode != null) { 
        prev.next = currNode.next; 
        System.out.println(key + " found and deleted"); 
    } 
    if (currNode == null) { 
        System.out.println(key + " not found"); 
    } 
    return list; 
} 
	public static void main(String[] args) {
		SinglyLinkListDelete list = new SinglyLinkListDelete();
		list = insert(list,1);
		list = insert(list,5);
		list = insert(list,23);
		list = insert(list,8);
		printList(list);
		System.out.println();
		deleteAtPosition(list,2); //INDEX STARTS FROM 0
		printList(list);
		System.out.println();
		deleteAtPosition(list,0);
		printList(list);
		System.out.println();
		deleteAtPosition(list,22);
		System.out.println();
		printList(list);
		list = insert(list, 9); 
        list = insert(list, 6); 
        list = insert(list, 7); 
        list = insert(list, 18);
        printList(list);
        System.out.println();
        deleteByKey(list, 9); 
        printList(list);
        System.out.println();
        deleteByKey(list, 5); 
        printList(list); 
        System.out.println();
        deleteByKey(list, 10); 
        System.out.println();
        printList(list); 
	}

}
