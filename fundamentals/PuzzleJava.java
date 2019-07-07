import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Collections;

public class PuzzleJava
{
  public int[] DoIntArrayThings()
  {
    int[] myArray = new int[] {3,5,1,2,7,9,8,13,25,32};
    int sum = 0;
    ArrayList<Integer> filteredArray = new ArrayList<Integer>();
    for (int n : myArray)
    {
      if (n > 10) { filteredArray.add(n); }
      sum += n;
    }
    System.out.printf("Sum: %d \n", sum);
    int[] returnArray = new int[filteredArray.size()];
    for (int i = 0; i < returnArray.length; i++)
    {
      returnArray[i] = (int)filteredArray.get(i);
    }
    return returnArray;
  }

  public String[] FunWithNames()
  {
    String[] names = new String[]
      {"Nancy","Jinichi","Fujibayashi","Momochi","Ishikawa"};
    // Shuffle the array
    Random rand = new Random();
    for (int i = names.length - 1; i > 0; i--)
    {
      int j = rand.nextInt(i+1);
      String temp = names[i];
      names[i] = names[j];
      names[j] = temp;
    }
    System.out.println(Arrays.toString(names));
    ArrayList<String> filteredNames = new ArrayList<String>();
    for (String name : names)
    {
      if (name.length() > 5) { filteredNames.add(name); }
    }
    String[] returnArray = new String[filteredNames.size()];
    for (int i = 0; i < returnArray.length; i++)
    {
      returnArray[i] = filteredNames.get(i);
    }
    return returnArray;
  }

  public void AlphabetSoup()
  {
    char[] alpha = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    ArrayList<Character> alphaList = new ArrayList<Character>();
    for (char letter : alpha)
    {
      alphaList.add((char)letter);
    }
    Collections.shuffle(alphaList);
    System.out.
      printf("Last letter of collection: %c\n",
        alphaList.get(alphaList.size()-1));
    char first = alphaList.get(0);
    if (first == 'a' || first == 'e' || first == 'i'
      || first == 'o' || first == 'u')
    {
      System.out.println("The first letter of the collection is a vowel.");
    }
    System.out.printf("First letter of collection: %c\n", first);
  }

  public int[] RandomArray()
  {
    ArrayList<Integer> myArrayList = new ArrayList<Integer>();
    Random rand = new Random();
    for (int i = 0; i < 10; i++)
    {
      myArrayList.add(rand.nextInt(100-55)+55);
    }
    int[] returnArray = new int[myArrayList.size()];
    for (int i = 0; i < myArrayList.size(); i++)
    {
      returnArray[i] = myArrayList.get(i);
    }
    return returnArray;
  }

  public int[] ExtendRandomArray()
  {
    int[] myArray = RandomArray();
    Arrays.sort(myArray);
    System.out.println(Arrays.toString(myArray));
    System.out.printf("Minimum: %d\n", myArray[0]);
    System.out.printf("Maximum: %d\n", myArray[myArray.length-1]);
    return myArray;
  }

  public String RandomString()
  {
    char[] allChars = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    Random rand = new Random();
    ArrayList<Character> randomCharList = new ArrayList<Character>();
    for (int i = 0; i < 5; i++)
    {
      randomCharList.add(allChars[rand.nextInt(allChars.length)]);
    }
    StringBuilder sb = new StringBuilder();
    for (Character c : randomCharList) {
      sb.append(c);
    }
    String result = sb.toString();
    return result;
  }

  public String[] GenerateSetOfStrings()
  {
    String[] randomSet = new String[10];
    for (int i = 0; i < randomSet.length; i++)
    {
      randomSet[i] = RandomString();
    }
    return randomSet;
  }
}