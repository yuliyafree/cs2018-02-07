package by.it.lipatava.lesson04;

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
        int d= sc.nextInt();
        int m=sc.nextInt();
        int sum;
        switch (m){
            case 1:
                sum=d;
                System.out.println(sum);
                break;
            case 2:
                sum=d+31;
                System.out.println(sum);
                break;
             case 3:
                sum=d+59;
                System.out.println(sum);
                 break;
            case 4:
                sum=d+90;
                System.out.println(sum);
                break;
            case 5:
                sum=d+120;
                System.out.println(sum);
                break;
            case 6:
                sum=d+151;
                System.out.println(sum);
                break;
            case 7:
                sum=d+181;
                System.out.println(sum);
                break;
            case 8:
                sum=d+212;
                System.out.println(sum);
                break;
            case 9:
                sum=d+243;
                System.out.println(sum);
                break;
            case 10:
                sum=d+273;
                System.out.println(sum);
                break;
            case 11:
                sum=d+304;
                System.out.println(sum);
                break;
            case 12:
                sum=d+334;
                System.out.println(sum);
                break;


        }
    }
}
