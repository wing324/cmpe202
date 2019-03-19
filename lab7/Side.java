
/**
 * Write a description of class Side here.
 *
 * @author (Min Yu)
 * @version (3/18/19)
 */
public class Side extends LeafDecorator
{
  private String[] options ;

   public Side( String d )
   {
       super(d) ;
   }

   // free Toppings
   public void setOptions( String[] options )
   {
       this.options = options ;
       if ( options.length > 0 )
            this.price += options.length * 3.00 ;
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
