

public class Main {

	public static void main(String[] args) {
		// gumballMachine1: Accepts only Quarters, cost is 25 cents
		GumballMachine gumballMachine1 = new GumballMachine(5,1);
		System.out.println(gumballMachine1);
		// have no quarter
		gumballMachine1.insertCoin(10, 10, 0, 0);
		gumballMachine1.turnCrank();
		// have quarter
		gumballMachine1.insertCoin(10, 10, 0, 1);
		gumballMachine1.turnCrank();
		System.out.println(gumballMachine1);

		// gumballMachine2: Accepts two Quarters, cost is 50 cents
		GumballMachine gumballMachine2 = new GumballMachine(5,2);
		System.out.println(gumballMachine2);
		//have no quarter
		gumballMachine2.insertCoin(10, 10, 0, 0);
		gumballMachine2.turnCrank();
		// don't have enough quarters
		gumballMachine2.insertCoin(10, 10, 0, 1);
		gumballMachine2.turnCrank();
		// have enough quarter
		gumballMachine2.insertCoin(10, 10, 2, 2);
		gumballMachine2.turnCrank();
		gumballMachine2.insertCoin(10, 10, 2, 2);
		gumballMachine2.turnCrank();
		System.out.println(gumballMachine2);

		// gumballMachine3: Accepts all coins, cost is 50 cents
		GumballMachine gumballMachine3 = new GumballMachine(5,3);
		System.out.println(gumballMachine3);
		// don't have enough coins
		gumballMachine3.insertCoin(10, 0, 0, 0);
		gumballMachine3.turnCrank();
		// have enough coins
		gumballMachine3.insertCoin(10, 10, 5, 5);
		gumballMachine3.turnCrank();
		gumballMachine3.insertCoin(10, 10, 5, 5);
		gumballMachine3.turnCrank();
		System.out.println(gumballMachine3);
	}
}
