/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package sequality;

public class App {
  public String getGreeting() {
    return "Hello World!";
  }

  public static void main(String[] args) {
    System.out.println(new App().getGreeting());

    System.out.println(new Calculate().printSum(2, 3)
        + " " + new Calculate().printAve(2, 3));

    System.out.println(new Calculate().printSumOfSeq(1, 10)
        + new Calculate().printAve(1, 10));

    System.out.println(new Calculate().printSumOfOdd(1, 10)
        + new Calculate().printSumOfEven(1, 10));
  }
}
