public class Main {
    public static void main(String[] args) {
        int balanc_up_to = 352;
        int accrued = 2200;
        int bonus = accrued / 100;
        int balance = balanc_up_to + accrued + bonus;

        System.out.println("Средств на счете: " + balance + " рубля(ей).");
    }
}