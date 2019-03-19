
/**
 * Write a description of class UnlimitedToppings here.
 *
 * @author (Min Yu)
 * @version (3/18/19)
 */
public class UnlimitedToppings extends LeafDecorator
{
  private String[] options ;


   public UnlimitedToppings( String d )
   {
       super(d) ;
   }

   // free Toppings
   public void setOptions( String[] options )
   {
       this.options = options ;
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
