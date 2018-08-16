import java.util.*;

public class HorizontalLine {
  public void printAsterisk() {
    System.out.print("*");
  }

  public void drawHorizontalLine (int n) {
    for(int i = 0; i < n; i++) {
      printAsterisk();
    }
  }
  public static void main(String[] args) {
    System.out.print("Please enter a number: ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    HorizontalLine hline = new HorizontalLine();
    hline.drawHorizontalLine(n);
    System.out.println();
  }
}
