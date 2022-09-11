public class Main {

    public static void main(String[] args) {
        int client = 100; // количество денег на счету клиента
        int x = 500;
        int amount = x; // рубли пополнения счета
        int percent = 1; // процент от общего числа пополнения

        if (x >= 1000) {
            int bonus = amount / 100 * percent;
            int total = client + amount + bonus;
            System.out.println((bonus) + " Бонусов за пополнение счета ");
            System.out.println((total) + " Всего рублей на счету ");
        } else {
            int total = client + amount;
            System.out.println((total) + " Всего рублей на счету ");


        }


    }
}
