import java.util.*;

public class VerticalLine {
  public void printAsterisk() {
    System.out.println("*");
  }

  public void drawVerticalLine (int n) {
    for(int i = 0; i < n; i++) {
      printAsterisk();
    }
  }
  public static void main(String[] args) {
    System.out.print("Please enter a number: ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    VerticalLine vline = new VerticalLine();
    vline.drawVerticalLine(n);
  }
}
