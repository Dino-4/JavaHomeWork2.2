public class Main {
    public static void main(String[] args) {
        int balanceUpTo = 100; //Баланс до
        int accrued = 1100; //Сумма пополнения
        int bonus; //Начисленные бонусы

        if (accrued >= 1000) {
            bonus = accrued / 100;
        } else {
            bonus = 0;

        }

        int balance = balanceUpTo + accrued + bonus;

        System.out.println("Средств на счете: " + balance + " рубля(ей).");
        System.out.println("Начисленно бонусов: " + bonus);
    }
}