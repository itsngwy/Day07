package vttp2022.day07.lambda;

import java.util.function.Function;

public class FuncMain {

    public static void main(String[] args) {
        
        // Function is a functional interface
        // Function<T,R> T=the type of input, R=the type of output
        Function<String, String> toUpper = (str) -> {
           return str.toUpperCase();
        };

        // We use apply to use the variable method
        String msg = toUpper.apply("this is a lowercase string");
        System.out.println(msg);

        // Runnable is a functional interface that thats in nothing and return nothing
        // Hence it is usually a print statement
        Runnable runMe = () -> { System.out.println("I am a lambda expression"); };
        
        // String -> Int
        Function<String, Integer> str2Int = (str) -> Integer.parseInt(str);

        // Use apply to use the variable method
        int value = str2Int.apply("1234");
        System.out.printf("str2Int(1234) = %d\n", value);
    }
    
}