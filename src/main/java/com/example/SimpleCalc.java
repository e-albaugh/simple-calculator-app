package com.example;


public class SimpleCalc {
    public static void main(String[] args) {
        System.out.println("Hello, world!");
    }
    
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        throw new UnsupportedOperationException("Multiply is not supported in this version.");
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero");
        }
        return a / b;
    }
}
