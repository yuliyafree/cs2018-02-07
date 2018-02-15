package by.it.ihnatovich.lesson03;

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
    private static double dis (int a, int b, int c) {
        double dis = b * b - 4 * a * c;
        return dis;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int d=sc.nextInt();
        int e=sc.nextInt();
        int f=sc.nextInt();
        double res=dis(d, e, f);
        double x=-1*(e/(2*d));
        double x1=(-1*e+Math.sqrt(res))/(2*d);
        double x2=(-1*e-Math.sqrt(res))/(2*d);
        if (res<0)
            System.out.println("Отрицательный дискриминант");
        if (res==0)
            System.out.println(x);
        if (res>0)
            System.out.println(x1+" "+x2);
    }
}
