package practice3.animal.model;

public class Animal {
	protected String name;
	protected int age;
	
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void makeSound() {
		System.out.println("Animal makes a sound");
	}
	
	public void eat() {
		System.out.println(this.name + " is eating");
	}
	
	public void eat(String food) {
		System.out.println(name + " is eating " + food);
	}
	
	public void getInfo() {
		System.out.println("Name: " + this.name);
		System.out.println("Age: " + this.age);
	}
}
