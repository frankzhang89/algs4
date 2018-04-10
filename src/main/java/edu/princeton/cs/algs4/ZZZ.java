package edu.princeton.cs.algs4;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.util.HashMap;
import java.util.Map;

public class ZZZ {

    public static void main(String[] args) {
        String s ="12314";
        try {
            RandomAccessFile r = new RandomAccessFile("","");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private volatile static ZZZ zzz;




    private ZZZ(){

    }

    public static ZZZ getZZZ(){
        if(zzz==null){
            synchronized (ZZZ.class){
                if(zzz==null){
                    zzz = new ZZZ();
                }
            }
        }
        return zzz;
    }
}
