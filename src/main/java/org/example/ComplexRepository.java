package org.example;

public interface ComplexRepository {

    ComplexDigit sumComplex(ComplexDigit a, ComplexDigit b);
    ComplexDigit multiplyComplex(ComplexDigit firstDigit, ComplexDigit secondDigit);
    ComplexDigit divisionComplex(ComplexDigit firstDigit, ComplexDigit secondDigit);
}
