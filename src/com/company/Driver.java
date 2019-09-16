package com.company;

public class Driver {
    public Driver() {
    }

    public static void main(String[] args) {
        RecursiveMathLib recursionLibrary = new RecursiveMathLib();
        IterativeMathLib iterationLibrary = new IterativeMathLib();
        System.out.println("---- Recursion ----");
        runTestCode(recursionLibrary);
        System.out.println("---- Iteration ----");
        runTestCode(iterationLibrary);
    }

    public static void runTestCode(IterativeMathLib library) {
        System.out.println("GCD of 4,1 = " + library.gcd(4, 2));
    }
}

