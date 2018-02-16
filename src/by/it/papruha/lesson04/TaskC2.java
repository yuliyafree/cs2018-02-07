package by.it.papruha.lesson04;

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
        int num = 0;
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        int month = sc.nextInt();
        switch (month) {
            case 1:
                num = day;
                System.out.println(num);
                break;
            case 2:
                num = 31 + day;
                System.out.println(num);
                break;
            case 3:
                num = 31 + 28 + day;
                System.out.println(num);
                break;
            case 4:
                num = 31 + 28 + 31 + day;
                System.out.println(num);
                break;
            case 5:
                num = 31 + 28 + 31 + 30 + day;
                System.out.println(num);
                break;
            case 6:
                num = 31 + 28 + 31 + 30 + 31 + day;
                System.out.println(num);
                break;
            case 7:
                num = 31 + 28 + 31 + 30 + 31 + 30 + day;
                System.out.println(num);
                break;
            case 8:
                num = 31 + 28 + 31 + 30 + 31 + 30 + 31 + day;
                System.out.println(num);
                break;
            case 9:
                num = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + day;
                System.out.println(num);
                break;
            case 10:
                num = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + day;
                System.out.println(num);
                break;
            case 11:
                num = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + day;
                System.out.println(num);
                break;
            case 12:
                num = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + day;
                System.out.println(num);
                break;
            default:
                break;
        }
    }
}
