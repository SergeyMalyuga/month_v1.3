//Напишите программу, которая принимает на вход значение года и номер месяца
//и выводит количество дней в месяце, с учетом года (обычный или високосный), используя
//switch-case.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите год!");
        Scanner answer = new Scanner(System.in);
        if (answer.hasNextInt()) {
            int number = answer.nextInt();
            System.out.println("Введите номер месяца!");
            Scanner answer2 = new Scanner(System.in);
            if (answer2.hasNextInt()) {
                int number2 = answer2.nextInt();

                switch (number2) {
                    case 1:
                        System.out.println("В январе 31 день");
                        break;
                    case 2:
                        if (number % 4 == 0 && number % 100 != 0) {
                            System.out.println("В февраль 29 дней");
                            break;
                        }
                        else if (number%100==0 && number %400 == 0)
                        {
                            System.out.println("В февраль 29 дней");
                            break;
                        }
                        else {
                            System.out.println("В февраль 28 дней");
                            break;
                        }
                    case 3:
                        System.out.println("В марте 31 день");
                        break;
                    case 4:
                        System.out.println("В апреле 30 дней");
                        break;
                    case 5:
                        System.out.println("В мае 31 день");
                        break;
                    case 6:
                        System.out.println("В июне 30 дней");
                        break;
                    case 7:
                        System.out.println("В июле 31 день");
                        break;
                    case 8:
                        System.out.println("В августе 31 день");
                        break;
                    case 9:
                        System.out.println("В сентябре 30 дней");
                        break;
                    case 10:
                        System.out.println("В октябре 31 день");
                        break;
                    case 11:
                        System.out.println("В ноябре 30 дней");
                        break;
                    case 12:
                        System.out.println("В декабре 31 день");
                        break;
                    default:
                        System.out.println("Нет такого номера месяца!");
                }
            }
            else
            {
                System.out.println("Вы ввели не число!");
            }
        }
        else
        {
            System.out.println("Вы ввели не число!");
        }
    }


}