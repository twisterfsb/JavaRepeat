import java.util.Arrays;

public class Homework2 {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {
        System.out.println("\n========================");
        System.out.println("\nЗадание 1");
        int[] arr = {1, 1, 1, 0, 0, 0, 1, 1, 1, 0};
        System.out.println(Arrays.toString(arr));

        for (int j = 0; j < arr.length; j++) {
            //if (arr[j] == 1)
            //    arr[j] = 0;
            // else arr [j] = 1;
            arr[j] = (arr[j] == 1) ? 0 : 1; // заменим if else условным оператором ?:
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void task2() {
        System.out.println("\n========================");
        System.out.println("\nЗадание 2");
        int[] arr = new int[8];
        for (int i = 1, j = 0; i < arr.length; i++) {
            arr[i] = j += 3;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void task3() {
        System.out.println("\n========================");
        System.out.println("\nЗадание 3");
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6)
                arr[i] *= 2;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void task4() {
        System.out.println("\n========================");
        System.out.println("\nЗадание 4");
        int[][] arr = new int[10][10];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0, j2 = arr[i].length; j < arr[i].length; j++, j2--) {
                if (i == j || i == (j2 - 1)) arr[i][j] = 7;
                System.out.print(arr[i][j] + "|");
            }
            System.out.println();
        }
    }

    public static void task5() {
        System.out.println("\n========================");
        System.out.println("\nЗадание 5");
        int[] arr = {14, 23, 1, -5, 36, 2, 0, 8};
        int min = arr[0], max = arr[0], indexMax = 0, indexMin = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                indexMax = i;
            }
            if (arr[i] < min) {
                min = arr[i];
                indexMin = i;
            }
        }
        System.out.println("Max в индексе " + indexMax + " со значением  = " + max);
        System.out.println("Min в индексе " + indexMin + " со значением  = " + min);
    }
}
