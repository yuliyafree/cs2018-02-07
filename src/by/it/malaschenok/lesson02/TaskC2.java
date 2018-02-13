package by.it.malaschenok.lesson02;

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
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = a + b;
        System.out.println("DEC:" + a + "+" + b + "=" + result);
        String c = Integer.toBinaryString(a);
        String d = Integer.toBinaryString(b);
        String f = Integer.toBinaryString(result);
        System.out.println("BIN:" + c + "+" + d + "=" + f);
        String e = Integer.toHexString(a);
        String h = Integer.toHexString(b);
        String g = Integer.toHexString(result);
        System.out.println("HEX:" + e + "+" + h + "=" + g);
        String j = Integer.toOctalString(a);
        String k = Integer.toOctalString(b);
        String l = Integer.toOctalString(result);
        System.out.println("OCT:" + j + "+" + k + "=" + l);
    }
}
