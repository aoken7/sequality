package sequality;

public class Calculate {
  public int sum(int x, int y) {
    return x + y;
  }

  public int sumOfSeq(int s, int e) {

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

}
