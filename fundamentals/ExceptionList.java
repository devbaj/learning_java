import java.util.ArrayList;

public class ExceptionList
{
  public void TryCast()
  {
    ArrayList<Object> myList = new ArrayList<Object>();
    myList.add("13");
    myList.add("hello world");
    myList.add(48);
    myList.add("goodbye world");
    for (int i = 0; i < myList.size(); i++)
    {
      try {
        Integer castedValue = (Integer) myList.get(i);
      } catch (Exception e) {
        System.out.printf("Error casting at index %d, value %s\n", i, myList.get(i));
      }
    }
  }
}