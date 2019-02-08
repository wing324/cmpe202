

public interface State {

	public void insertCoin(int num_nickel, int num_penny, int num_dime, int num_quarter);
	public void ejectCoin();
	public void turnCrank();
	public void dispense();
}
