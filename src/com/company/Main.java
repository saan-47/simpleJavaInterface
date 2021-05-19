package com.company;

public class Main implements Methods{
    @Override
    public void add(int a, int b) {
        System.out.printf(a+" + "+b+" = "+ (a+b));
//        System.out.printf(String.valueOf(a+b));
    }

    @Override
    public void div(double a, double b) {
        System.out.printf("\n"+a+" / "+b+" = " +a/b);

    }
    public static void main(String[] args) {
	// write your code here
        Main m = new Main();
        m.add(5,3);
        m.div(9,3);
    }

}
