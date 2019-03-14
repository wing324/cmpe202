
/**
 * Write a description of class Fries here.
 *
 * @author (Min Yu)
 * @version (03/14/2019)
 */
public class Fries implements Component
{
    private double price;

    public Fries(double price)
    {
      this.price = price;
    }

    @Override
    public void printItem()
    {
      if(this.price == 0)
      {
        System.out.println("1\tLTLCAJ");
      }
      else
      {
        System.out.println("1\tLTLCAJ\t\t\t\t"+this.price);
      }
    }

    @Override
    public void add(Component c)
    {

    }

    @Override
    public void remove(Component c)
    {

    }
}
