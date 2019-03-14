
/**
 * Write a description of class PaperReceipt here.
 *
 * @author (Min Yu)
 * @version (03/14/2019)
 */
public class PaperReceipt implements BillStrategy
{
  @Override
  public void printBill()
  {
    System.out.println("FIVE GUYS");
    System.out.println("BURGERS AND FRIES");
    System.out.println("STORE # CA-1294");
    System.out.println("5353 ALMADEN EXPY N60");
    System.out.println("SAN JOSE, CA 95118");
    System.out.println("(P) 408-264-9300)");
    System.out.println();
    System.out.println();
    System.out.println("12/1/2016 1:46:54 PM");
    System.out.println();
    System.out.println("FIVE GUYS");
    System.out.println("Order Number: 45");
    System.out.println();
    BuildOrder order = new BuildOrder(5.59);
    Bacon bacon = new Bacon();
    Lettuce lettuce = new Lettuce();
    Tomato tomato = new Tomato();
    GONION gonion = new GONION();
    JALAGrilled jalaGrilled = new JALAGrilled();
    Fries fries = new Fries(2.79);
    order.add(bacon);
    order.add(lettuce);
    order.add(tomato);
    order.add(gonion);
    order.add(jalaGrilled);
    order.add(fries);
    order.printItem();
    System.out.println();
    System.out.println("\tSub. Total:\t\t\t$8.38");
    System.out.println("\tTax:\t\t\t\t$0.76");
    System.out.println("\tTotal:\t\t\t\t$9.14");
    System.out.println();
    System.out.println("\tCash $20:\t\t\t$20");
    System.out.println("\tChange:\t\t\t\t$10.86");
    System.out.println("Register:1\t\tTran Seq No:  57845");
    System.out.println("Cashier:Sakda* S.");
  }
}
