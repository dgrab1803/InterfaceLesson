package academy.learnprogramming;

import java.util.Scanner;

public class Main {

            private Scanner scanner = new Scanner(System.in);
            public static void main(String[] args) {
                Main main = new Main();
                Computation computation;

                if (main.shouldMultiply()) {
                    computation = new klasa2();
                }
                else {
                    computation = new klasa3(); // zaimplementuj brakującą klasę
                }

                double argument1 = main.getArgument();
                double argument2 = main.getArgument();

                double result = computation.compute(argument1, argument2);
                System.out.println("Wynik: " + result);
            }

            private boolean shouldMultiply() {
                System.out.println("jaka operacje chcesz zrobic ? Jeżeli ma to być mnożenie , naciśnij M i enter , kazdy inny wybor bedzie oznaczał dodawanie ");

                return scanner.next().equals("M");
            }

            private double getArgument() {
                System.out.println("podaj liczbe ");

                return scanner.nextDouble();
            }
        }



