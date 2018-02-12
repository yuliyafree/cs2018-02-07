package by.it.kovalev.lesson02;

import java.util.Scanner;

/* Нужно написать программу, которая вводит два числа с клавиатуры
и выводит их сумму на экран в виде

Ввод:
34 26

Вывод:
Sum = 26
*/
class TaskC1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int i1 = sc.nextInt();
        System.out.println("Ввод:");
        System.out.println( i + " " + i1);
        int result=(i+i1);
        System.out.println("Вывод:");
        System.out.print("Sum = ");
        System.out.println(result);

    }





}
