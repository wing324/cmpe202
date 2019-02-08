

public interface State {

	public void insertQuarter(int num_nickel, int num_penny, int num_dime, int num_quarter);
	public void ejectQuarter();
	public void turnCrank();
	public void dispense();
}
