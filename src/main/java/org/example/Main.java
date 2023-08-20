package org.example;

public class Main {
    public static void main(String[] args) {
        var calc = new Calculator(new ComplexDigitService());
        var cmp1 = new ComplexDigit(1, 7);
        var cmp2 = new ComplexDigit(3, 8);

        var addition = calc.sumComplex(cmp1, cmp2);
        System.out.println("(" + cmp1 + ") + (" + cmp2 + ") = " + addition);

        var mult = calc.multiplyComplex(cmp1, cmp2);
        System.out.println("(" + cmp1 + ") * (" + cmp2 + ") = " + mult);

        var div = calc.divisionComplex(cmp1, cmp2);
        System.out.println("(" + cmp1 + ") / (" + cmp2 + ") = " + div);
    }
}