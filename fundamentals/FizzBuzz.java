public class FizzBuzz
{
  public String CheckValue(int n)
  {
    if (n % 3 == 0)
    {
      if (n % 5 == 0)
      {
        return "FizzBuzz";
      }
      return "Fizz";
    }
    else if (n % 5 == 0)
    {
      return "Buzz";
    }
    else
    {
      return String.valueOf(n);
    }
  }
}