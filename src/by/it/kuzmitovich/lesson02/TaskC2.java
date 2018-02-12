package by.it.kuzmitovich.lesson02;

import java.text.DecimalFormat;
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
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int sum = a + b;
        String c = "DEC";
        System.out.println(c + ":" + a + "+" + b + "=" + sum);

        String d = "BIN";
        String e = Integer.toBinaryString(a);
        String f = Integer.toBinaryString(b);
        String k = Integer.toBinaryString(sum);
        System.out.println(d + ":" + e + "+" + f + "=" + k);

        String z = "HEX";
        String v = Integer.toHexString(a);
        String q = Integer.toHexString(b);
        String w = Integer.toHexString(sum);
        System.out.println(z + ":" + v + "+" + q + "=" + w);

        String j = "OCT";
        String l = Integer.toOctalString(a);
        String m = Integer.toOctalString(b);
        String p = Integer.toOctalString(sum);
        System.out.println(j + ":" + l + "+" + m + "=" + p);

    }
}