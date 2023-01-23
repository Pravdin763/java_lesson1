public class lesson1_2

/* 
    8. Написать метод, который определяет является ли год високосным, и выводит сообщение в консоль.
    Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.*/
{
    private static boolean isLeapYearBool(int x) {
        return x % 4 == 0 && x % 100 != 0 || x % 400 == 0;
    }

        int x1 = 2016;
        System.out.printf("Задан %d год. Он %s является високосным.\n", x1, (isLeapYearBool(x1)) ? "\b" : "не");
        int x2 = 2018;
        System.out.printf("Задан %d год. Он %s является високосным.\n", x2, (isLeapYearBool(x2)) ? "\b" : "не");
    }
}