package org.example;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{

    private static String[] strings = {"David", "Nils", "Johny", "Mithun", "Erik", "Oskar", "Thomas"};

    public static void main( String[] args )
    {
        Arrays.sort(strings, String.CASE_INSENSITIVE_ORDER);

        for(String string : strings){
            System.out.println(string);
        }

        System.out.println("******IndexOf******");

        int indexOfMithun = getIndexOf("David", strings);

        System.out.println(strings[indexOfMithun]);



    }

    public static int getIndexOf(String string , String[] array){
        return Arrays.binarySearch(array, string);
    }


}
