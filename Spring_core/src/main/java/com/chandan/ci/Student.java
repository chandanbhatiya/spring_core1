package com.chandan.ci;

import java.util.List;

public class Student {
	
	private int id;
	private String name;
	private String address;
	
	private List<String> courses;
	
	private Cetificate certificate;
	
	
	
	public Student(int id, String name, String address, List<String> courses, Cetificate certificate) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.courses = courses;
		this.certificate = certificate;
	}

	public Student(int id,String name) {
		System.out.println("int ,String constructor");
		this.id=id;
		this.name=name;
		
	}

	public Student(String name,int id) {
		System.out.println("String ,int constructor");
		this.id=id;
		this.name=name;
		
	}

	public Student(String name, String address) {
		System.out.println("String ,String constructor");
		
		this.name = name;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + ", courses=" + courses
				+ ", certificate=" + certificate + "]";
	}

/*
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + "]"; 
	}
	*/



}
