import java.util.*;

public class Diamond {
  public void printAsterisk() {
    System.out.print("*");
  }

  public void printLine(int spaces, int numberOfAsterisks) {
    for(int i = 0; i < spaces; i++){
      System.out.print(" ");
    }
    for(int j = 0; j < numberOfAsterisks; j++) {
      printAsterisk();
    }
    System.out.println("");
  }

  public void drawDiamond (int n) {
    for(int i = 0; i < n; i++){
      printLine(n - i - 1, 2 * (i) + 1);
    }
    for(int i = n - 2; i >= 0; i--){
      printLine(n - i - 1, 2 * (i) + 1);
    }
  }
  public static void main(String[] args) {
    System.out.print("Please enter a number: ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    Diamond diamond = new Diamond();
    diamond.drawDiamond(n);
  }
}
