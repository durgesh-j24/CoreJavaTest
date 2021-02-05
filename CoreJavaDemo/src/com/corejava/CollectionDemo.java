package com.corejava;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionDemo {


	public static void main(String[] args) {
		
		
		ArrayList<Integer> al=new ArrayList<>();
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		
		
		Iterator<Integer> it=al.iterator();
		
		while(it.hasNext()) {
			
			System.out.println(it.next());
		}
	}
}
