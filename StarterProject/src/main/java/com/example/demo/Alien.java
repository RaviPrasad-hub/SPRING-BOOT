package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component // required for object instantiation
@Scope(value= "prototype") //value is default as well
public class Alien {
	private int aid;
	private String aname;
	private String tech;
	@Autowired // default search by type 
	@Qualifier("lapT") // default search by name
	private Laptop laptop;
	
	
	//constructor
	/* Spring use 2 types of design pattern :
	 * 1. Singleton - object gets created automatically for a component class
	 * 2. Prototype based - object gets createdon getBean()
	 * **/
	
	
	
	public void Alien() {
		System.out.println("Object Created");
	}
	
	public Laptop getLaptop() {
		return laptop;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}

	public int getAid() {
		return aid; 
	}
	
	public void setAid (int aid) {
		this.aid = aid;
	}
	public String getAname () {
		return aname;
	}
    public void setAname (String aname) {
    	this.aname =  aname;
    }
    
    public String getTech() {
    	return tech;
    }
    
    public void setTech(String tech) {
    	this.tech = tech;
    }
    
    public void show() {
    	System.out.println("This is alien pojo");
    	laptop.compile();
    }
}
