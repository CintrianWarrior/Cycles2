public class Main {
    public static void main(String[] args) {
      int friday = 2;
        System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет.");
       for (int i=1; i<30; i++){
           if (i%7==2) {
               friday=friday+7;
               System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет.");
           }
      }
    }
}