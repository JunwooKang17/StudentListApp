package com.example.lab2;

public class Student implements Comparable<Student>{
	int no;
	String name;
	int age;
	
	public int compareTo(Student o) {
		return name.compareTo(o.name);
	}
	
	
	public Student(int no, String name, int age) {
		this.no = no;
		this.name = name;
		this.age = age;
	}
	/*
	public void setNO() {
		
	}
	public String getName() {
		
	}
	public void setName(String name) {
		
	}
	public int getAge() {
		
	}
	public void setAge(int age) {
		
	}
	*/
	public String toString() {
		String s = ("Student [no="+no+", name = "+name+", "+age+"]");
		return s;
				
	}

	

}
