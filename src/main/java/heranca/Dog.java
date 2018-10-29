package heranca;

import interfaces.Animal;

public class Dog implements Animal {
	
	private int legs;

	private void run(){
		System.out.println("Running ...");
	}

	public void setLegs(int legs) {
		this.legs = legs;
	}

	public int getLegs() {
		return this.legs;
	}

	public void eat() {
		System.out.println("Eating...");
	}
}
