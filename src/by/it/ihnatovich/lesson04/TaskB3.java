package by.it.ihnatovich.lesson04;
/*
С клавиатуры вводится некоторое число.
Пусть считается сумма int sum=1+2+3+4+5+... и т.д.
Каждая цифра суммы выводится в консоль через запятую (без пробела).
Остановите вывод до того, как сумма превысит введенное число.

Например:
Ввод:
122
Вывод:
1,3,6,10,15,21,28,36,45,55,66,78,91,105,120,

Ввод:
15
Вывод:
1,3,6,10,15,

Ввод:
14
Вывод:
1,3,6,10,


 */


import java.util.Scanner;

public class TaskB3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n;
        int c;
        int sum;
        for (n = 0; n >= 0; n++) {
            int b = n + (n + 1);
            System.out.print(b + ",");
            n = (n++);
            for (n = 1; n > 0; n++) {
                c = b + (n + 1);
                System.out.print(c + ",");
                sum=c+n;
                /*do {
                    for (n = 2, c = b + (n + 1); n > 1; n++) {
                        sum = c + n;
                        c = c + (n + 1);
                        System.out.print(sum + ",");}
                } if (sum>x) break;*/

                }

            }

       }

     }



