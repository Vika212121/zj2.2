public class Main {
    public static void main(String[] args) {
        int initialBalance = 100;
        int replenishment = 5000;
        int bonus;

        if (replenishment > 1000) {
            bonus = replenishment / 100;

        } else {
            bonus = 0;
        }

        int balance = initialBalance + replenishment + bonus;
        System.out.println("Баланс: " + balance + "  Бонус: " + bonus +"");
    }

    }