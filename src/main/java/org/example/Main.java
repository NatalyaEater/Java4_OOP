package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


/*расширить класс калькулятор на умножение
 2)расширить класс калькулятор на деление
 3)расширить класс калькулятор на бинарный перевод(принимаемые значения как стринг, так и инт )
готовый метод Integer.toBinaryString()
 */
public class Main {
    public static void main(String[] args) {
        int num = 1;

        while (num != 5) {
            System.out.print("Простой калькулятор.Выберите действие с числами : ");
            System.out.println();
            System.out.println("1 - Сложение");
            System.out.println("2 - Умножение");
            System.out.println("3 - Деление ");
            System.out.println("4 - Конвертация в бинарный код ");


            Scanner in = new Scanner(System.in);
            num = in.nextInt();

            System.out.println("Введите первое число");
            Scanner in2 = new Scanner(System.in);
            int num1 = in2.nextInt();

            System.out.println("Введите второе число");
            Scanner in3 = new Scanner(System.in);
            int num2 = in3.nextInt();

            Cals<Integer> cals = new Cals<>();


            switch (num) {
                case 1:
                    System.out.println("Результат сложения = "+cals.sum(num1,num2));
                    break;
                case 2:
                    System.out.println("Результат умножения = "+cals.multiplication(num1,num2));
                    break;
                case 3:
                    System.out.println("Результат деления = "+cals.del(num1,num2));
                    break;
                case 4:
                    System.out.println("Результат преобразования : "+"\n"
                            +cals.binCod(num1,num2));
                    break;

                default:
                    System.out.println("Неверный вариант ввода");

            }

        }
    }
}