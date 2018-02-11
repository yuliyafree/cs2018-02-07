package by.it.Tsykala._tasks_.lesson02;

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
        byte i = sc.nextByte();
        byte j = sc.nextByte();
        String binary = Integer.toBinaryString(i);
        if (binary.length() > 8) binary = binary.substring(binary.length() - 8);
        binary = String.format("%8s", binary).replace(" ", "0");
        System.out.printf("%8s %4d %n", binary, i);



}
