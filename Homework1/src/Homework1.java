public class Homework1 {
    public static void main(String[] args) {
        //Task2
        doTask2();
        //Task3
        doTask3(15, 4, 22.2F, 4);
        //Task4
        doTask4(5, 15);
        //Task5
        doTask5(-5);
        //Task6
        doTask6(-5);
        //Task7
        doTask7("Кирилл");
        //Task8
        doTask8(2012);
    }

    static void doTask2() {
        System.out.println("===========\n"+"Задание 2\n");
        char c = 'A';
        byte b = 127;
        boolean bul = true;
        short s = 32767;
        int i = 2147483647;
        long l = 9223372036854775807L;
        float f = 73434.234F;
        double d = 230.345546D;
        System.out.println("Значение для типа char = " + c);
        System.out.println("Значение для типа byte = " + b);
        System.out.println("Значение для типа boolean = "+ bul);
        System.out.println("Значение для типа short = " + s);
        System.out.println("Значение для типа int = " + i);
        System.out.println("Значение для типа long = " + l);
        System.out.println("Значение для типа float = " + f);
        System.out.println("Значение для типа double = " + d);
    }
    static void doTask3(float a, float b, float c, float d) {
        System.out.println("===========\n"+"Задание 3\n");
        float exp = a * (b + (c / d));
        System.out.println("a * (b + (c / d)) = " + exp);

    }
    static boolean doTask4(int a, int b) {
        System.out.println("===========\n"+"Задание 4\n");
        int sum;
        sum = a + b;
        System.out.println(sum);
        return sum >= 10 && sum <= 20;
    }
    static String doTask5(int a) {
        System.out.println("===========\n"+"Задание 5\n");
        System.out.println(a);
        if (a >= 0)
            return "positive";
        else return "negative";
    }
    static boolean doTask6(int a) {
        System.out.println("===========\n"+"Задание 6\n");
        System.out.println("Число отрицательное? " + a);
        return a < 0;

    }
    static void doTask7(String name) {
        System.out.println("===========\n"+"Задание 7\n");
        System.out.println("Привет, " + name + "!");
    }
    static void doTask8(int year) {
        System.out.println("===========\n"+"Задание 8\n");
        boolean exp;
        exp = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
        System.out.println(exp);
    }
}
