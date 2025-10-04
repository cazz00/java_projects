import java.util.Scanner;

public class ex2 {
    private static Scanner scanner = new Scanner(System.in);
    
    /*Тройная сумма.
    Дана сигнатура метода: public bool sum3 (int x, int y, int z);
    Необходимо реализовать метод таким образом, чтобы он возвращал true, если
    два любых числа (из трех принятых) можно сложить так, чтобы получить
    третье. */
    public static boolean sum3(int x, int y, int z) {
        return x + y == z || x + z == y || y + z == x;
    }
    
    /*7 Двойная сумма.
    Дана сигнатура метода: public int sum2 (int x, int y);
    Необходимо реализовать метод таким образом, чтобы он возвращал сумму
    чисел x и y. Однако, если сумма попадает в диапазон от 10 до 19, то надо вернуть
    число 20. */
    public static int sum2(int x, int y) {
        int sum = x + y;
        return (sum >= 10 && sum <= 19) ? 20 : sum;
    }
    
    /*8 Возраст.
    Дана сигнатура метода: public String age (int x);
    Необходимо реализовать метод таким образом, чтобы он возвращал строку, в
    которой сначала будет число х, а затем одно из слов:
    год
    года
    лет
    Слово “год” добавляется, если число х заканчивается на 1, кроме числа 11.
    Слово “года” добавляется, если число х заканчивается на 2, 3 или 4, кроме чисел
    12, 13, 14.
    Слово “лет”добавляется во всех остальных случаях. */
    public static String age(int x) {
        int lastDigit = x % 10;
        switch (lastDigit) {
            case 1: return x + " год";
            case 2:
            case 3:
            case 4: return x + " года";
            default: return x + " лет";
        }
    }
    
    /* 9 День недели.
    Дана сигнатура метода: public String day (int x);
    Метод принимает число x, обозначающее день недели. Необходимо реализовать
    метод таким образом, чтобы он возвращал строку, которая будет обозначать
    текущий день недели, где 1 - это понедельник, а 7 – воскресенье. Если число не
    от 1 до 7 то верните текст “это не день недели”. Вместо if в данной задаче
    используйте switch.*/
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
    
    /*10 Вывод дней недели.
    Дана сигнатура метода: public void printDays (String x);
    В качестве параметра метод принимает строку, в которой записано название
    дня недели. Необходимо реализовать метод таким образом, чтобы он выводил
    на экран название переданного в него дня и всех последующих до конца недели
    дней. Если в качестве строки передан не день, то выводится текст “это не день
    недели”. Первый день понедельник, последний – воскресенье. Вместо if в данной
    задаче используйте switch. СПРОСИТЬ У ПРЕПОДАВАТЕЛЯ ПОЧЕМУ НЕ РАБОТАЕТ ВВОД СТРОКИ*/
    public static void printDays(String x) {
        
        switch (x.toLowerCase()) {
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
                System.out.println("суббота");;
            case "воскресенье":
                System.out.println("воскресенье");
                break;
            default:
                System.out.println("это не день недели");
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
    
    public static String readString(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine().trim();
    }
    
    
    public static void testSum3() {
        System.out.println("\n    Тройная сумма");
        System.out.println("Проверим, можно ли из двух чисел получить третье");
        int x = readInt("Введите первое число: ");
        int y = readInt("Введите второе число: ");
        int z = readInt("Введите третье число: ");
        
        boolean result = sum3(x, y, z);
        System.out.println("Числа: " + x + ", " + y + ", " + z);
        System.out.println("Результат: " + result);
    }
    
    public static void testSum2() {
        System.out.println("\n    Двойная сумма");
        System.out.println("Сложим два числа (если сумма 10-19, вернем 20)");
        int x = readInt("Введите первое число: ");
        int y = readInt("Введите второе число: ");
        
        int result = sum2(x, y);
        int actualSum = x + y;
        System.out.println(x + " + " + y + " = " + actualSum);
        System.out.println("Результат: " + result);
        if (actualSum >= 10 && actualSum <= 19) {
            System.out.println("Сумма в диапазоне 10-19, поэтому возвращаем 20");
        }
    }
    
    public static void testAge() {
        System.out.println("\n    Возраст");
        System.out.println("Правильное склонение слова 'год' для числа");
        int x = readInt("Введите возраст: ");
        
        String result = age(x);
        System.out.println("Результат: " + result);        
    }
    
    public static void testDay() {
        System.out.println("\n    День недели");
        System.out.println("Определим день недели по номеру (1-понедельник, 7-воскресенье)");
        int x = readInt("Введите номер дня недели (1-7): ");
        
        String result = day(x);
        System.out.println("Результат: " + result);
        
        if (x < 1 || x > 7) {
            System.out.println("Введите число от 1 до 7 для корректного результата");
        }
    }
    
    public static void testPrintDays() {
        System.out.println("\n    Вывод дней недели");
        System.out.println("Выведем все дни начиная с указанного");
        String x = readString("Введите название дня недели: ");
        
        System.out.println("Результат:");
        printDays(x);
    }
    
    
    public static void showMenu() {
        System.out.println("             ДОПОЛНИТЕЛЬНЫЕ МЕТОДЫ");
        System.out.println("1. Тройная сумма");
        System.out.println("2. Двойная сумма");
        System.out.println("3. Возраст (склонение)");
        System.out.println("4. День недели по номеру");
        System.out.println("5. Вывод дней недели");
        System.out.println("0. Выход");
        System.out.print("Выберите опцию (0-5): ");
    }
    
    public static void main(String[] args) {    
        while (true) {
            showMenu();    
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
                        System.out.println("До свидания!");
                        scanner.close();
                        return;
                    default:
                        System.out.println("Ошибка: выберите опцию от 0 до 5!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: введите число от 0 до 5!");
            }
        }
    }
}