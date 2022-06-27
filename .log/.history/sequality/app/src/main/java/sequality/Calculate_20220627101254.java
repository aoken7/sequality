package sequality;

public class Calculate {
  public int sum(int x, int y) {
    return x + y;
  }

  public double average(int x, int y) {
    return sum(x, y) / 2.0;
  }

  public void printSum(int x, int y) {
System.out.println("Sum of 2 and 3 is " + new Calculate().sum(2, 3) + ".";
  }
}
