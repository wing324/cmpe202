public class GumballMachine
{
    private int num_gumballs;
    private int total_coins;
    private int total_quarters;
    private int total_refunds;
    //private boolean has_quarter;

    public GumballMachine( int size )
    {
        // initialise instance variables
        this.num_gumballs = size;
        this.total_coins= 0;
        this.total_quarters = 0;
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

    public void turnCrank(int type_gumball_machine)
    {
        //type_gumball_machine=1: Accepts only Quarters, cost is 25 cents
        //type_gumball_machine=2: Accepts two Quarters, cost is 50 cents
        //type_gumball_machine=3: Accepts all coins, cost is 50 cents

        if (this.total_coins < 25)
        {
            System.out.println("Please insert enough coins.\n");
        }
        else
        {   // this.total_coin > 25
            if (this.num_gumballs <= 0)
            {
                System.out.println( "No More Gumballs! We will return you "+ this.total_coins + " cents.\n" ) ;
            }
            else
            {
                // this.num_gumballs > 0
                if ((type_gumball_machine == 1 && total_quarters >= 25)||(type_gumball_machine == 2 && total_quarters >= 50)||(type_gumball_machine == 3 && total_coins >= 50))
                {
                    this.num_gumballs --;
                    if (type_gumball_machine == 1)
                    {
                      this.total_refunds = this.total_coins - 25;
                    }
                    else
                    {
                      this.total_refunds = this.total_coins - 50;
                    }
                    System.out.println("Thank you for your coin. Gumball Ejected! And we will return you "+ this.total_refunds + " cents.\n");
                }
                else
                {
                    System.out.println("Please insert correct or enough coin.\n");
                }
            }
        }


    }
}
