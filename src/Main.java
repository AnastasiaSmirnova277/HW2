public class Main {
    public static void main(String[] args) {

        int initialAccount = 200; //начальный счет
        int amoutDeposit = 2000; //сумма пополнения
        int finalAccount = (initialAccount + amoutDeposit); // итоговый счет
        int thresHold = 1000; // порог для расчета бонусов
        int amount = 100; // кол-во рублей на 1 бонусный руб
        int bonus = (amoutDeposit / amount);

        if (amoutDeposit > thresHold) {
            bonus = (amoutDeposit / amount);
        } else {
            bonus = 0;
        }
        System.out.println("Итоговый счет" + finalAccount);
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