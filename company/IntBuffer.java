package com.company;

public class IntBuffer {

    private int intVar;

    public int getIntVar() {
        return intVar;
    }

    public void setIntVar(int intVar) {
        this.intVar = intVar;
    }

    @Override
    public String toString() {
        return "IntBuffer{" +
                "intVar =" + intVar +
                '}';
    }
}
