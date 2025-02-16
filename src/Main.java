public class Main {
    public static void main(String[] args) {

        int initialaccount = 200; //начальный счет
        int amoutdeposit = 2000; //сумма пополнения
        int finalaccount = (initialaccount + amoutdeposit); // итоговый счет
        int threshold = 1000; // порог для расчета бонусов
        int amount = 100; // кол-во рублей на 1 бонусный руб
        int bonus = (amoutdeposit / amount);

        if (amoutdeposit > threshold) {
            bonus = (amoutdeposit / amount);
        } else {
            bonus = 0;
        }
        System.out.println("Итоговый счет" + finalaccount);
        System.out.println("Кол-во бонусных рублей" + bonus);


        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        // Условным оператором проверяете, превысила ли
        // сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
    }
}