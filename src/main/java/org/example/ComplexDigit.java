package org.example;

public class ComplexDigit {
    private double a;
    private double b;

    public ComplexDigit(double a, double b){
        this.a = a;
        this.b = b;
    }

    public ComplexDigit(){

    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return String.format("(%.2f + %.2fi)", a, b);
    }
}
