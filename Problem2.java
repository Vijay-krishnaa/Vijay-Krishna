import java.util.*;

public class Problem2 {
  public static void generateSeries(int a) {
    for (int i = 0; i < a; i++) {
      System.out.print((2 * i + 1));
      if (i < a - 1)
        System.out.print(", ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    int[] testCases = { 1, 2, 3, 4, 5 };

    for (int a : testCases) {
      System.out.print("input a = " + a + ", output: ");
      generateSeries(a);
    }
  }
}