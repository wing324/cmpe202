
/**
 * Write a description of class BillContext here.
 *
 * @author (Min Yu)
 * @version (03/14/2019)
 */
public class BillContext
{
  private BillStrategy billStrategy;

  public BillContext(BillStrategy billStrategy){
    this.billStrategy = billStrategy;
  }

  public void executeBillStrategy(){
    billStrategy.printBill();
  }
}
