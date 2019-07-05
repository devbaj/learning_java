public class StringManipulatorTesting
{
  public static void main(String[] args)
  {
    StringManipulator manipulator = new StringManipulator();
    System.out.println("test TrimAndConcat with '   hello   ','   world   '");
    System.out.println(manipulator.TrimAndConcat("   hello   ", "   world   ")); // * test success

    System.out.println("test GetIndexOrNull with 'cat','a'");
    System.out.println(manipulator.GetIndexOrNull("cat", 'a'));
    System.out.println("test GetIndexOrNull with 'cat','d'");
    System.out.println(manipulator.GetIndexOrNull("cat", 'd'));

    System.out.println("test GetIndexOrNull overload with 'category','ego'");
    System.out.println(manipulator.GetIndexOrNull("category", "ego"));
    System.out.println("test GetIndexOrNull overload with 'category','dog'");
    System.out.println(manipulator.GetIndexOrNull("category", "dog"));

    System.out.println("test ConcatSubstring with 'Hello', 1, 2, 'world'");
    System.out.println(manipulator.ConcatSubstring("Hello", 1, 2, "world"));
  }
}