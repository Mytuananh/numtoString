package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = scanner.nextInt();
        int hundred = (number - (number % 100)) / 100;
        System.out.println(hundred);
        int unit = (number - (hundred * 100)) % 10;
        System.out.println(unit);
        int dozens =(number - (hundred * 100) - unit) / 10;
        System.out.println(dozens);
        int numdo = number - (hundred * 100);

                if (number == numdo) {
                    switch (numdo) {
                        case 10:
                            System.out.println("ten");
                            break;
                        case 11:
                            System.out.println("eleven");
                            break;
                        case 12:
                            System.out.println("twelve");
                            break;
                        case 13:
                            System.out.println("thirteen");
                            break;
                        case 14:
                            System.out.println("fourteen");
                            break;
                        case 15:
                            System.out.println("fifteen");
                            break;
                        case 16:
                            System.out.println("sixteen");
                            break;
                        case 17:
                            System.out.println("seventeen");
                            break;
                        case 18:
                            System.out.println("eighteen");
                            break;
                        case 19:
                            System.out.println("nineteen");
                            break;
                        case 20:
                            System.out.println("twenty");
                            break;
                    }
                }

            if (number < 10 && number >=1) {
                switch (unit) {
                    case 1:
                        System.out.print("one");
                        break;
                    case 2:
                        System.out.print("two");
                        break;
                    case 3:
                        System.out.print("three");
                        break;
                    case 4:
                        System.out.print("four");
                        break;
                    case 5:
                        System.out.print("five");
                        break;
                    case 6:
                        System.out.print("six");
                        break;
                    case 7:
                        System.out.print("seven");
                        break;
                    case 8:
                        System.out.print("eight");
                        break;
                    case 9:
                        System.out.print("nine");
                        break;
                }
            }
            if (number > 20 && number <= 99) {
                switch (dozens) {
                    case 2:
                        System.out.print("twenty ");

                    case 3:
                        System.out.print("thirty ");
                        break;
                    case 4:
                        System.out.print("forty ");
                        break;
                    case 5:
                        System.out.print("fifty ");
                        break;
                    case 6:
                        System.out.print("sixty ");
                        break;
                    case 7:
                        System.out.print("seventy ");
                        break;
                    case 8:
                        System.out.print("eighty ");
                        break;
                    case 9:
                        System.out.print("ninety ");
                        break;
                }
                switch (unit) {
                    case 1:
                        System.out.print("one");
                        break;
                    case 2:
                        System.out.print("two");
                        break;
                    case 3:
                        System.out.print("three");
                        break;
                    case 4:
                        System.out.print("four");
                        break;
                    case 5:
                        System.out.print("five");
                        break;
                    case 6:
                        System.out.print("six");
                        break;
                    case 7:
                        System.out.print("seven");
                        break;
                    case 8:
                        System.out.print("eight");
                        break;
                    case 9:
                        System.out.print("nine");
                        break;
                }
            }
            if (number == 100) {
                System.out.println("one hundred");
            }
            if (number <= 999 && number > 100) {
                switch (hundred) {
                    case 1:
                        System.out.print("one hundred and ");
                        break;
                    case 2:
                        System.out.print("two hundred and ");
                        break;
                    case 3:
                        System.out.print("three hundred and ");
                        break;
                    case 4:
                        System.out.print("four hundred and ");
                        break;
                    case 5:
                        System.out.print("five hundred and ");
                        break;
                    case 6:
                        System.out.print("six hundred and ");
                        break;
                    case 7:
                        System.out.print("seven hundred and ");
                        break;
                    case 8:
                        System.out.print("eight hundred and ");
                        break;
                    case 9:
                        System.out.print("nine hundred and ");
                        break;
                }
                switch (dozens) {
                    case 2:
                        System.out.print("twenty ");

                    case 3:
                        System.out.print("thirty ");
                        break;
                    case 4:
                        System.out.print("forty ");
                        break;
                    case 5:
                        System.out.print("fifty ");
                        break;
                    case 6:
                        System.out.print("sixty ");
                        break;
                    case 7:
                        System.out.print("seventy ");
                        break;
                    case 8:
                        System.out.print("eighty ");
                        break;
                    case 9:
                        System.out.print("ninety ");
                        break;
                }
                switch (unit) {
                    case 1:
                        System.out.print("one");
                        break;
                    case 2:
                        System.out.print("two");
                        break;
                    case 3:
                        System.out.print("three");
                        break;
                    case 4:
                        System.out.print("four");
                        break;
                    case 5:
                        System.out.print("five");
                        break;
                    case 6:
                        System.out.print("six");
                        break;
                    case 7:
                        System.out.print("seven");
                        break;
                    case 8:
                        System.out.print("eight");
                        break;
                    case 9:
                        System.out.print("nine");
                        break;
                }
            }



    }
}