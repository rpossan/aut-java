package basic;

public class Travel {

	public static void main(String[] args) {
		Car civic = new Car();
		civic.refuel();

		int actions = 0;
		while(civic.getSpeed() < 200){
			if(civic.getFuel() <= 8){
				civic.refuel();
			}
			civic.accelerate();
			actions = actions + 1;
			System.out.println(actions);
			if(actions > 20){ break;}
		}
	}
}
