

public class Client {

    public static void runTest()
    {
        Component theOrder1 = BuildOrder.getOrder1() ;
        theOrder1.printDescription();

        System.out.println();
        System.out.println();

        Component theOrder2 = BuildOrder.getOrder2() ;
        theOrder2.printDescription();

    }
}
