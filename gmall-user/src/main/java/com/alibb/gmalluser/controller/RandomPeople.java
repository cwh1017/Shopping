package com.alibb.gmalluser.controller;

import java.util.Random;

public class RandomPeople {
    public static void main(String[] args) {
        Random col = new Random();
        Random row = new Random();
        int lie = col.nextInt(4)+1;
        int hang = col.nextInt(8)+1;
        System.out.println("");

        String a = "b"+"c"+"d"+"e";
        Integer q = 100;
        Integer qq = 200;
        Integer w = 100;
        Integer ww = 200;
        System.out.println(q==w); //true
        System.out.println(q.equals(w)); //true
        System.out.println(qq == ww); //false
        System.out.println(qq.equals(ww)); //true

    }
}
