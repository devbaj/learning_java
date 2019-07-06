public class BasicTesting
{
  public static void main(String[] args)
  {
    Basic base = new Basic();

    System.out.println("Print 1 - 255");
    base.Print1To255();

    System.out.println("Print Odds 1 - 255");
    base.PrintOdds();

    System.out.println("Print sums 0-255");
    base.PrintSums1To255();

    System.out.println("Print array values");
    int[] myArr = new int[] {1,3,5,7,9,13};
    base.PrintArrayVals(myArr);

    System.out.println("Print max of array");
    base.PrintArrayMax(myArr);

    System.out.println("Print array average");
    base.PrintArrayAverage(myArr);

    System.out.println("Create array with odds");
    Object[] newArray = base.CreateOddArray();
    for (Object n : newArray)
    {
      System.out.println(n);
    }

    System.out.println("Return number of vals greater than y");
    System.out.println(base.GreaterThanY(myArr, 7));

    System.out.println("square array vals");
    int[] squaredArr = base.SquareArrayVals(myArr);
    for (int n : squaredArr)
    {
      System.out.println(n);
    }

    System.out.println("Eliminate negatives from array");
    int[] arrayWithNegatives = new int[] {-5, 5, 10, -10, 2, -8};
    int[] positiveArray = base.EliminateNegativeVals(arrayWithNegatives);
    for (int n : positiveArray)
    {
      System.out.println(n);
    }

    System.out.println("get max min and average");
    Object[] infoArray = base.MaxMinAverage(myArr);
    for (Object n : infoArray)
    {
      System.out.println(n);
    }

    System.out.println("shift array values");
    int[] shiftedArray = base.ShiftArrayVals(myArr);
    for (int n : shiftedArray)
    {
      System.out.println(n);
    }
  }
}