package com.ankur.boot;

public class DeleteMe {

    public static void main(String args[]) throws Exception {
        long start = System.currentTimeMillis();
        Thread.sleep(5000);
        long end = System.currentTimeMillis();
        long diff= end-start;
        System.out.println("time difference = "+diff);
    }
}
