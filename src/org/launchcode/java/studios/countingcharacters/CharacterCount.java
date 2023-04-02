package org.launchcode.java.studios.countingcharacters;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterCount {
    public static void main(String[] args) {

        String quote = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";

       char[] quoteCharArray = quote.toCharArray();
       HashMap<Character, Integer> counts = new HashMap<>();
        // Loop through the string one character at a time.
           for (char letter : quoteCharArray) {
               if (counts.containsKey(letter)) {
                    counts.put(letter, counts.get(letter) + 1);
                } else {
                    counts.put(letter, 1);
              }
          }
        // Store and/or update the count for a given character using an appropriate data structure.
        //Loop through the data structure to print the results (one character and its count per line).
        for (Map.Entry<Character, Integer> count : counts.entrySet()) {
            System.out.println(count.getKey() + ": " + count.getValue());
            }

            }
        }



