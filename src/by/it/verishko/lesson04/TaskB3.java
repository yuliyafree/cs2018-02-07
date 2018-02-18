package by.it.verishko.lesson04;
/*
С клавиатуры вводится некоторое число.
Пусть считается сумма int sum=1+2+3+4+5+... и т.д.
Каждая цифра суммы выводится в консоль через запятую (без пробела).
Остановите вывод до того, как сумма превысит введенное число.

Например:
Ввод:
122
Вывод:
1,3,6,10,15,21,28,36,45,55,66,78,91,105,120,

Ввод:
15
Вывод:
1,3,6,10,15,

Ввод:
14
Вывод:
1,3,6,10,


 */


import java.util.Scanner;

public class TaskB3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int sum = 0;
        int x;
        for (x = 1; sum < i; x++) {
            sum = sum + x;
            if (sum > i)
                break;
            System.out.print(sum + ",");
        }

    }

}

//        do {
//            x++;
//            sum = sum + x;
//            System.out.print("," + sum);
//        } while (sum < i);
//    }
//}


//        while (sum < i) {
//            sum = sum + x;
//            x++;
//            System.out.print("," + sum);
//        }
//    }
//}