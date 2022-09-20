public class Main {
    public static void main(String[] args) {
        int monthlyDeposit = 15000;
        int totalDeposit = 0;
        int i = 0;
        while (totalDeposit<=2459000) {
            i++;
            totalDeposit = totalDeposit + totalDeposit/100;
            totalDeposit = totalDeposit + monthlyDeposit;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + totalDeposit + " рублей");
        }
        System.out.println(i + " месяцев необходимо для накопления суммы");
    }
}