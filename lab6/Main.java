
/**
 * Write a description of class Main here.
 *
 * @author (Min Yu)
 * @version (03/14/2019)
 */
public class Main
{
    public static void main(String[] args)
    {
      System.out.println("Paper Receipt:");
      BillContext paperReceipt = new BillContext(new PaperReceipt());
      paperReceipt.executeBillStrategy();
      System.out.println();
      System.out.println();
      System.out.println();
      System.out.println();
      System.out.println("Packing Slip:");
      BillContext packingSlip = new BillContext(new PackingSlip());
      packingSlip.executeBillStrategy();

    }
}
