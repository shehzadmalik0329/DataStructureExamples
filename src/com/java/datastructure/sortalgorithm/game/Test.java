package com.java.datastructure.sortalgorithm.game;

import java.util.LinkedList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		L1->1-->2-->3
//		L2->4-->5-->6
//
//
//		L3-->5-->7-->9
		
		//LL1
//		Node linkedList1 = new Node();
//		//LL1.add(linkedList1);
//		Node linkedList2 = new Node();
//		//LL1.add(linkedList2);
//		Node linkedList3 = new Node();
		//LL1.add(linkedList3);
		
		//iterate
//		while(head!= null){
//				print head.data
//				head = head.next;
//		}
		
		//LL2
//		Node linkedList4 = new Node();
//		Node linkedList5 = new Node();
//		Node linkedList6 = new Node();
		
		//LL3
//		while(head1!= null && head2!= null){
//			head1.data + head2.data
//		}
		reverse(5,"hello!");
		
	}
	//reverse(5,hello!)
	public static void reverse(int end, String value){
		if(end == 0){
			System.out.print(value.charAt(end));
			return;
		}
		System.out.print(value.charAt(end));
		reverse(end-1, value);
	}

}

class Node{
	int data;
	Node next;
}
class LL{
	Node head;
}





