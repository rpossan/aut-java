package heranca;

import interfaces.Animal;

public class Bird implements Animal{
	
	private int legs;

	private void fly(){
		System.out.println("Flying ...");
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
