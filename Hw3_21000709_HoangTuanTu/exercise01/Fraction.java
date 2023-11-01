package Hw3_21000709_HoangTuanTu.exercise01;

public class Fraction {
    private float numerator;
    private float denominator;

    public Fraction(float numerator, float denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator can't be 0.");
        }
        while (Math.abs(numerator) % 1.0 != 0.0 || Math.abs(denominator) % 1.0 != 0.0){
            numerator *= 10;
            denominator *= 10;
        }

        if (numerator * denominator > 0){
            numerator = Math.abs(numerator);
        }else{
            numerator = -Math.abs(numerator);
        }

        denominator = Math.abs(denominator);

        float gcd = gcd(numerator, denominator);
        this.numerator = numerator / gcd;
        this.denominator = denominator / gcd;
    }

    public Fraction add(Fraction c) {
        float resultNumerator = (this.numerator * c.denominator) + (c.numerator * this.denominator);
        float resultDenominator = this.denominator * c.denominator;
        return new Fraction(resultNumerator, resultDenominator);
    }

    public Fraction subtract(Fraction c) {
        float resultNumerator = (this.numerator * c.denominator) - (c.numerator * this.denominator);
        float resultDenominator = this.denominator * c.denominator;
        return new Fraction(resultNumerator, resultDenominator);
    }

    public Fraction multiply(Fraction c) {
        float resultNumerator = this.numerator * c.numerator;
        float resultDenominator = this.denominator * c.denominator;
        return new Fraction(resultNumerator, resultDenominator);
    }

    public Fraction divide(Fraction c) {
        if (c.numerator == 0) {
            throw new ArithmeticException("Can't divide for 0.");
        }
        float resultNumerator = this.numerator * c.denominator;
        float resultDenominator = this.denominator * c.numerator;
        return new Fraction(resultNumerator, resultDenominator);
    }

    public Fraction normalize() {
        float gcd = gcd(this.numerator, this.denominator);
        float normalizedNumerator = this.numerator / gcd;
        float normalizedDenominator = this.denominator / gcd;
        if (normalizedNumerator * normalizedDenominator > 0){
            normalizedNumerator = Math.abs(normalizedNumerator);
        }else{
            normalizedNumerator = -Math.abs(normalizedNumerator);
        }
        normalizedDenominator = Math.abs(normalizedDenominator);

        return new Fraction(normalizedNumerator, normalizedDenominator);
    }

    public float getNumerator() {
        return numerator;
    }

    public float getDenominator() {
        return denominator;
    }

    public int compareTo(Fraction other){
        if (this.getValue() - other.getValue() > 0){
            return 1;
        } else if (this.getValue() - other.getValue() < 0){
            return -1;
        }
        return 0;
    }

    public float getValue(){
        return this.numerator / this.denominator;
    }

    @Override
    public String toString() {
        int numerator = (int) this.numerator;
        int denominator = (int) this.denominator;
        StringBuilder result = new StringBuilder();
        result.append(numerator);
        if (denominator != 1){
            result.append("/").append(denominator);
        }

        return result.toString();
    }

    private float gcd(float a, float b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (b != 0) {
            float temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
