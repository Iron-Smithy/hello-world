public class Main {
  public static void main(String[] args) {
    System.out.println("Hello-World!");
   	int numb = 5;
    for (int i = 0; i < 423; i++) {
      System.out.println(i-((Math.floor(i/numb))*numb));
    }
  }
}
