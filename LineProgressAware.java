package com.company;

public class LineProgressAware extends ProgressAware {



    public LineProgressAware(int width) {
        super(width);
        if(this.width<0){
             throw new RuntimeException();
        }else{
            this.width = width;
        }

    }

    public void showProgressSeconds(int seconds) {
        int currentSecond=0;
        showProgress();
        while(currentSecond!=seconds){
            currentSecond++;
            System.out.println("The line width is: "+ width+ ", the progress is: " + currentSecond*width/seconds);

        }

    }
}
