package com.company;

public class CircleProgressAware extends ProgressAware {


    public CircleProgressAware(int width) {
        super(width);
    }

    public void showProgress(int seconds) {
        int currentSecond=0;
        showProgress();
        while(currentSecond!=seconds){
            currentSecond++;
            System.out.println("The line width is: "+ 360+ ", the progress is: " + currentSecond*360/seconds);

        }
    }
}
