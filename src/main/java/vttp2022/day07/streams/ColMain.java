package vttp2022.day07.streams;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ColMain {

    public static void main(String[] args) {

        Random rand = new SecureRandom();
        List<Integer> myList = new LinkedList<>();

        for (int i = 0; i < 10; i++)
            myList.add(rand.nextInt(100));

        System.out.println(myList);

        // This is how we usually do filter and map
        // To print out only the even values
        int result = 0;
        for (int i = 0; i < myList.size(); i++) {

            int v = myList.get(i);

            // Filter
            // If v is odd then continue
            if (0 != (v % 2))
                continue;
            // Map
            System.out.printf("for %d\n", myList.get(i) + 1);
            result = result + myList.get(i);
        }

        System.out.println("result = " + result);
        System.out.println("");

        // The general practice is to use streams as it is shorter and more efficient
        List<Integer> myList2 = Arrays.asList(13, 91, 21, 47, 31, 48, 24, 26, 7, 53);

        List<Integer> intList = myList2.stream()
            .filter(v -> 0 == (v % 2)) // when v takes in an even number, predicates will return true and the stream of values that are indeed even are passed to the next function
            .map(v -> v + 1)
            .toList(); // Saving it as a list
        System.out.println(intList);

        int sumOfMyList = myList2.stream()
            .filter(v -> 0 == (v % 2)) // stream
            .map(v -> v + 1) // stream
            .reduce(0, (accumulate, v) -> {
                //System.out.printf("x: %d, y: %d\n", x, y);
                //System.out.println(accumulate);
                return accumulate + v;
            });

        System.out.printf("sumOfMyList: %d\n", sumOfMyList);


        //.forEach(value -> {
        //    System.out.printf("forEach %d\n", value);
        //});

    }
    
}