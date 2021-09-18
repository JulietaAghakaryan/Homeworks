package Week7.ex10;

import Week5.Task2.NotEqualException;

public class Cartesian {
    private int x;
    private int y;
    private int setX=0;
    private int setY=0;


    public void setX() {
        this.x = setX++;
    }

    public void setY() {
        this.y = setY++;
    }

    private int getX() {

        return x;
    }

    private int getY() {

        return y;
    }

    public void getXY(){
        if(getY()!=getX()){
            throw new NotEqualException(String.format("%d is x and %s is y and they are not equal",
                    getX(), getY()));
        }
        System.out.println(String.format("%d is x and %s is y", getX(), getY()));
    }
}
