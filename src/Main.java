public class Main {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println();
        for (; i>0; i--) {
            System.out.print(i + " ");
        }
    }
}