package com.company;

public class ProgressAware {
    private boolean visibility=false;
    public int width;

    public ProgressAware(int width) {
        this.width = width;
    }


    public void showProgress(){
        visibility=true;
        System.out.println("The progress is visible");
    }

    public void hideProgress(){
        visibility=false;
        System.out.println("The progress is not visible");
    }

    public boolean isProgressVisible(){
        return visibility;
    }

    public void showProgressSeconds(int seconds) {


    }


}
