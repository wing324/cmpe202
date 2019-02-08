public class GumballMachine
{
    private int num_gumballs;
    private int type_gumball_machine;
    private int total_coins;
    private int total_quarters;
    private int total_refunds;
    //private boolean has_quarter;

    public GumballMachine( int size, int type_gumball_machine)
    {
        //type_gumball_machine=1: Accepts only Quarters, cost is 25 cents
        //type_gumball_machine=2: Accepts two Quarters, cost is 50 cents
        //type_gumball_machine=3: Accepts all coins, cost is 50 cents
        // initialise instance variables
        this.num_gumballs = size;
        this.total_coins= 0;
        this.total_quarters = 0;
        this.type_gumball_machine = type_gumball_machine;
        //this.has_quarter = false;
    }

    public void insertCoin(int num_nickel, int num_penny, int num_dime, int num_quarter)
    {
        //Nickel: 1 cent
        //Penny: 5 cents
        // Dime: 10 cents
        // Quarter: 25 cents
        this.total_quarters = num_quarter * 25;
        this.total_coins = num_nickel + num_penny * 5 + num_dime * 10 + this.total_quarters;
    }

    public void turnCrank()
    {
        if (this.total_coins < 25)
        {
            System.out.println("Please insert enough coins.");
        }
        else
        {   // this.total_coin > 25
            if (this.num_gumballs <= 0)
            {
                System.out.println( "No More Gumballs! Sorry, can't return your quarter." ) ;
            }
            else
            {
                // this.num_gumballs > 0
                if ((this.type_gumball_machine == 1 && this.total_quarters >= 25)||(this.type_gumball_machine == 2 && this.total_quarters >= 50)||(this.type_gumball_machine == 3 && this.total_coins >= 50))
                {
                    this.num_gumballs --;
                    System.out.println("Thank you for your coin. Gumball Ejected!");
                }
                else
                {
                    System.out.println("Please insert correct or enough coin.");
                }
            }
        }


    }
}
