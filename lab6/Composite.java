import java.util.ArrayList;
import java.util.List;
/**
 * Write a description of class Composite here.
 *
 * @author (Min yu)
 * @version (03/14/2019)
 */
public class Composite implements Component
{
  private List<Component> components;

  public Composite()
  {
    components = new ArrayList<Component>();
  }

  @Override
  public void add(Component c)
  {
    components.add(c);
  }

  @Override
  public void remove(Component c)
  {
    components.remove(c);
  }

  @Override
  public void printItem()
  {
    for(Component component : components)
    {
      component.printItem();
    }
  }
}
