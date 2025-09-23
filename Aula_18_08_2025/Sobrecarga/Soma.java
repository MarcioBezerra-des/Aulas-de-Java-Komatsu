package Sobrecarga;

public class Soma {

    public int somar(int a, int b) {
        return a + b;
    }

    public double somar(double a, double b) {
        return a + b;
    }

    public int somar(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Soma calc = new Soma();

        System.out.println("Soma int, int: " + calc.somar(2, 3));
        System.out.println("Soma double, double: " + calc.somar(2.5, 3.7));
        System.out.println("Soma int, int, int: " + calc.somar(1, 2, 3));
    }
}