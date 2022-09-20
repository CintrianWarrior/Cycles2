public class Main {
    public static void main(String[] args) {
      int monthlyDeposit = 15000;
      int totalDeposit = 0;
      for (int month = 1; totalDeposit<12_000_000; month++){
          monthlyDeposit = (monthlyDeposit + monthlyDeposit*7/100);
          totalDeposit = (totalDeposit + monthlyDeposit);
          System.out.println("Месяц " + month + ", сумма накоплений равна " + totalDeposit + " рублей");
      }
    }
}