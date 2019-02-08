

public class SoldOutState implements State {
    GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

	public void insertCoin(int num_nickel, int num_penny, int num_dime, int num_quarter) {
		System.out.println("You can't insert a Coin, the machine is sold out");
	}

	public void ejectCoin() {
		System.out.println("You can't eject, you haven't inserted a Coin yet");
	}

	public void turnCrank() {
		System.out.println("You turned, but there are no gumballs");
	}

	public void dispense() {
		System.out.println("No gumball dispensed");
	}

	public String toString() {
		return "sold out";
	}
}
