public class StringManipulator
{
  public String TrimAndConcat(String s1, String s2)
  {
    String trimmedS1 = s1.trim();
    String trimmedS2 = s2.trim();
    String answer = trimmedS1.concat(trimmedS2);
    return answer;
  }

  public Integer GetIndexOrNull(String someString, char someChar)
  {
    Integer answer = someString.indexOf(someChar);
    return answer < 0 ? null : answer;
  }

  public Integer GetIndexOrNull(String s1, String s2)
  {
    Integer answer = s1.indexOf(s2);
    return answer < 0 ? null : answer;
  }

  public String ConcatSubstring(String from, int start, int end, String to)
  {
    String sliced = from.substring(start, end);
    String answer = sliced.concat(to);
    return answer;
  }
}