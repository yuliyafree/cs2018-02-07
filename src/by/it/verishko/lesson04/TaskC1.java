package by.it.verishko.lesson04;

/*
Напишите программу которая спрашивает у пользователя:
Какую вы хотите зарплату в $$$?

После ввода суммы, программа анализирует полученное значение
и если введенная цифра меньше 300 или больше 3000 программа выводит на экран:
Мы вам перезвоним!

Иначе выводит в цикле по переменной int month от 0 до 14 рассчитанную зарплату.
В летние месяцы - выводится введенная сумма с названием месяца.
В несуществующие месяцы 0, 13 и 14 выводится сумма в $0.0
в остальные месяцы выводится указанная сумма с премией в 50%.

Сделайте так, чтобы в тот месяц, когда получилась зарплата в $666 цикл после вывода прерывался.

Пример работы программы (у вас должно быть так же, до символа):

Какую вы хотите зарплату в $$$?
2000
За месяц 0 начислено $0.0
За январь начислено $3000.0
За февраль начислено $3000.0
За март начислено $3000.0
За апрель начислено $3000.0
За май начислено $3000.0
За июнь начислено $2000.0
За июль начислено $2000.0
За август начислено $2000.0
За сентябрь начислено $3000.0
За октябрь начислено $3000.0
За ноябрь начислено $3000.0
За декабрь начислено $3000.0
За месяц 13 начислено $0.0
За месяц 14 начислено $0.0

*/

import java.util.Scanner;

public class TaskC1 {
    public static void main(String[] args) {
        System.out.println("Какую вы хотите зарплату в $$$?");
        Scanner sc = new Scanner(System.in);
        double money = sc.nextInt();
        double month = -1;
        if (money < 300 || money > 3000)
            System.out.println("Мы вам перезвоним!");
        if (money > 300 && money < 3000) {
            do {
                month += 1;
                double y = money + 0.5 * money;
                if (month == 0) {
                    System.out.println("За месяц 0 начислено $0.0");
//                    if (money == 666) break;
                }
                if (month == 1) {
                    System.out.println("За январь начислено $" + y);
//                    if (money == 666) break;
                }
                if (month == 2) {
                    System.out.println("За февраль начислено $" + y);
                    if (y == 666) break;
                }
                if (month == 3) {
                    System.out.println("За март начислено $" + y);
                    if (y == 666) break;
                }
                if (month == 4) {
                    System.out.println("За апрель начислено $" + y);
                    if (y == 666) break;
                }
                if (month == 5) {
                    System.out.println("За май начислено $" + y);
                    if (y == 666) break;
                }
                if (month == 6) {
                    System.out.println("За июнь начислено $" + money);
                    if (money == 666 || y == 666) break;
                }
                if (month == 7) {
                    System.out.println("За июль начислено $" + money);
                    if (money == 666 || y == 666) break;
                }
                if (month == 8) {
                    System.out.println("За август начислено $" + money);
                    if (money == 666 || y == 666) break;
                }
                if (month == 9) {
                    System.out.println("За сентябрь начислено $" + y);
                    if (money == 666 || y == 666) break;
                }
                if (month == 10) {
                    System.out.println("За октябрь начислено $" + y);
                    if (money == 666 || y == 666) break;
                }
                if (month == 11) {
                    System.out.println("За ноябрь начислено $" + y);
                    if (money == 666 || y == 666) break;
                }
                if (month == 12) {
                    System.out.println("За декабрь начислено $" + y);
                    if (money == 666 || y == 666) break;
                }
                if (month == 13) {
                    System.out.println("За месяц 13 начислено $0.0");
                    if (money == 666 || y == 666) break;
                }
                if (month == 14) {
                    System.out.println("За месяц 14 начислено $0.0");
                    if (money == 666 || y == 666) break;
                }
            } while (month < 15);
        }
    }
}