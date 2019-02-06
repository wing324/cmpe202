
public class Main {
    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(3);
        
        // gumballMachine1 testcases
        // don't have quarter
        System.out.println("gumballMachine1: Accepts only Quarters, cost is 25 cents");
        gumballMachine.insertCoin( 10,10,0,0 );
        gumballMachine.turnCrank(1);
        // have quarter
        System.out.println("gumballMachine1: Accepts only Quarters, cost is 25 cents");
        gumballMachine.insertCoin( 10,10,0,1 );
        gumballMachine.turnCrank(1);
        
        //gumballMachine2 testcases
        // don't have enough quarter
        System.out.println("gumballMachine2: Accepts two Quarters, cost is 50 cents");
        gumballMachine.insertCoin( 10,10,5,1 );
        gumballMachine.turnCrank(2);
        // have enough quarter
        System.out.println("gumballMachine2: Accepts two Quarters, cost is 50 cents");
        gumballMachine.insertCoin( 10,10,5,2 );
        gumballMachine.turnCrank(2);
        
        //gumballMachine3 testcases
        // don't have money
        System.out.println("gumballMachine3: Accepts all coins, cost is 50 cents");
        gumballMachine.insertCoin( 0, 0, 0 ,0 );
        gumballMachine.turnCrank(3);
        // have enough money
        System.out.println("gumballMachine3: Accepts all coins, cost is 50 cents");
        gumballMachine.insertCoin( 10,10,5,2 );
        gumballMachine.turnCrank(3);
        
        // No more gumball in machine testcase
        System.out.println("gumballMachine3: Accepts all coins, cost is 50 cents");
        gumballMachine.insertCoin( 10,10,5,2 );
        gumballMachine.turnCrank(3);

        
    }
}
