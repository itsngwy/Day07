package vttp2022.day07.day07ws;

import java.io.IOException;

public class Main {
    public static void main( String[] args ) throws IOException {

        BooksDatabase db = new BooksDatabase(args[0]);
        Session sess = new Session(db);
        sess.run();

    }
}