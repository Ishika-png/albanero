package basics;

import encapsulation.EncapsulationIntro;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Person p1 = new Person();
//		p1.age = 23;
//		p1.name = "Ishika";
//		System.out.println(p1.age + " " + p1.name);
//		p1.eat();
//		p1.walk();
//		p1.walk(2);
		
//		Person p2 = new Person(22, "Harsh");
//		p2.age = 22;
//		p2.name = "Harsh";
//		System.out.println(p2.age + " " + p2.name);
		
//		System.out.println(Person.count);
		
//		Developer d1 = new Developer(20, "Ishika");
//		d1.walk();
		
		EncapsulationIntro obj = new EncapsulationIntro();
//		obj.doWork();
		
	}

}

//inheritance
class Developer extends Person {

	public Developer(int age, String name) {
		//used for calling parent's constructor
		super(age, name);
	}
	
	//run time polymorphism
	void walk() {
		System.out.println("Developer " + name + " is walking");
	}
	
}

class Person {
	String name;
	int age;
	
	//static = class ki property not object's property anymore
	static int count;
	
	//default constructor
//	public Person() {
//		count++;
//		System.out.println("constructor");
//	}
	
	public Person(int age, String name) {
		//this() used for called it's own constructor so count increased
//		this();
		this.age = age;
		this.name = name;
	}
	
	void walk() {
		System.out.println(name + " is walking");
	}
	
	void eat() {
		System.out.println(name + " is eating");
	}
	
	//compile time polymorphism
	void walk(int steps) {
		System.out.println(name + " walked " + steps + " steps");
	}
	
	void work() {
		System.out.println(name + " is working");
	}
}
