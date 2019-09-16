package com.company;

public class RecursiveMathLib {
    public RecursiveMathLib() {
    }

    int gcd(int x, int y) {
        if (y == 0) {
            return x;
        } else if (x != 0 && x >= y) {
            return this.gcd(y, x % y);
        } else {
            System.out.println("Recursive GCD Not Implemented!");
            return 0;
        }
    }

    int ack(int x, int y) {
        if (x == 0) {
            ++y;
            return y;
        } else if (y == 0) {
            return this.ack(x - 1, 1);
        } else if (x != 0 && y != 0) {
            return this.ack(x - 1, y) * this.ack(x, y - 1);
        } else {
            System.out.println("Recursive Ackermann's Not Implemented!");
            return 0;
        }
    }

    int fib(int x) {

        if (x == 0){
            return x;
        } else if (x == 1){
            return x;
        } else if (x > 1){
            return this.fib(x - 1) + this.fib(x - 2);
        } else {
            System.out.println("Recursive Fibonacci Not Implemented!");
            return x;
        }
    }

    int hanoi(int n){

        if (n == 1){
           return 1;
        } else if ( n > 1){
            return 2 * this.hanoi(n - 1 ) + 1;
        } else {
            System.out.println("Recursive Hanoi Problem Not Implemented!");
            return n;
        }
    }
}
