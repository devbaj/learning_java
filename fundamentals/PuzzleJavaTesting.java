import java.util.Arrays;

public class PuzzleJavaTesting
{
  public static void main(String[] args)
  {
    PuzzleJava puzzle = new PuzzleJava();

    System.out.println("Test getting array sum and filtering array");
    System.out.println(Arrays.toString(puzzle.DoIntArrayThings()));

    System.out.println("Test name array manipulation");
    System.out.println(Arrays.toString(puzzle.FunWithNames()));

    System.out.println("Test alphabet array stuff");
    puzzle.AlphabetSoup();

    System.out.println("Test random array generation");
    System.out.println(Arrays.toString(puzzle.RandomArray()));

    System.out.println("Test extending random array");
    System.out.println(Arrays.toString(puzzle.ExtendRandomArray()));

    System.out.println("Test random string generation");
    System.out.println(puzzle.RandomString());

    System.out.println("Test generating set of random strings");
    System.out.println(Arrays.toString(puzzle.GenerateSetOfStrings()));
  }
}