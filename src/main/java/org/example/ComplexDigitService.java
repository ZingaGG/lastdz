package org.example;

public class ComplexDigitService implements ComplexRepository{

    public ComplexDigitService() {
    }

    @Override
    public ComplexDigit sumComplex(ComplexDigit a, ComplexDigit b) {
        ComplexDigit result = new ComplexDigit();
        result.setA(a.getA()+b.getA());
        result.setB(a.getB()+b.getB());
        return result;
    }

    @Override
    public ComplexDigit multiplyComplex(ComplexDigit firstDigit, ComplexDigit secondDigit) {
        double a = firstDigit.getA();
        double b = firstDigit.getB();
        double c = secondDigit.getA();
        double d = secondDigit.getB();
        ComplexDigit result = new ComplexDigit();
        result.setA((a * c) - (b * d));
        result.setB((b * c) + (a * d));
        return result;
    }

    @Override
    public ComplexDigit divisionComplex(ComplexDigit firstDigit, ComplexDigit secondDigit) {
        double a = firstDigit.getA();
        double b = firstDigit.getB();
        double c = secondDigit.getA();
        double d = secondDigit.getB();
        double divider = Math.sqrt(c) + Math.sqrt(d);
        ComplexDigit result = new ComplexDigit();
        result.setA(((a * c) + (b * d)) / divider);
        result.setB(((b * c) - (a * d)) / divider);
        return result;
    }
}
