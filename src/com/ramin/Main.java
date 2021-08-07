package com.ramin;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        StaXParser read = new StaXParser();
        List<Item> readConfig = read.readFile("testXML.xml");
        for (Item item : readConfig) {
            System.out.println(item);
        }
    }
}
