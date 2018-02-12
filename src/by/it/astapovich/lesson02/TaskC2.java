package by.it.astapovich.lesson02;

import java.io.PrintStream;
import java.util.Scanner;

import static java.lang.System.in;

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
        System.out.println("Ввод:");
        Scanner sc = new Scanner(in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a+b;
        System.out.println("DEC:" + a +"+" + b  + "=" + c );

            String a1 = Integer.toBinaryString(a);
            String b1 = Integer.toBinaryString(b);
            String c1 = Integer.toBinaryString(c);
            System.out.println("BIN:" + a1 + "+" + b1  + "=" + c1);

        String a2 = Integer.toHexString(a);
        String b2 = Integer.toHexString(b);
        String c2 = Integer.toHexString(c);
        System.out.println("HEX:" + a2 + "+" + b2  + "=" + c2);

        String a3 = Integer.toOctalString(a);
        String b3 = Integer.toOctalString(b);
        String c3 = Integer.toOctalString(c);
        System.out.println("OCT:" + a3 + "+" + b3  + "=" + c3);





    }



    }
