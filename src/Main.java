public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
    }

    public static void task1() {
        System.out.println("Задача 1");
        for (byte i = 1; i <= 10; i++)
            System.out.println(i);
    }

    public static void task2() {
        System.out.println("Задача 2");
        for (byte i = 10; i >= 1; i--)
            System.out.println(i);
    }

    public static void task3() {
        System.out.println("Задача 3"); // прибавить 2 к нулю ???
        for (byte i = 0; i <= 17; i++) {
            if (i % 2 == 0)
                System.out.println(i);
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        for (byte i = 10; i >= -10; i--)
            System.out.println(i);

    }

    public static void task5() {
        System.out.println("Задача 5");
        for (short i = 1904; i <= 2096; i += 4)
            System.out.println(i + " год является високосным");

    }

    public static void task6() {
        System.out.println("Задача 6");
        for (byte i = 7; i <= 98; i += 7)
            System.out.println(i);

    }

    public static void task7() {
        System.out.println("Задача 7");
        short j = 1;
        for (byte i = 1; i <= 10; i++) {
            System.out.println(j);
            j *= 2;
        }
    }

    public static void task8() {
        System.out.println("Задача 8");
        short refill = 29000;
        int deposit = 0;
        for (byte i = 1; i <= 12; i++) {
            deposit += refill;
            System.out.printf("Месяц %d, сумма накоплений равна %d рублей %n", i, deposit);

        }
    }

    public static void task9() {
        System.out.println("Задача 9");
        short refill = 29000;
        int deposit = 0;
        for (byte i = 1; i <= 12; i++) {
            deposit += refill + refill / 100;
            System.out.printf("Месяц %d, сумма накоплений равна %d рублей %n", i, deposit);

        }
    }
    public static void task10 () {
        System.out.println("Задача 10");

        for (byte i = 1; i <= 10; i++){
            byte j = 2;
            j *= i;
            System.out.println(j);
        }
    }
}
