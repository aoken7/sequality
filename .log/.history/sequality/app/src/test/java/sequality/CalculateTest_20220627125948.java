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
    int expected
  }
}
