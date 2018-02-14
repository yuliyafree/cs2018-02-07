package by.it.lapytko.lesson03;

import java.util.Scanner;

/*
Lesson 04. Task B2. Нужно написать программу, которая вводит три числа  a b c типа int с клавиатуры
и вычисляет корни квадратного уравнения a*a*x + b*x + c = 0:
1) Если два корня, то выводится два корня через пробел.
2) Если один корень, то выводится только одно число - корень.
3) Если нет действительных корней, то выводится сообщение об ошибке "Отрицательный дискриминант"

В программе должен быть определен статический метод dis вычисления дискриминанта,
который принимает на входе три числа типа int a,b,c
а на выходе возвращает число типа double

Примеры работы

Ввод:
2 5 3
Вывод:
-1.0 -1.5

Ввод:
2 4 2
Вывод:
-1.0

Ввод:
2 2 2
Вывод:
Отрицательный дискриминант

*/
class TaskB2 {
    public static double dis(int a, int b, int c) {
        double dis = b * b - 4 * a * c;
        return dis;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int j = sc.nextInt();
        int k = sc.nextInt();
        double x1, x2;
        double dis = (j * j) - (4 * i * k);
        if (dis > 0) {
            x1 = (-j + Math.sqrt(dis)) / (2 * i);
            x2 = (-j - Math.sqrt(dis)) / (2 * i);
            System.out.println(x1+" "+x2);
        }
        if (dis == 0) {
            x1 = (-j) / (2 * i);
            System.out.println(x1);
        }
        if (dis < 0) {
            System.out.println("Отрицательный дискриминант");
        }
    }
}
