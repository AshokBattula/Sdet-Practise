// Requirements
// - Create a new class named J01TestDurations in the package com.ashok.basics.
// - Declare three integer variables for the test durations.
// - Calculate their sum.
// - Calculate the average using floating-point division.
// - Print the total and average.


package Day2;

public class J01TestDurations {
    public static void main(String[] args) {
        J01TestDurations a = new J01TestDurations();
        a.sumAndAverage(1, 2, 3);
        a.sumAndAverage(0, 0, 0);
        a.sumAndAverage(-1, 1,   -1);
        a.sumAndAverage(2147483647, 1, 2);
    }

    public void sumAndAverage(int a, int b, int c){
        long total =(long) a+b+c;
        double avg = (double) total/3;
        System.out.println("Total"+ " " + total + " and Average" + " " + avg );
    }
}
