package com.ranjit.arraylist;

import java.util.Iterator;
import java.util.LinkedList;

public class ExampleLinkedList {

	public static void main(String[] args) {
		LinkedList<Integer> list=new LinkedList<Integer>();
		list.add(10);
		list.add(20);
		list.add(20);
		list.add(30);
		Iterator<Integer> itr= list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
