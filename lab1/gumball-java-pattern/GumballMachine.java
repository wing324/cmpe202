public class GumballMachine {

	State soldOutState;
	State noCoinState;
	State hasCoinState;
	State soldState;

	State state = noCoinState;
	private int count = 0;
  private int type_gumball_machine = 1;
  private String type2S_gumball_machine="";

	public GumballMachine(int numberGumballs, int typeGumballMachine) {
		soldOutState = new SoldOutState(this);
		noCoinState = new NoCoinState(this);
		hasCoinState = new HasCoinState(this);
		soldState = new SoldState(this);

		this.count = numberGumballs;
 		if (numberGumballs > 0) {
			state = noCoinState;
		}

    //type_gumball_machine=1: Accepts only Quarters, cost is 25 cents
    //type_gumball_machine=2: Accepts two Quarters, cost is 50 cents
    //type_gumball_machine=3: Accepts all coins, cost is 50 cents
    this.type_gumball_machine = typeGumballMachine;
    if (this.type_gumball_machine == 1)
    {
      this.type2S_gumball_machine = "accepts only Quarters, cost is 25 cents. ";
    }
    else if (this.type_gumball_machine == 2)
    {
      this.type2S_gumball_machine = "accepts two Quarters, cost is 50 cents. ";
    }
    else if (this.type_gumball_machine == 3)
    {
      this.type2S_gumball_machine = "accepts all coins, cost is 50 cents. ";
    }
    else
    {
      System.out.println("Please choose a correct type of gumball machine, the type should be 1, 2 or 3.");
    }
	}

	public void insertCoin(int num_nickel, int num_penny, int num_dime, int num_quarter) {
		state.insertCoin(num_nickel, num_penny, num_dime, num_quarter);
	}

	public void ejectCoin() {
		state.ejectCoin();
	}

	public void turnCrank() {
		state.turnCrank();
		state.dispense();
	}

	void setState(State state) {
		this.state = state;
	}

	void releaseBall() {
		System.out.println("A gumball comes rolling out the slot...");
		if (count != 0) {
			count = count - 1;
		}
	}

	int getCount() {
		return count;
	}

	int getTypeGumballMachine() {
		return this.type_gumball_machine;
	}

	void refill(int count) {
		this.count = count;
		state = noCoinState;
	}

    public State getState() {
        return state;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoCoinState() {
        return noCoinState;
    }

    public State getHasCoinState() {
        return hasCoinState;
    }

    public State getSoldState() {
        return soldState;
    }

	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("\nMighty Gumball, Inc.");
		result.append("\nJava-enabled Standing Gumball Model #2004");
    result.append("\nMachine " + this.type2S_gumball_machine);
		result.append("\nInventory: " + count + " gumball");
		if (count != 1) {
			result.append("s");
		}
		result.append("\n");
		result.append("Machine is " + state + "\n");
		return result.toString();
	}
}
