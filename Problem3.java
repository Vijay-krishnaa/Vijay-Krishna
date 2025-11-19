public class Problem3 {
  public static void generateSeries(int a) {

    int count = (a % 2 == 0) ? a - 1 : a;

    for (int i = 1; i <= count * 2; i += 2) {
      System.out.print(i);
      if (i < count * 2 - 1)
        System.out.print(", ");
    }

    System.out.println();
  }

  public static void main(String[] args) {
    int[] testCases = { 1, 2, 3, 4, 5, 6 };

    for (int a : testCases) {
      System.out.print("input a = " + a + ", output: ");
      generateSeries(a);
    }
  }
}
