

import java.util.Random;

public class HasCoinState implements State {
	GumballMachine gumballMachine;

	public HasCoinState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	public void insertCoin(int num_nickel, int num_penny, int num_dime, int num_quarter) {
		System.out.println("You can't insert another coin");
	}

	public void ejectCoin() {
		System.out.println("Coin returned");
		gumballMachine.setState(gumballMachine.getNoCoinState());
	}

	public void turnCrank() {
		System.out.println("You turned...");
		gumballMachine.setState(gumballMachine.getSoldState());
	}

    public void dispense() {
        System.out.println("No gumball dispensed");
    }

	public String toString() {
		return "waiting for turn of crank";
	}
}
