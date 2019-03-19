

public class BuildOrder {

    public static Component getOrder1()
    {
        // Burger #1
        Composite order = new Composite( "Order" ) ;
        CustomBurger customBurger = new CustomBurger( "Build Your Own Burger" ) ;
        // Orfanic Bison,1/2lb
        Burger b = new Burger( "Burger Options" ) ;
        String[] bo = { "Organic Bison*", "1/2lb.", "On A Bun" } ;
        b.setOptions( bo ) ;
        // 1 cheese free, extra cheese +1.00
        Cheese c = new Cheese( "Cheese Options" ) ;
        String[] co = { "Yellow American", "Spicy Jalapeno Jack" } ;
        c.setOptions( co ) ;
        c.wrapDecorator( b ) ;
        //  Premium Chesse +1.50
        PremiumCheese pc = new PremiumCheese("Premium Cheese Options");
        String[] pco = {"Danish Blue Cheese"};
        pc.setOptions( pco );
        pc.wrapDecorator( c );
        // 1 sauce free, extra +.50
        Sauce s = new Sauce( "Sauce Options" ) ;
        String[] so = { "Mayonnaise", "Thai Peanut Sauce" } ;
        s.setOptions( so ) ;
        s.wrapDecorator( pc ) ;
        // Unlimited Toppings for free
        UnlimitedToppings ut = new UnlimitedToppings("Unlimited Toppings");
        String[] uto = { "Dill Pickle Chips", "Black Olives", "Spicy Pickles" };
        ut.setOptions( uto );
        ut.wrapDecorator( s );
        // premium topping 1.00 - 3.00
        PremiumToppings pt = new PremiumToppings( "Premium Toppings Options" ) ;
        String[] pto = { "Marinated Tomatoes" } ;
        pt.setOptions( pto ) ;
        pt.wrapDecorator( ut ) ;
        // BUN Free or 1.00
        Bun bun = new Bun("Bun Options");
        String[] buno = {"Ciabatta(Vegan)"};
        bun.setOptions( buno );
        bun.wrapDecorator( pt );
        // Side
        Side side = new Side("Side Options");
        String[] sideo = {"Shoestring Fries"};
        side.setOptions( sideo );
        side.wrapDecorator( bun );
        // Setup Custom Burger Ingredients
        customBurger.setDecorator( side ) ;
        customBurger.addChild( b ) ;
        customBurger.addChild( c ) ;
        customBurger.addChild( pc ) ;
        customBurger.addChild( s ) ;
        customBurger.addChild( ut ) ;
        customBurger.addChild( pt ) ;
        customBurger.addChild( bun ) ;
        customBurger.addChild( side ) ;
        // Add Custom Burger to the ORder
        order.addChild( customBurger );
        return order ;
    }

    public static Component getOrder2()
    {
        // Burger #2
        Composite order = new Composite( "Order" ) ;
        CustomBurger customBurger = new CustomBurger( "Build Your Own Burger" ) ;
        // Burger
        Burger b = new Burger( "Burger Options" ) ;
        String[] bo = { "Hormone & Antibiotic Free Beef*", "1/3lb.", "On A Bun" } ;
        b.setOptions( bo ) ;
        // 1 cheese free, extra cheese +1.00
        Cheese c = new Cheese( "Cheese Options" ) ;
        String[] co = { "Smoked Gouda", "Greek Feta" } ;
        c.setOptions( co ) ;
        c.wrapDecorator( b ) ;
        //  Premium Chesse +1.50
        PremiumCheese pc = new PremiumCheese("Premium Cheese Options");
        String[] pco = {"Fresh Mozzarella"};
        pc.setOptions( pco );
        pc.wrapDecorator( c );
        // 1 sauce free, extra +.50
        Sauce s = new Sauce( "Sauce Options" ) ;
        String[] so = { "Habanero Salsa" } ;
        s.setOptions( so ) ;
        s.wrapDecorator( pc ) ;
        // Unlimited Toppings for free
        UnlimitedToppings ut = new UnlimitedToppings("Unlimited Toppings");
        String[] uto = { "Crushed Peanuts" };
        ut.setOptions( uto );
        ut.wrapDecorator( s );
        // premium topping 1.00 - 3.00
        PremiumToppings pt = new PremiumToppings( "Premium Toppings Options" ) ;
        String[] pto = { "Sunny Side Up Egg*","Marinated Tomatoes" } ;
        pt.setOptions( pto ) ;
        pt.wrapDecorator( ut ) ;
        // BUN Free or 1.00
        Bun bun = new Bun("Bun Options");
        String[] buno = {"Gluten-Free Bun"};
        bun.setOptions( buno );
        bun.wrapDecorator( pt );
        // Side
        Side side = new Side("Side Options");
        String[] sideo = {"Shoestring Fries"};
        side.setOptions( sideo );
        side.wrapDecorator( bun );
        // Setup Custom Burger Ingredients
        customBurger.setDecorator( side ) ;
        customBurger.addChild( b ) ;
        customBurger.addChild( c ) ;
        customBurger.addChild( pc ) ;
        customBurger.addChild( s ) ;
        customBurger.addChild( ut ) ;
        customBurger.addChild( pt ) ;
        customBurger.addChild( bun ) ;
        customBurger.addChild( side ) ;
        // Add Custom Burger to the ORder
        order.addChild( customBurger );
        return order ;
    }

}


/*

Counter Burger Menu:
https://thecounterburger.emn8.com/?store=Times%20Square

*/
