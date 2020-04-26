package net.jcip.examples;

import java.util.Random;

public class GCDemo {

    public static void main(String[] args) throws Exception {
        System.out.println("=============GCDemo==========");
        String s = "root";
        while (true){
            s += s + new Random().nextInt(222222222) + new Random().nextInt(322222222);
        }
    }

}