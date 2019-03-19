
/**
 * Write a description of class PremiumToppings here.
 *
 * @author (Min Yu)
 * @version (3/18/19)
 */
public class PremiumToppings extends LeafDecorator
{
  private String[] options ;


   public PremiumToppings( String d )
   {
       super(d) ;
   }

   // Marinated Tomotoes 3.00, other PremiumToppings is 1.00
   public void setOptions( String[] options )
   {
       this.options = options ;
        for ( int i = 0; i<options.length; i++ )
        {
            if ("Marinated Tomatoes".equals(options[i]) )  {
                this.price += 3.00 ;
            }
            else {
                this.price += 1.00 ;
            }
        }
   }

   public String getDescription()
   {
       String desc = "   " ;
       for ( int i = 0; i<options.length; i++ )
       {
           if (i>0) desc += " + " + options[i] ;
           else desc = options[i] ;
       }
       return desc ;
   }

}
