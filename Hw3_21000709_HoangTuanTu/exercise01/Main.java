package Hw3_21000709_HoangTuanTu.exercise01;

import java.util.Random;

public class Main {
    static Random random = new Random();
    public static void main(String[] args) {
        final int SIZE = random.nextInt((int) Math.pow(10, 2)) + 2;
        final int INDEX = random.nextInt((int) SIZE - 1);
        final float BOUND = random.nextFloat(100) + 1;
        Fraction[] fractions = new Fraction[SIZE];
        System.out.println("Fractions are: ");
        for (int i = 0; i < SIZE; i++){
            fractions[i] = new Fraction(random.nextFloat(BOUND), random.nextFloat(BOUND));
            System.out.print(fractions[i] + ", ");
        }

        System.out.println("\n");
        System.out.println("_________________");

        System.out.printf("Fraction at %d: %s", INDEX, fractions[INDEX]);

        System.out.println("\n");
        System.out.println("_________________");

        Fraction sum = new Fraction(0, 1);
        for (Fraction fraction: fractions){
            sum = sum.add(fraction);
        }
        System.out.printf("Sum of %d values is: %s",SIZE, sum);

        System.out.println("\n");
        System.out.println("_________________");
        Fraction sub = new Fraction(0, 1);
        for (Fraction fraction: fractions){
            sub = sub.subtract(fraction);
        }
        System.out.printf("Gap of %d values is: %s",SIZE, sub);


        System.out.println("\n");
        System.out.println("_________________");
        Fraction production = new Fraction(1, 1);
        for (Fraction fraction: fractions){
            production = production.multiply(fraction);
        }
        System.out.printf("Production of %d values is: %s",SIZE, production);

        System.out.println("\n");
        System.out.println("_________________");
        Fraction quotient = new Fraction(1, 1);
        for (Fraction fraction: fractions){
            quotient = quotient.divide(fraction);
        }

        System.out.printf("Quotient of %d values is: %s",SIZE, quotient);
        System.out.println("\n");
        System.out.println("_________________");

        int condition = fractions[0].compareTo(fractions[1]);
        if (condition > 0){
            System.out.printf("%s > %s, (%.2f > %.2f)", fractions[0], fractions[1], fractions[0].getValue(), fractions[1].getValue());
        } else if (condition < 0){
            System.out.printf("%s < %s, (%.2f < %.2f)", fractions[0], fractions[1], fractions[0].getValue(), fractions[1].getValue());
        }else {
            System.out.printf("%s = %s, (%.2f = %.2f)", fractions[0], fractions[1], fractions[0].getValue(), fractions[1].getValue());
        }
    }
}
