package java.JavaDataStructures;

import java.util.Arrays;

public class Array{
    public static void main(String[] args){
        String[] weekdays = new String[]{"monday", "thuesday", "wednesday", "thursday", "friday"};

        System.out.println(Arrays.toString(weekdays));

        int i = 0;
        for(String day : weekdays){
            weekdays[i] = weekdays[i].toUpperCase();
            i++;
        }
        System.out.println(Arrays.toString(weekdays));
    }

}