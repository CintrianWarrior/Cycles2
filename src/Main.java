public class Main {
    public static void main(String[] args) {
      double monthlyDeposit = 15000;
      double totalDeposit = 0;
      for (int month = 1; totalDeposit<12_000_000; month++){
          monthlyDeposit = (monthlyDeposit + monthlyDeposit*0.07);
          totalDeposit = (int) (totalDeposit + monthlyDeposit);
          if (month%6 ==0) {
              System.out.println("Месяц " + month + ", сумма накоплений равна " + totalDeposit + " рублей");
          }
      }
    }
}