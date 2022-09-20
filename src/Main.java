public class Main {
    public static void main(String[] args) {
      int population = 12_000_000;
      double birthRate = (double) 17/1000;
      double deathRate = (double) 8/1000;
      for (int i = 1; i<=10; i++) {
          population = (int) (population + (population*birthRate) - (population*deathRate));
          System.out.println("Год " + i + ", численность населения составляет " + population);
      }
    }
}