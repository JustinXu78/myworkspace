package com.gladiatorxu.PolDemo;

abstract class Pets{
	private String name;
	private int price;
	
	public Pets(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public abstract void like();
}

class Cat extends Pets{
	private String food;

	public String getFood() {
		return food;
	}


	public void setFood(String food) {
		this.food = food;
	}


	public Cat(String name, int price, String food) {
		super(name, price);
		this.food = food;
	}


	@Override
	public void like() {
		// TODO Auto-generated method stub
		System.out.println("name: " + getName() +"  price: "+getPrice()+"  like: " + getFood());
	}
	
	
}

class Dog extends Pets{
	private String toy;

	public Dog(String name, int price, String toy) {
		super(name, price);
		this.toy = toy;
	}

	public String getToy() {
		return toy;
	}

	public void setToy(String toy) {
		this.toy = toy;
	}

	@Override
	public void like() {
		// TODO Auto-generated method stub
		System.out.println("name: " + getName() +"  price: "+getPrice()+"  like: " + getToy());
	}
	
}
public class PolDemo03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pets[] pets = new Pets[2];
		pets[0] = new Cat("Kitty",20,"fish");
		pets[1] = new Dog("Geoge", 30, "car");
		for (int i = 0; i < pets.length; i++) {
			pets[i].like();
		}
		
	}

}
