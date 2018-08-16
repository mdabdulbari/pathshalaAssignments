import java.util.*;

public class PrimeFactors {

  List<Integer> generate(int n){
    List<Integer> factors = new ArrayList<>();
    for(int i = 2; i < n; i++){
      if (i == 2 && i % 2 == 0){
        factors.add(2);
      } else if (i == 3 && i % 3 == 0) {
        factors.add(3);
      } else if (i == 5 && i % 5 == 0){
        factors.add(5);
      } else if (n % i == 0 && i % 2 != 0 && i % 3 != 0 && i % 5 != 0){
        factors.add(i);
      } 
    }return factors;

  }

  public static void main(String[] args) {
    System.out.print("Please enter a nunber: ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    PrimeFactors primeFactors = new PrimeFactors();
    System.out.println(primeFactors.generate(n));
  }
}
