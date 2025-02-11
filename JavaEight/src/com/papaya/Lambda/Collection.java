package com.papaya.Lambda;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Collection {

	
	/*Comparator INterface contains SAM compare()  -- hence its an interface
	 * To define our own sorting
	 * public int compare (obj1 , obj2)
	 * */
	
	
	public static void collections() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(12);
		list.add(234);
		list.add(34);
		Collections.sort(list, (A,B)-> (A > B)?1 : (A < B)? -1 : 0);
		System.out.println(list);
	}
	
	public static void main(String args[]) {
		collections();
	}
	
}
