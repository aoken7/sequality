package sequality;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculateTest {
  @Test
  public void testSum() {
    Calculate calculate = new Calculate();
    int expected = 5;
    assertEquals(expected, calculate.sum(2, 3));
  }

  @Test
  public void testSumOfSeq() {
    Calculate calculate = new Calculate();
    int expected = 15;
    assertEquals(expected, calculate.sumOfSeq(1, 5));
  }

  @Test
  public void testSumOfOdd() {
    Calculate calculate = new Calculate();
    int expected = 15;
    assertEquals(expected, calculate.sumOfOdd(2, 7));
  }

  @Test
  public void testSumOfEven() {
    Calculate calculate = new Calculate();
    int expected = 20;
    assertEquals(expected, calculate.sumOfEven(2, 9));
  }

  @Test
  public void testAverage() {
    Calculate calculate = new Calculate();
    double expected = 3.0;
    assertEquals(expected, calculate.average(2, 4), 0);
  }
}
