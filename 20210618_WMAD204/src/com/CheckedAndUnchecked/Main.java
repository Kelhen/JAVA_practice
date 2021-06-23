package com.CheckedAndUnchecked;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {

//        int x = 5/0;

        try {
            FileReader fr = new FileReader("file.txt");
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
