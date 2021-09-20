package Week7.ex6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

public class Runnable6 {
    public static void main(String[] args) {


        List<Integer> list=new ArrayList<>();
        List<Thread> threadList = new ArrayList<>();
        for (int w = 0; w < 100; w++) {

            var thread = new Thread(() -> {
                int a;
                if(list.size()==0){
                    a=0;
                }else{
                    a  = list.get(list.size()-1);
                }
                for(int i=0; i<500; i++){
                    list.add(a+1);
                    a++;
                }

            });
            threadList.add(thread);
        }
        for (Thread thread: threadList) {
            thread.start();
            try
            {
                thread.join();
            }

            catch(Exception e)
            {
                System.out.println("Exception has been" +
                        " caught" + e);
            }
        }
        System.out.println(list);
    }

}
