

public class NoCoinState implements State {
    GumballMachine gumballMachine;
    private int total_quarters = 0;
    private int total_coins = 0;

    public NoCoinState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

	public void insertCoin(int num_nickel, int num_penny, int num_dime, int num_quarter) {
    this.total_quarters = num_quarter * 25;
    this.total_coins = num_nickel + num_penny * 5 + num_dime * 10 + this.total_quarters;
    if (this.total_coins < 25)
    {
        System.out.println("Please insert enough coins.\n");
    }
    else
    {
      // this.total_coin > 25
        if ((gumballMachine.getTypeGumballMachine() == 1 && this.total_quarters >= 25)||(gumballMachine.getTypeGumballMachine() == 2 && this.total_quarters >= 50)||(gumballMachine.getTypeGumballMachine() == 3 && this.total_coins >= 50))
        {
          System.out.println("You inserted a quarter");
      		gumballMachine.setState(gumballMachine.getHasCoinState());
        }
        else
        {
          System.out.println("Please insert correct or enough coin.\n");
        }
      }
	}

	public void ejectCoin() {
		System.out.println("You haven't inserted a quarter");
	}

	public void turnCrank() {
		System.out.println("You turned, but there's no quarter");
	 }

	public void dispense() {
		System.out.println("You need to pay first");
	}

	public String toString() {
		return "waiting for quarter";
	}
}
