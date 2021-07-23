///exception e talis-Exception in thread "main" java.lang.NumberFormatException: For input string: "null"

package com.company;

public class LinkedIntBuffer extends IntBuffer {

    private LinkedIntBuffer next;

    public LinkedIntBuffer getNext() {
        return next;
    }

    public void setNext(LinkedIntBuffer next) {
        this.next = next;
    }

    @Override
    public String toString() {
        String s = String.valueOf(next);
        int a = Integer.parseInt(s);
        String result = "LinkedIntBuffer{";
        for (int i = 1; i <= a; i++) {
            result += "next = " + i + " ";
        }
        result += "}";
        return result;
    }
}
