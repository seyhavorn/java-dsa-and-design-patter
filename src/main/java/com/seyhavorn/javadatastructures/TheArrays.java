package com.seyhavorn.javadatastructures;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TheArrays {
    public static void main(String[] args) {
        String[] colors = new String[5];
        colors[0] = "purple";
        colors[1] = "blue";

        System.out.println(Arrays.toString(colors));
        System.out.println(colors[0]);
        System.out.println(colors[1]);

        colors[2] = " yellow";
        System.out.println(Arrays.toString(colors));

        int[] numbers = {100, 200};
//        numbers[0] = 100;
//        numbers[1] = 200;

        System.out.println(numbers[1]);
        System.out.println(Arrays.toString(numbers));
    }
}
