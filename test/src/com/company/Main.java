package com.company;

public class Main {

    public static void main(String[] args) {
        MakKwakQueue queue = new MakKwakQueue(Integer.valueOf(args[0]));
        System.out.println(queue.getAllQuotes());

    }

}
