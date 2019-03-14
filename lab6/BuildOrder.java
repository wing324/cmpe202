
/**
 * Write a description of class BuildOrder here.
 *
 * @author (Min Yu)
 * @version (03/14/2019)
 */
public class BuildOrder extends Composite
{
  private double price;
  public BuildOrder(double price)
  {
    this.price = price;
    if(this.price==0)
    {
      System.out.println("1\tLBB");
    }
    else
    {
      System.out.println("1\tLBB\t\t\t\t"+this.price);
    }
  }
}
