import java.util.Scanner;

/**
 * @author 1ommy
 * @version 10.08.2023
 */
public class Main {
    public static void main(String[] args) {
//        int celoeChislo = 27;
//        long ogromnoeCeloeChislo = 31293291322332L;
//
//        double drobnoeChislo = 34.1;
//        float drobnoeChislo2 = 15.21F;
//
//
//        System.out.println(celoeChislo);
//        System.out.println(ogromnoeCeloeChislo);
//        System.out.println(drobnoeChislo);
//        System.out.println(drobnoeChislo2);


//        double a = 5.0;
//        int b = 7;
//        double c = a-b;
//        System.out.println(c);
//        System.out.println(a*b);
//        System.out.println(a/b);
//
//        int year = 2023;
//        double pervoeChislo = 1.56;
//        double vtoroeChislo = 0.34;
//        int res = (int) (pervoeChislo / vtoroeChislo);
//
//        double timeOfDistancePassed = 14.8;
//        int result = (int) timeOfDistancePassed;
//        System.out.println("Сейчас " + year + " год"); // соединение или же сложение строк со строкой/числом называется конкатенацией
//        System.out.println(result);


//        // создаем мини калькулятор
//        double a = 1.56;
//        double b = 45.31;
//
//        System.out.println("Результат сложения двух чисел:"+(a+b));
//        System.out.println("Результат вычитания двух чисел:"+(a-b));
//        System.out.println("Результат умножения двух чисел:"+(a*b));
//        System.out.println("Результат деления двух чисел:"+ (a/b));

//        String myName = "Ivan";
//        String surname = new String("Ivan");
//        char name = 'а';
//        char patronymic = '3';
//        System.out.println((int) name);
//
////        if (name < patronymic) {
////            System.out.println("Буква имени идет в таблице аски раньше чем буква отчества " + ((int) patronymic));
////        } else if (name == patronymic) {
////            System.out.println("Они одинаковые");
////        } else {
////            System.out.println(" буква отчества идет раньше " + ((int) patronymic));
////        }
//
//        if (myName.equals(surname)) {
//            System.out.println("имя равно фамилии");
//        } else {
//            System.out.println("имя не равно фамилии");
//        }

//        Scanner scanner = new Scanner(System.in);
//
//
//        try {
//            int age = scanner.nextInt();
//
//            System.out.println(age);
//        } catch (Exception ex) {
//            System.out.println("Чет пошло не так");
//        }

      /*
      наш нормальный калькулятор умеет:
        1) считать первое число
        2) считать второе число
        3) сложить
        4) вычесть
        5) умножить
        6) поделить
       */

        Scanner scanner = new Scanner(System.in);

        double firstNumber;
        double secondNumber;
        int operation;

        try {
            System.out.println("Привет! Я калькулятор! Введи первое число");
            firstNumber = scanner.nextDouble();
            System.out.println("Ты ввел " + firstNumber + ". Введи второе число");
            secondNumber = scanner.nextDouble();
            System.out.println("Ты ввел " + secondNumber);

            System.out.println("Выбери операцию, которую ты хочешь выполнить:");
            System.out.println("1 - сложить\n2 - вычесть\n3 - умножить\n4 - поделить");
            operation = scanner.nextInt();

            if (operation == 1) {
                System.out.println("Результат сложения двух чисел:" + (firstNumber + secondNumber));
            } else if (operation == 2) {
                System.out.println("Результат вычитания двух чисел:" + (firstNumber - secondNumber));
            } else if (operation == 3)
                System.out.println("Результат умножения двух чисел:" + (firstNumber * secondNumber));
            else if (operation == 4) System.out.println("Результат деления двух чисел:" + (firstNumber / secondNumber));
            else
                System.out.println("Ты чет дурак, не умеешь читать,  то что написано выше.Перезапусти программу и на этапе выбора операции введи число от 1 до 4");

        } catch (Exception ex) {
            System.out.println("ты ввел что-то не так");
        }
    }
}