
public class Main {
    public static void main(String[] args) {
        // gumballMachine1 testcases
        GumballMachine gumballMachine1 = new GumballMachine(3,1);
        System.out.println("gumballMachine1: Accepts only Quarters, cost is 25 cents");
        // don't have quarter
        gumballMachine1.insertCoin( 10,10,0,0 );
        gumballMachine1.turnCrank();
        // have quarter
        gumballMachine1.insertCoin( 10,10,0,1 );
        gumballMachine1.turnCrank();

        //gumballMachine2 testcases
        GumballMachine gumballMachine2 = new GumballMachine(3,2);
        System.out.println("gumballMachine2: Accepts two Quarters, cost is 50 cents");
        // don't have enough quarter
        gumballMachine2.insertCoin( 10,10,5,1 );
        gumballMachine2.turnCrank();
        // have enough quarter
        gumballMachine2.insertCoin( 10,10,5,2 );
        gumballMachine2.turnCrank();

        //gumballMachine3 testcases
        GumballMachine gumballMachine3 = new GumballMachine(1,3);
        System.out.println("gumballMachine3: Accepts all coins, cost is 50 cents");
        // don't have money
        gumballMachine3.insertCoin( 0, 0, 0 ,0 );
        gumballMachine3.turnCrank();
        // have enough money
        gumballMachine3.insertCoin( 10,10,5,2 );
        gumballMachine3.turnCrank();
        // No more gumball in machine testcase
        gumballMachine3.insertCoin( 10,10,5,2 );
        gumballMachine3.turnCrank();
    }
}
