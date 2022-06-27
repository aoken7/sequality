package sequality;

public class Calculate {
  public int sum(int x, int y) {
    return x + y;
  }

  public int sumOfSeq(int s, int e) {
    int sum = 0;
    for (int i = s; i <= e; i++) {
      sum += i;
    }
    return sum;
  }

  public int sumOfOdd(int s, int e) {
    int sum = 0;
    for (int i = s; i <= e; i++) {
      sum += i;
    }
  }

  public double average(int x, int y) {
    return sum(x, y) / 2.0;
  }

  public String printSum(int x, int y) {
    return "Sum of " + x + " and " + y + " is "
        + new Calculate().sum(x, y) + ".";
  }

  public String printAve(int x, int y) {
    return "Average is " + new Calculate().average(x, y) + ".";
  }

  public String printSumOfSeq(int s, int e) {
    return "Sum of " + s + " to " + e + " is " + sumOfSeq(s, e) + ".";
  }

}
