package vttp2022.day07.day07ws;

import java.io.IOException;

// Main1 Session1 BooksDatabase1 is my own try 

public class Main1 {
    public static void main(String[] args) throws IOException{

        String fileName = args[0];
        BooksDatabase1 bd = new BooksDatabase1(fileName);
        Session1 sess = new Session1(bd);
        sess.run();
    }
}
