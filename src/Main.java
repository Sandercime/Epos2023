import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
    // Задача № 1 ( максимальное число из трех целых )


         Scanner in = new Scanner(System.in);
         var maxNumber = 0;

         System.out.print("Input first number: ");
         int firstNumber = in.nextInt();

         System.out.print("Input second number: ");
         int secondNumber = in.nextInt();

         System.out.print("Input third number: ");
         int thirdNumber = in.nextInt();

         if (firstNumber > secondNumber) {
             maxNumber = firstNumber > thirdNumber ? firstNumber : thirdNumber;
         } else {
             maxNumber = secondNumber > thirdNumber ? secondNumber : thirdNumber;
         }

         System.out.print("Max number is: " + maxNumber + "\n");

         Main.solution_2();
        }



        public static void solution_2() {
        // Задача № 2 (високосный год)
            Scanner in = new Scanner(System.in);
            System.out.print("Введите год: ");
            int year = in.nextInt();


            if (year % 4 == 0 && year % 100 != 0) {
                System.out.print("YES\n");
            } else {
                System.out.print("NO\n");
            }

            Main.solution_3();
    }


        public static void solution_3() {
        // Задача № 3 (шоколадка)
            Scanner in = new Scanner(System.in);
            System.out.print("Введите число n: ");
            int n = in.nextInt();

            System.out.print("Введите число m: ");
            int m = in.nextInt();

            System.out.print("Введите число k: ");
            int k = in.nextInt();

            if ( k > n*m) {
                System.out.print("NO\n");
            } else if (k % n == 0 && k % m == 0) {
                System.out.print("YES\n");
            } else {
                System.out.print("NO\n");
            }

            Main.solution_4();
        }

    // Циклы
        public static void solution_4() {
        // Задача №1: вывести все числа [1-100] % 5 = 0
            for (var i = 0; i <= 100; i++) {
                if (i % 5 == 0) {
                    System.out.println(i);
                }
            }

            Main.solution_5();
        }



        public static void solution_5() {
        // Задача №2 . Последовательность
            Scanner in = new Scanner(System.in);
            System.out.print("Введите число n: ");
             long n = in.nextInt();
             long f_0 = 0;
             long f_1 = 1;

             for (var i = 2; i <= n ; i++) {
                 long next = f_0 + f_1;

                 f_0 = f_1;
                 f_1 = next;

             }

             System.out.print(f_1 + "\n");
             Main.solution_6();
    }



        public static void solution_6() {
        // Задача №3.
            Scanner in = new Scanner(System.in);
            System.out.print("Введите число n: ");
            long n = in.nextInt();
            long count = 0;

            for (var i = 0; i <= n; i++) {
                count += i*i;
            }
            System.out.print("Ответ равен: " + count);
        }
    }



