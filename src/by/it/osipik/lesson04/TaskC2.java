package by.it.osipik.lesson04;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
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
        Calendar cal = Calendar.getInstance();
        int a = sc.nextInt();
        int b = sc.nextInt();
        //int c = (Calendar.DAY_OF_YEAR);
        System.out.print(Calendar.DAY_OF_MONTH+" "+Calendar.MONTH );
        System.out.println(cal.get(Calendar.DAY_OF_YEAR));
    }}
