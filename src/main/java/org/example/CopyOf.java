package org.example;

import java.util.Arrays;

public class CopyOf {

    public static void main(String[] args) {


        String[] strings = new String[0];




        strings = add("Hello", strings);
        strings = add("Hi how are you?", strings);
        strings = add("I am fine thanks :)", strings);
        strings = addMany(strings, "How are you kids?", "They are fine", "Are you sure?", "Yes i am");
        strings = addMany(strings, "Cool");

        String[] moreStrings = {"Goodbye then", "Ok see you later"};
        strings = addMany(strings, moreStrings);



        for(String string : strings){
            System.out.println(string);
        }

    }

    public static String[] add(String string, String[] source){
        String[] newArray = Arrays.copyOf(source, source.length + 1); //Creating a copy one source.length + 1
        newArray[newArray.length - 1] = string;
        return newArray;
    }



    public static String[] addMany(String[] source, String...stringsToAdd){
        if(stringsToAdd.length == 0) return source;

        /*
            source: [Nils, Olof], stringsToAdd: [Ola, Ulrika]
         */

        String[] combined = Arrays.copyOf(source, source.length + stringsToAdd.length);

        for(int write= source.length, read = 0 ; write < combined.length ; write++, read++){
            // combined: [Nils, Olof, null, null] @Start
            combined[write] = stringsToAdd[read];
        }
        return combined;
    }

}
