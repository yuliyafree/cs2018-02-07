package by.it.verishko.lesson02;

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
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int sum = a + b;
        String bin = Integer.toBinaryString(sum);
        String hex = Integer.toHexString(sum);
        String oct = Integer.toOctalString(sum);
        System.out.println("DEC:34+26="+sum);
        System.out.println("BIN:100010+11010="+bin);
        System.out.println("HEX:22+1a="+hex);
        System.out.println("OCT:42+32="+oct);
//        System.out.println(sum, bin, hex, oct);
//        System.out.println(sum, Integer.toBinaryString(sum),
//                                Integer.toHexString(sum),
//                                Integer.toOctalString(sum));
    }
}