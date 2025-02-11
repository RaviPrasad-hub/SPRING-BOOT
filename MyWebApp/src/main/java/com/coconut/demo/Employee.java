package com.coconut.demo;

import java.util.ArrayList;
import java.util.Collections;

public class Employee {
	int eno;
	String ename;

	Employee(int eno, String ename) {
		this.eno = eno;
		this.ename = ename;
	}

	public String toString() {
		return eno + ":" + ename;
	}

	public static void main(String args[]) {
		
		Employee emp = new Employee(1, "Ravi Ranjan Prasad");
		
		
		ArrayList<Employee> list = new ArrayList<Employee>();
		
		list.add(new Employee(121, "Deepika"));
		list.add(new Employee(223, "Sunny"));
		list.add(new Employee(323, "Katrina"));
		list.add(new Employee(444, "Kiara"));
		list.add(new Employee(564, "Shraddha"));
		list.add(new Employee(645, "Juhi"));		
		Collections.sort(list, (e1,e2)->(e1.eno < e2.eno) ? -1 : (e1.eno > e2.eno) ? 1 : 0);
		System.out.println(list);
		
		
	}
}
