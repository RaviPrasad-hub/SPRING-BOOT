package com.coconut.demo;

import java.util.TreeMap;

public class SortTreeMap {

	public static void treeMap() {
		TreeMap<Integer,String> mango = new TreeMap<Integer,String>((A,B)-> (A > B)?-1 : (A < B)? 1 : 0);
		mango.put(1 , "karta");
		mango.put(2, "karma");
		mango.put(3,"karan");
		mango.put(4,  "sampradan");
		System.out.println(mango);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		treeMap();
	}

}
