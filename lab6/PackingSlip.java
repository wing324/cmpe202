
/**
 * Write a description of class PackingSlip here.
 *
 * @author (Min Yu)
 * @version (03/14/2019)
 */
public class PackingSlip implements BillStrategy
{
  @Override
  public void printBill()
  {
    System.out.println("Patties - 1");
    System.out.println();
    System.out.println("Order Number: 45");
    System.out.print("12/1/2016 1:46:54 PM");
    System.out.printf("FIVE GUYS");
    System.out.println();
    System.out.println("Sandwich# 1");
    BuildOrder order = new BuildOrder(0);
    Bacon bacon = new Bacon();
    Lettuce lettuce = new Lettuce();
    Tomato tomato = new Tomato();
    GONION gonion = new GONION();
    JALAGrilled jalaGrilled = new JALAGrilled();
    Fries fries = new Fries(0);
    order.add(lettuce);
    order.add(tomato);
    order.add(gonion);
    order.add(jalaGrilled);
    order.add(bacon);
    order.add(fries);
    order.printItem();
    System.out.println("Register:1\t\tTran Seq No:  57845");
    System.out.println("Cashier:Sakda* S.");
  }
}
