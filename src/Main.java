public class Main {
    public static void main(String[] args) {
        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        int currentAmountKopecks = 100_00;
        int transferKopecks = 1550_50;
        int bonusRubles = 0;

        // Условным оператором проверяете превысила ли
        // сумма пополнения порог и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.

        if (transferKopecks > 1000_00) {
            bonusRubles = transferKopecks / 100 / 100;
        }
        double totalAmount = (double) currentAmountKopecks / 100 + (double) transferKopecks / 100 + bonusRubles;
        System.out.println("Вам начислен бонус: " + bonusRubles + " руб.");
        System.out.println("На Вашем счету: " + totalAmount + " руб.");


    }
}
