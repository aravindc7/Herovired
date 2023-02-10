import java.util.Arrays;

public class Uniqueee {
  public static void main(String[] args) {
    int[] arr = {1, 2, 4, 5, 6, 7, 8};
    int n = arr.length;
    int expectedSum = (n + 1) * (arr[0] + arr[n - 1]) / 2;
    int actualSum = Arrays.stream(arr).sum();
    int missingNumber = expectedSum - actualSum;

    System.out.println("Missing number(s): ");
    for (int i = arr[0]; i < arr[n - 1]; i++) {
      if (Arrays.binarySearch(arr, i) < 0) {
        System.out.println(i);
      }
    }
  }
}
