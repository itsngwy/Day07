package vttp2022.day07.lambda;

import java.security.SecureRandom;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class LambdaMain {

    public static void main(String[] args) {

        ExecutorService thrPool = Executors.newFixedThreadPool(4);
        // Best way to get random numbers
        Random rand = new SecureRandom();

        for (int i = 0; i < 10; i++) {

            final int x = rand.nextInt(100);

            // The submit method takes in a Runnable
            // Runnable is a functional interface with just a method run()
            // Runnable is a functional interface that thats in nothing and return nothing
            // Hence it is usually a print statement
            thrPool.submit(
                () -> {
                    System.out.printf(">>> i = %d\n", x);
                }
            );
        }

        System.out.println("all done");
    }
}