package by.it.astapovich.lesson02;

import java.net.SocketPermission;
import java.util.Scanner;

import static java.lang.System.in;

/* Нужно написать программу, которая вводит два числа с клавиатуры
и выводит их сумму на экран в виде

Ввод:
34 26

Вывод:
Sum = 26
*/
class TaskC1 {
    public static void main(String[] args) {
        System.out.println("Ввод:");
        Scanner sc = new Scanner(in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a+b;
        System.out.println("Вывод:");
        System.out.println("Sum" + " " + "=" + " " + c );

    }




}
