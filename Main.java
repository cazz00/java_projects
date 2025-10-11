package lab1;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            showMainMenu();

            try {
                int choice = Integer.parseInt(scanner.nextLine().trim());

                switch (choice) {
                    case 1:
                        testBasicMethods();
                        break;
                    case 2:
                        testAdditionalMethods();
                        break;
                    case 3:
                        testPatternMethods();
                        break;
                    case 4:
                        testArrayMethods();
                        break;
                    case 0:
                        System.out.println("До свидания!");
                        scanner.close();
                        return;
                    default:
                        System.out.println("Ошибка: выберите опцию от 0 до 4!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: введите число от 0 до 4!");
            }
        }
    }

    public static void showMainMenu() {
        System.out.println("\n========== ГЛАВНОЕ МЕНЮ ==========");
        System.out.println("1. Методы");
        System.out.println("2. Условия");
        System.out.println("3. Циклы");
        System.out.println("4. Массивы");
        System.out.println("0. Выход");
        System.out.print("Выберите категорию (0-4): ");
    }

    public static void testBasicMethods() {
        while (true) {
            System.out.println("\n========== БАЗОВЫЕ МЕТОДЫ ==========");
            System.out.println("1. Проверить большую букву");
            System.out.println("2. Проверить диапазон");
            System.out.println("3. Проверить делитель");
            System.out.println("4. Проверить равенство трех чисел");
            System.out.println("5. Сложение последних цифр пяти чисел");
            System.out.println("0. Назад в главное меню");
            System.out.print("Выберите опцию (0-5): ");

            try {
                int choice = Integer.parseInt(scanner.nextLine().trim());

                switch (choice) {
                    case 1:
                        testIsUpperCase();
                        break;
                    case 2:
                        testIsInRange();
                        break;
                    case 3:
                        testIsDivisor();
                        break;
                    case 4:
                        testIsEqual();
                        break;
                    case 5:
                        testLastNumSum();
                        break;
                    case 0:
                        return;
                    default:
                        System.out.println("Ошибка: выберите опцию от 0 до 5!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: введите число от 0 до 5!");
            }
        }
    }

    public static void testAdditionalMethods() {
        while (true) {
            System.out.println("\n========== ДОПОЛНИТЕЛЬНЫЕ МЕТОДЫ ==========");
            System.out.println("1. Тройная сумма");
            System.out.println("2. Двойная сумма");
            System.out.println("3. Возраст (склонение)");
            System.out.println("4. День недели по номеру");
            System.out.println("5. Вывод дней недели");
            System.out.println("0. Назад в главное меню");
            System.out.print("Выберите опцию (0-5): ");

            try {
                int choice = Integer.parseInt(scanner.nextLine().trim());

                switch (choice) {
                    case 1:
                        testSum3();
                        break;
                    case 2:
                        testSum2();
                        break;
                    case 3:
                        testAge();
                        break;
                    case 4:
                        testDay();
                        break;
                    case 5:
                        testPrintDays();
                        break;
                    case 0:
                        return;
                    default:
                        System.out.println("Ошибка: выберите опцию от 0 до 5!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: введите число от 0 до 5!");
            }
        }
    }

    public static void testPatternMethods() {
        while (true) {
            System.out.println("\n========== МЕТОДЫ С ПАТТЕРНАМИ ==========");
            System.out.println("1. Проверка одинаковости цифр");
            System.out.println("2. Квадрат из звездочек");
            System.out.println("3. Левый треугольник");
            System.out.println("4. Правый треугольник");
            System.out.println("5. Игра 'Угадай число'");
            System.out.println("0. Назад в главное меню");
            System.out.print("Выберите опцию (0-5): ");

            try {
                int choice = Integer.parseInt(scanner.nextLine().trim());

                switch (choice) {
                    case 1:
                        testEqualNum();
                        break;
                    case 2:
                        testSquare();
                        break;
                    case 3:
                        testLeftTriangle();
                        break;
                    case 4:
                        testRightTriangle();
                        break;
                    case 5:
                        testGuessGame();
                        break;
                    case 0:
                        return;
                    default:
                        System.out.println("Ошибка: выберите опцию от 0 до 5!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: введите число от 0 до 5!");
            }
        }
    }

    public static void testArrayMethods() {
        while (true) {
            System.out.println("\n========== МЕТОДЫ ДЛЯ РАБОТЫ С МАССИВАМИ ==========");
            System.out.println("1. Реверс массива (изменяет исходный)");
            System.out.println("2. Возвратный реверс (новый массив)");
            System.out.println("3. Объединение массивов");
            System.out.println("4. Поиск всех вхождений");
            System.out.println("5. Удаление отрицательных чисел");
            System.out.println("0. Назад в главное меню");
            System.out.print("Выберите опцию (0-5): ");

            try {
                int choice = Integer.parseInt(scanner.nextLine().trim());

                switch (choice) {
                    case 1:
                        testReverse();
                        break;
                    case 2:
                        testReverseBack();
                        break;
                    case 3:
                        testConcat();
                        break;
                    case 4:
                        testFindAll();
                        break;
                    case 5:
                        testDeleteNegative();
                        break;
                    case 0:
                        return;
                    default:
                        System.out.println("Ошибка: выберите опцию от 0 до 5!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: введите число от 0 до 5!");
            }
        }
    }

    // Реализации тестовых методов
    public static void testIsUpperCase() {
        System.out.println("\n=== Проверка большой буквы ===");
        System.out.println("Проверим, является ли символ большой буквой (A-Z)");
        char x = Lab1.readChar();
        boolean result = Lab1.isUpperCase(x);
        System.out.println(result);
    }

    public static void testIsInRange() {
        System.out.println("\n=== Проверка диапазона ===");
        System.out.println("Проверим, находится ли число в указанном диапазоне");
        int a = Lab1.readInt("Введите левую границу диапазона: ");
        int b = Lab1.readInt("Введите правую границу диапазона: ");
        int num = Lab1.readInt("Введите число для проверки: ");
        boolean result = Lab1.isInRange(a, b, num);
        System.out.println(result);
    }

    public static void testIsDivisor() {
        System.out.println("\n=== Проверка делителя ===");
        System.out.println("Проверим, делится ли одно число на другое");
        int a = Lab1.readInt("Введите первое число: ");
        int b = Lab1.readInt("Введите второе число: ");
        boolean result = Lab1.isDivisor(a, b);
        System.out.println(result);
    }

    public static void testIsEqual() {
        System.out.println("\n=== Проверка равенства ===");
        System.out.println("Проверим, равны ли все три числа");
        int a = Lab1.readInt("Введите первое число: ");
        int b = Lab1.readInt("Введите второе число: ");
        int c = Lab1.readInt("Введите третье число: ");
        boolean result = Lab1.isEqual(a, b, c);
        System.out.println(result);
    }

    public static void testLastNumSum() {
        System.out.println("\n=== Сложение последних цифр ===");
        System.out.println("Будем последовательно складывать последние цифры пяти чисел");

        int result = 0;

        int num1 = Lab1.readInt("Введите первое число: ");
        result = Lab1.lastNumSum(result, num1);
        System.out.println("Начальное значение: " + result);

        for (int i = 2; i <= 5; i++) {
            int num = Lab1.readInt("Введите " + i + "-е число: ");
            int previous = result;
            result = Lab1.lastNumSum(result, num);
            System.out.println(previous + " + " + num + " (последние цифры) = " + result);
        }

        System.out.println("Итоговый результат: " + result);
    }

    public static void testSum3() {
        System.out.println("\n=== Тройная сумма ===");
        System.out.println("Проверим, можно ли из двух чисел получить третье");
        int x = Lab1.readInt("Введите первое число: ");
        int y = Lab1.readInt("Введите второе число: ");
        int z = Lab1.readInt("Введите третье число: ");

        boolean result = Lab1.sum3(x, y, z);
        System.out.println("Числа: " + x + ", " + y + ", " + z);
        System.out.println("Результат: " + result);
    }

    public static void testSum2() {
        System.out.println("\n=== Двойная сумма ===");
        System.out.println("Сложим два числа (если сумма 10-19, вернем 20)");
        int x = Lab1.readInt("Введите первое число: ");
        int y = Lab1.readInt("Введите второе число: ");

        int result = Lab1.sum2(x, y);
        int actualSum = x + y;
        System.out.println(x + " + " + y + " = " + actualSum);
        System.out.println("Результат: " + result);
    }

    public static void testAge() {
        System.out.println("\n=== Возраст ===");
        System.out.println("Правильное склонение слова 'год' для числа");
        int x = Lab1.readInt("Введите возраст: ");

        String result = Lab1.age(x);
        System.out.println("Результат: " + result);
    }

    public static void testDay() {
        System.out.println("\n=== День недели ===");
        System.out.println("Определим день недели по номеру (1-понедельник, 7-воскресенье)");
        int x = Lab1.readInt("Введите номер дня недели (1-7): ");

        String result = Lab1.day(x);
        System.out.println("Результат: " + result);

        if (x < 1 || x > 7) {
            System.out.println("Введите число от 1 до 7 для корректного результата");
        }
    }

    public static void testPrintDays() {
        System.out.println("\n=== Вывод дней недели ===");
        System.out.println("Выведем все дни начиная с указанного");
        String x = Lab1.readString("Введите название дня недели: ");

        System.out.println("Результат:");
        Lab1.printDays(x);
    }

    public static void testEqualNum() {
        System.out.println("\n=== Проверка одинаковости цифр ===");
        System.out.println("Проверим, все ли цифры в числе одинаковы");
        int x = Lab1.readInt("Введите число: ");

        boolean result = Lab1.equalNum(x);
        System.out.println(result);

        if (x < 0) x = -x;
        System.out.print("Цифры числа: ");
        int temp = x;
        while (temp > 0) {
            System.out.print(temp % 10 + " ");
            temp = temp / 10;
        }
        System.out.println();
    }

    public static void testSquare() {
        System.out.println("\n=== Квадрат из звездочек ===");
        int x = Lab1.readPositiveInt("Введите размер квадрата: ");

        System.out.println("Результат:");
        Lab1.square(x);
    }

    public static void testLeftTriangle() {
        System.out.println("\n=== Левый треугольник ===");
        int x = Lab1.readPositiveInt("Введите высоту треугольника: ");

        System.out.println("Результат:");
        Lab1.leftTriangle(x);
    }

    public static void testRightTriangle() {
        System.out.println("\n=== Правый треугольник ===");
        int x = Lab1.readPositiveInt("Введите высоту треугольника: ");

        System.out.println("Результат:");
        Lab1.rightTriangle(x);
    }

    public static void testGuessGame() {
        System.out.println("\n=== Игра 'Угадай число' ===");
        Lab1.guessGame();
    }

    public static void testReverse() {
        System.out.println("\n=== Реверс массива (изменяет исходный) ===");
        int[] arr = Lab1.readArray("Создадим массив для реверса:");

        System.out.println("\nИсходный массив:");
        Lab1.printArray("arr = ", arr);

        Lab1.reverse(arr);

        System.out.println("После реверса:");
        Lab1.printArray("arr = ", arr);
    }

    public static void testReverseBack() {
        System.out.println("\n=== Возвратный реверс (новый массив) ===");
        int[] arr = Lab1.readArray("Создадим массив для реверса:");

        System.out.println("\nИсходный массив:");
        Lab1.printArray("arr = ", arr);

        int[] reversed = Lab1.reverseBack(arr);

        System.out.println("Реверсированный массив:");
        Lab1.printArray("result = ", reversed);
        System.out.println("Исходный массив не изменен:");
        Lab1.printArray("arr = ", arr);
    }

    public static void testConcat() {
        System.out.println("\n=== Объединение массивов ===");
        System.out.println("Первый массив:");
        int[] arr1 = Lab1.readArray("");
        System.out.println("Второй массив:");
        int[] arr2 = Lab1.readArray("");

        System.out.println("\nПервый массив:");
        Lab1.printArray("arr1 = ", arr1);
        System.out.println("Второй массив:");
        Lab1.printArray("arr2 = ", arr2);

        int[] result = Lab1.concat(arr1, arr2);

        System.out.println("Объединенный массив:");
        Lab1.printArray("result = ", result);
    }

    public static void testFindAll() {
        System.out.println("\n=== Поиск всех вхождений ===");
        int[] arr = Lab1.readArray("Создадим массив для поиска:");
        int x = Lab1.readInt("Введите число для поиска: ");

        System.out.println("\nИсходный массив:");
        Lab1.printArray("arr = ", arr);
        System.out.println("Ищем число: " + x);

        int[] indices = Lab1.findAll(arr, x);

        System.out.println("Индексы вхождения:");
        Lab1.printArray("result = ", indices);

        if (indices.length == 0) {
            System.out.println("Число " + x + " не найдено в массиве");
        } else {
            System.out.println("Число " + x + " найдено " + indices.length + " раз(а)");
        }
    }

    public static void testDeleteNegative() {
        System.out.println("\n=== Удаление отрицательных чисел ===");
        int[] arr = Lab1.readArray("Создадим массив (можно вводить отрицательные числа):");

        System.out.println("\nИсходный массив:");
        Lab1.printArray("arr = ", arr);

        int[] result = Lab1.deleteNegative(arr);

        System.out.println("Без отрицательных чисел:");
        Lab1.printArray("result = ", result);

        int negativeCount = arr.length - result.length;
        if (negativeCount > 0) {
            System.out.println("Удалено " + negativeCount + " отрицательных чисел");
        } else {
            System.out.println("Отрицательных чисел не было");
        }
    }
}
