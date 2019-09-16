package com.company;

public class IterativeMathLib {
    public IterativeMathLib() {
    }

    int gcd(int x, int y) {
        boolean var3 = false;

        while(y != 0) {
            if (x > y && x != 0) {
                int temp = x;
                x = y;
                y = temp % y;
                System.out.println("Answer: " + x + ", " + y );
            }
        }
        return x;
    }

    int ack(int x, int y) {

        int value[y];
        int sampleSize = 0;

        while(true) {
            if (x == 0) {
                y++;
                if (sampleSize-- == 0) {
                    System.exit(0);
                    break;
                }
                x = value[sampleSize];
                continue;
            }
            if (y == 0) {
                x--;
                y = 1;
                continue;
            }
            int index = sampleSize++;
            value[sampleSize] = x - 1;
            y--;
        }
        return y;
    }

    int fib(int x) {
        int temp_prev = 0, temp_curr = 1, temp_prevPrev;
        for(int i = 1; i < x; i++){
            temp_prevPrev = temp_prev;
            temp_prev = temp_curr;
            temp_curr = temp_prevPrev + temp_prev;
        }
        return temp_curr;
    }

    int hanoi(int n) {
        while (n > 1){
            int temp_han = n;




        }
        return 0;}

}
