import java.util.ArrayList;

public class Basic
{
  public void Print1To255()
  {
    for (int i = 1; i <= 255; i++)
    {
      System.out.println(i);
    }
  }

  public void PrintOdds()
  {
    for (int i = 1; i <= 255; i = i + 2)
    {
      System.out.println(i);
    }
  }

  public void PrintSums1To255()
  {
    int sum = 0;
    for (int i = 0; i <= 255; i++)
    {
      sum += i;
      String output = "New number: " + i + " Sum: " + sum;
      System.out.println(output);
    }
  }

  public void PrintArrayVals(int[] arr)
  {
    for (int i = 0; i < arr.length; i++)
    {
      System.out.println(arr[i]);
    }
  }

  public void PrintArrayMax(int[] arr)
  {
    int max = arr[0];
    for (int i = 0; i < arr.length; i++)
    {
      max = arr[i] > max ? arr[i] : max;
    }
    System.out.println(max);
  }

  public void PrintArrayAverage(int[] arr)
  {
    int sum = 0;
    for (int i = 0; i < arr.length; i++)
    {
      sum += arr[i];
    }
    float average = (float)sum / arr.length;
    System.out.println(average);
  }

  public Object[] CreateOddArray()
  {
    ArrayList<Integer> solution = new ArrayList<Integer>();
    for (int i = 1; i <= 255; i = i + 2)
    {
      solution.add(i);
    }
    Object[] myArr = solution.toArray();
    return myArr;
  }

  public int GreaterThanY(int[] arr, int y)
  {
    int count = 0;
    for (int n : arr)
    {
      if (n > y) count++;
    }
    return count;
  }

  public int[] SquareArrayVals(int[] arr)
  {
    for (int i = 0; i < arr.length; i++)
    {
      arr[i] = arr[i] * arr[i];
    }
    return arr;
  }

  public int[] EliminateNegativeVals(int[] arr)
  {
    for (int i = 0; i < arr.length; i++)
    {
      if (arr[i] < 0) arr[i] = 0;
    }
    return arr;
  }

  public Object[] MaxMinAverage(int[] arr)
  {
    int sum = 0;
    int max = arr[0];
    int min = arr[0];
    for (int n : arr)
    {
      if (n > max) max = n;
      if (n < min) min = n;
      sum += n;
    }
    float average = (float)sum / arr.length;
    Object[] info = new Object[] {max, min, average};
    return info;
  }

  public int[] ShiftArrayVals(int[] arr)
  {
    for (int i = 0; i < arr.length - 1; i++)
    {
      arr[i] = arr[i+1];
    }
    arr[arr.length-1] = 0;
    return arr;
  }
}