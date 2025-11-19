import java.util.*;

public class Problem4 {

  public static Map<Integer, Integer> countMultiples(int[] numbers) {
    Map<Integer, Integer> result = new HashMap<>();

    for (int d = 1; d <= 9; d++) {
      int count = 0;

      for (int n : numbers) {
        if (n % d == 0)
          count++;
      }

      result.put(d, count);
    }

    return result;
  }

  public static void main(String[] args) {
    int[] input = { 1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30 };

    Map<Integer, Integer> output = countMultiples(input);

    System.out.print("{");
    for (int d = 1; d <= 9; d++) {
      System.out.print(d + ": " + output.get(d));
      if (d < 9)
        System.out.print(", ");
    }
    System.out.println("}");
  }
}
