package by.it.kovalev.lesson02;

import java.math.BigInteger;
import java.util.Scanner;

/* Нужно написать программу, которая вводит два числа с клавиатуры
и 4 раза выводит их сумму с обозначением системы счисления на экран в
ДЕСЯТИЧНОМ ДВОИЧНОМ ШЕСТНАДЦАТИРИЧНОМ ВОСЬМИРИЧНОМ виде

Вот пример ввода с клавиатуры:
34 26

Тогда вывод ожидается такой:
DEC:34+26=60
BIN:100010+11010=111100
HEX:22+1a=3c
OCT:42+32=74
*/
class TaskC2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int i1 = sc.nextInt();
        int result = (i + i1);
        System.out.println("Вот пример ввода с клавиатуры:");
        System.out.println( i + " " + i1);
        System.out.println("Тогда вывод ожидается такой:");
        System.out.println("DEC:" + i + "+" + i1 + "=" + result);
        System.out.println("BIN:" + Integer.toBinaryString(i) + "+" + Integer.toBinaryString(i1) + "=" + Integer.toBinaryString(result));
        System.out.println("HEX:" + Integer.toHexString(i) + "+" + Integer.toHexString(i1) + "=" + Integer.toHexString(result));
        System.out.println("OCT:" + Integer.toOctalString(i) + "+" + Integer.toOctalString(i1) + "=" + Integer.toOctalString(result));

    }


}
