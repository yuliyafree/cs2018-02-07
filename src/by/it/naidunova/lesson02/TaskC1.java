package by.it.naidunova.lesson02;

/* Нужно написать программу, которая вводит два числа с клавиатуры
и выводит их сумму на экран в виде

Ввод:
34 26

Вывод:
Sum = 26
*/

import java.util.Scanner;
class TaskC1 {
    public static void main(String[] args) {
        int a, b, c;
        Scanner in = new Scanner(System.in); //выделение памяти под переменную ввода in
        System.out.println("Введите число a ");
        a = in.nextInt(); //
        System.out.println("Введите число b ");
        b = in.nextInt();
        c = a + b;
        System.out.print("Sum = ");
        System.out.print(c);

    }





}
