package org.example;

public class Calculator{

    private final ComplexRepository operations;

    public Calculator(ComplexRepository operations) {
        this.operations = operations;
    }

    public ComplexDigit sumComplex(ComplexDigit a, ComplexDigit b) {
        return operations.sumComplex(a, b);
    }

    public ComplexDigit multiplyComplex(ComplexDigit a, ComplexDigit b) {
        return operations.multiplyComplex(a, b);
    }

    public ComplexDigit divisionComplex(ComplexDigit a, ComplexDigit b) {
        return operations.divisionComplex(a, b);
    }



}
