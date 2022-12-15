import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        System.out.println("Задача №1");
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
    }
    public static void task2() {
        System.out.println("Задача №2");
        int[] arr = generateRandomArray();
        int maxSpend = 0;
        int minSpend = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>maxSpend) {
                maxSpend = arr[i];
            }
            if (arr[i] < minSpend) {
                minSpend = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minSpend+ " рублей");
        System.out.println("Максимальная сумма трат за день составила " + maxSpend+ " рублей");

    }
    public static void task3() {
        System.out.println("Задача №3");

        int[] arr = generateRandomArray();
        double sum = 0;
        double average = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        average = sum / arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей");
    }
    public static void task4() {
        System.out.println("Задача №4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >=0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}
