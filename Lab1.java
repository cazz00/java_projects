package lab1;

import java.util.Scanner;
import java.util.Random;

public class Lab1 {
    private static Scanner scanner = new Scanner(System.in);
    private static Random random = new Random();

    // Методы из ex1.java
    public static boolean isUpperCase(char x) {
        return x >= 'A' && x <= 'Z';
    }

    public static boolean isInRange(int a, int b, int num) {
        int min = Math.min(a, b);
        int max = Math.max(a, b);
        return num >= min && num <= max;
    }

    public static boolean isDivisor(int a, int b) {
        return (a != 0 && b % a == 0) || (b != 0 && a % b == 0);
    }

    public static boolean isEqual(int a, int b, int c) {
        return a == b && b == c;
    }

    public static int lastNumSum(int a, int b) {
        return (a % 10) + (b % 10);
    }

    // Методы из ex2.java
    public static boolean sum3(int x, int y, int z) {
        return x + y == z || x + z == y || y + z == x;
    }

    public static int sum2(int x, int y) {
        int sum = x + y;
        return (sum >= 10 && sum <= 19) ? 20 : sum;
    }

    public static String age(int x) {
        int lastDigit = x % 10;
        int lastTwoDigits = x % 100;

        if (lastTwoDigits >= 11 && lastTwoDigits <= 14) {
            return x + " лет";
        }

        switch (lastDigit) {
            case 1: return x + " год";
            case 2:
            case 3:
            case 4: return x + " года";
            default: return x + " лет";
        }
    }

    public static String day(int x) {
        switch (x) {
            case 1: return "понедельник";
            case 2: return "вторник";
            case 3: return "среда";
            case 4: return "четверг";
            case 5: return "пятница";
            case 6: return "суббота";
            case 7: return "воскресенье";
            default: return "это не день недели";
        }
    }

    public static void printDays(String x) {
        String day = x.toLowerCase();

        switch (day) {
            case "понедельник":
                System.out.println("понедельник");
            case "вторник":
                System.out.println("вторник");
            case "среда":
                System.out.println("среда");
            case "четверг":
                System.out.println("четверг");
            case "пятница":
                System.out.println("пятница");
            case "суббота":
            case "6":
                System.out.println("суббота");
            case "воскресенье":
                System.out.println("воскресенье");
                break;
            default:
                System.out.println("это не день недели");
        }
    }

    // Методы из ex3.java
    public static boolean equalNum(int x) {
        if (x < 0) {
            x = -x;
        }
        if (x < 10) {
            return true;
        }

        int lastDigit = x % 10;
        int temp = x / 10;

        while (temp > 0) {
            int currentDigit = temp % 10;
            if (currentDigit != lastDigit) {
                return false;
            }
            temp = temp / 10;
        }
        return true;
    }

    public static void square(int x) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    public static void leftTriangle(int x) {
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    public static void rightTriangle(int x) {
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= x - i; j++) {
                System.out.print(' ');
            }
            for (int j = 1; j <= i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    public static void guessGame() {
        int secretNumber = random.nextInt(10);
        int attempts = 0;
        int userGuess = -1;

        System.out.println("Добро пожаловать в игру 'Угадай число'!");
        System.out.println("Я загадал число от 0 до 9. Попробуйте угадать!");

        while (userGuess != secretNumber) {
            userGuess = readIntInRange("Введите число от 0 до 9: ", 0, 9);
            attempts++;

            if (userGuess == secretNumber) {
                System.out.println("Поздравляем! Вы угадали число " + secretNumber + "!");
            } else {
                System.out.println("Вы не угадали. Попробуйте еще раз!");
            }
        }

        System.out.println("Вы отгадали число за " + attempts + " попыт" + TryWord(attempts));
    }

    private static String TryWord(int attempts) {
        int lastDigit = attempts % 10;
        int lastTwoDigits = attempts % 100;

        if (lastTwoDigits >= 11 && lastTwoDigits <= 14) {
            return "ок";
        }

        switch (lastDigit) {
            case 1: return "ку";
            case 2:
            case 3:
            case 4: return "ки";
            default: return "ок";
        }
    }

    // Методы из ex4.java
    public static void reverse(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }

    public static int[] reverseBack(int[] arr) {
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[arr.length - 1 - i];
        }
        return result;
    }

    public static int[] concat(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];

        for (int i = 0; i < arr1.length; i++) {
            result[i] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++) {
            result[arr1.length + i] = arr2[i];
        }

        return result;
    }

    public static int[] findAll(int[] arr, int x) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                count++;
            }
        }

        int[] result = new int[count];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                result[index] = i;
                index++;
            }
        }

        return result;
    }

    public static int[] deleteNegative(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (num >= 0) {
                count++;
            }
        }

        int[] result = new int[count];
        int index = 0;
        for (int num : arr) {
            if (num >= 0) {
                result[index] = num;
                index++;
            }
        }

        return result;
    }

    // Вспомогательные методы для ввода данных
    public static char readChar() {
        while (true) {
            try {
                System.out.print("Введите символ: ");
                String input = scanner.nextLine().trim();
                if (input.length() == 1) {
                    return input.charAt(0);
                } else {
                    System.out.println("Ошибка: введите ровно один символ!");
                }
            } catch (Exception e) {
                System.out.println("Ошибка ввода! Попробуйте снова.");
                scanner.nextLine();
            }
        }
    }

    public static int readInt(String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                return Integer.parseInt(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: введите целое число!");
            } catch (Exception e) {
                System.out.println("Ошибка ввода! Попробуйте снова.");
                scanner.nextLine();
            }
        }
    }

    public static int readIntInRange(String prompt, int min, int max) {
        while (true) {
            int number = readInt(prompt);
            if (number >= min && number <= max) {
                return number;
            } else {
                System.out.println("Ошибка: число должно быть от " + min + " до " + max + "!");
            }
        }
    }

    public static int readPositiveInt(String prompt) {
        while (true) {
            int number = readInt(prompt);
            if (number > 0) {
                return number;
            } else {
                System.out.println("Ошибка: число должно быть положительным!");
            }
        }
    }

    public static String readString(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine().trim();
    }

    public static int[] readArray(String prompt) {
        while (true) {
            try {
                System.out.println(prompt);
                System.out.print("Введите количество элементов: ");
                int size = Integer.parseInt(scanner.nextLine().trim());

                if (size < 0) {
                    System.out.println("Ошибка: размер массива не может быть отрицательным!");
                    continue;
                }

                if (size == 0) {
                    return new int[0];
                }

                int[] arr = new int[size];
                System.out.println("Введите " + size + " элементов:");
                for (int i = 0; i < size; i++) {
                    System.out.print("Элемент " + (i + 1) + ": ");
                    arr[i] = Integer.parseInt(scanner.nextLine().trim());
                }

                return arr;

            } catch (NumberFormatException e) {
                System.out.println("Ошибка: введите целое число!");
            } catch (Exception e) {
                System.out.println("Ошибка ввода! Попробуйте снова.");
                scanner.nextLine();
            }
        }
    }

    public static void printArray(String message, int[] arr) {
        System.out.print(message);
        if (arr.length == 0) {
            System.out.println("[]");
            return;
        }

        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}