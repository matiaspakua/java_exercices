import java.util.Arrays;

public class ArraysMethods {

  public static void main(String[] args) {

    String[] params = new String[] { "one", "two" };
    arrayToUpperCase(params);

    int[] intParams = new int[] { 1, 2, 3 };
    incrementArray(intParams);
  }

  public static void arrayToUpperCase(String[] input) {
    for (int i = 0; i < input.length; i++) {
      input[i] = input[i].toUpperCase();
    }
    Arrays.stream(input).forEach(System.out::println);
  }

  public static void incrementArray(int[] input) {
    for (int i = 0; i < input.length; i++) {
      input[i] = input[i] - 1;
    }    
    Arrays.stream(input).forEach(System.out::println);
  }

}