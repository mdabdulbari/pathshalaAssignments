import java.util.*;

public class RightTriangle {
  public void printAsterisk() {
    System.out.print("*");
  }

  public void drawRightTriangle (int n) {
    for(int j = n - 1; j >= 0; j--){
      for(int i = 0; i < n - j; i++) {
        printAsterisk();
      }
      System.out.println("");
    }
  }
  public static void main(String[] args) {
    System.out.print("Please enter a number: ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    RightTriangle rightTriangle = new RightTriangle();
    rightTriangle.drawRightTriangle(n);
  }
}
