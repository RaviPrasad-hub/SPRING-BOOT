package com.papaya.Lambda;

import java.util.Comparator;

public class myComparator implements Comparator<Integer> {
	public int compare(Integer i1 , Integer i2) {
		System.out.println(i1 - i2);
		return i1 - i2;
	}

}
