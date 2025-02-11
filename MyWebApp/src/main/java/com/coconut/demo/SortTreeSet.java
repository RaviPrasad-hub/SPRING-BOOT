package com.coconut.demo;
import java.util.TreeSet;

public class SortTreeSet {

	public static void tree() {
		TreeSet<Integer> guava = new TreeSet<Integer>();
		guava.add(1);
		guava.add(6);
		guava.add(-9);
		guava.add(32);
		guava.add(5);	
		System.out.println(guava);
	}
	
	public static void main(String args[]) {
		tree();
	}
}
