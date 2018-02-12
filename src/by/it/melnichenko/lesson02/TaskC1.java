package by.it.melnichenko.lesson02;

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
        Scanner scanner = new Scanner(System.in);
        int i=scanner.nextInt();
        int j=scanner.nextInt();
        int result=i-i+j;
        System.out.println("Ввод:");
        System.out.println(i+" "+j);

        System.out.println("Вывод :");
        System.out.println("Sum = "+result);
    }
}
