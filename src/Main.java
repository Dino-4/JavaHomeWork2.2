public class Main {
    public static void main(String[] args) {
        int balanceUpTo = 352;
        int accrued = 2200;
        int bonus = accrued / 100;
        int balance = balanceUpTo + accrued + bonus;

        System.out.println("Средств на счете: " + balance + " рубля(ей).");
    }
}