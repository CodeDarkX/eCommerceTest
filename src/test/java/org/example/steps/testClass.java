package org.example.steps;

import java.util.Random;

public class testClass {
    public static void main(String[] args) {
        Random random = new Random();

            int y = random.nextInt(3) + 1;
        int x = random.nextInt(3) + 1;
         String u = "//div[6]/div[2]/ul[1]/li["+ x +"]/ul/li["+ y +"]/a";
        System.out.printf(u);
    }
}
