public class NumberBig {
  public static void main(String[] args) {
    int result = sum(1_742_609);
    System.out.println(result);
  }
  public static int sum(int k) {
    if (k > 0) {
      return k + sum(k - 1);
    } else {
      return 0;
    }
  }
}
