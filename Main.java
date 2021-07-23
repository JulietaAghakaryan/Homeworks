package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ProgressAware p = new LineProgressAware(30);
        p.showProgressSeconds(20);
    }
}
