public class Main {
    public static void main(String[] args) {
        int initialBalance = 100;
        int refill = 1200;

        int bonus = 0;
        if (refill > 1000) {
            bonus = refill / 100;
        }

        int finalBalance = initialBalance + refill + bonus;
        System.out.println("Бонус: " + bonus);
        System.out.println("Итоговый баланс: " + finalBalance);
    }
}