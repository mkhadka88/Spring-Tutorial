package com.mahesh.SpringDemo;

public class Alien {
	private int age;
	private Laptop laptop;
	public Alien() {
		System.out.println("Alien object created.");
	}
	
public Laptop getLaptop() {
		return laptop;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}

public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

public void code() {
	System.out.println("I'm coding.");
	laptop.code();
}
}
