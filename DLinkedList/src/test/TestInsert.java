package test;

import list.DLinkedList;

public class TestInsert {

	public static void main(String[] args) {
		
		DLinkedList myList = new DLinkedList();
		myList.insertHead(15);
		System.out.println(myList.toString());
		myList.insertHead(85);		
		System.out.println(myList.toString());
		myList.insertTail(25);
	}

}
