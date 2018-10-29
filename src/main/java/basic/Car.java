package basic;

public class Car {
	// Atributos da classe
	private int fuel = 0;
	private int speed;
	private int refuels = 2;
	public static final int MAXSPEED = 200;

	// Getters e Setters
	public int getFuel() {
		return fuel;
	}

	public boolean refuel() {
		if(refuels > 0){
			refuels = refuels - 1;
			fuel = 45;
			return true;
		}else{
			System.out.println("Esgotou a quantidade de refuel!");
			return false;
		}
	}
	
	public int getSpeed(){
		return speed;
	}
	
	public void accelerate(){
		if(fuel <= 0){
			System.out.println("Sem combustível :(");
		}else{
			int nextSpeed = speed;
			int consumo = 0;
			if(fuel >= 25){
				nextSpeed += 10;
				consumo = 3;
			}else{
				nextSpeed += 15;
				consumo = 2;
			}
			
			if(validSpeed(nextSpeed)){
				speed = nextSpeed;
				fuel -= consumo;
			}
			drive();
		}
	}
	
	private void drive(){
		System.out.println("Vrum! Dirigindo a " + speed + "KM/h.");
		System.out.println("Restam " + fuel + " de combustível.");
	}
	
	private boolean validSpeed(int speed){
		boolean isValid = true;
		if(speed > MAXSPEED){
			isValid = false;
			System.out.println("NÃO PODE ACELERAR, ULTRAPASSA O LIMITE DE 200!");
		}
		return isValid;
	}
	
}
