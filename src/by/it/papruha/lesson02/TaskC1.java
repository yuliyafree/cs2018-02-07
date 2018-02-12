package by.it.papruha.lesson02;

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
        System.out.println("Ввод:");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int sum = num1+num2;
        System.out.println("");
        System.out.println("Вывод:");
        System.out.println("Sum"+" = "+sum);
    }




}
