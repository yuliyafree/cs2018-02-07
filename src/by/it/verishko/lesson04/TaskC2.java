package by.it.verishko.lesson04;

import java.text.SimpleDateFormat;
import java.util.Scanner;

/*
На входе вводится число и месяц 2017 года.
Программа должна выводить номер дня года, считая 1 января первым днем,
а 31 декабря 365-м.

Пример:
Ввод:
1 1

Вывод
1

Ввод:
31 12

Вывод
365

Ввод:
13 9

Вывод
256

 */
public class TaskC2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int y = sc.nextInt();
        double x = 0;
        if (y <= 1)
            x = i;
        if (y == 2)
            x = --y * 31 + i;
        if (y == 3)
            x = --y * 29.5 + i;
        if (y == 4)
            x = --y * 30 + i;
        if (y == 5)
            x = --y * 30.2 + i;
        if (y == 6)
            x = --y * 30.16 + i;
        if (y == 7)
            x = --y * 30.28 + i;
        if (y == 8)
            x = --y * 30.375 + i;
        if (y == 9)
            x = --y * 30.4 + i;
        if (y == 10)
            x = --y * 30.4 + i;
        if (y == 11)
            x = --y * 30.36 + i;
        if (y == 12)
            x = --y * 30.4 + i;

//        x = (int) (--y * 30.375 + i);
        System.out.println(x);
    }

}
