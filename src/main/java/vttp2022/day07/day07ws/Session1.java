package vttp2022.day07.day07ws;

import java.io.Console;
import java.util.List;

// Main1 Session1 BooksDatabase1 is my own try 

public class Session1 {
    
    BooksDatabase1 myBD;
    public static final String SEARCH = "search";
    public static final String COUNT = "count";
    public static final String EXIT = "exit";

    public Session1(BooksDatabase1 db) {
        this.myBD = db;
    }

    public void run() {
        Console cons = System.console();
        Boolean run = true;

        while(run) {
            System.out.print(">>> ");
            String myInput = cons.readLine().trim();

            String[] term = myInput.split(" ");
            String cmd = term[0].toLowerCase();

            switch (cmd) {
                case SEARCH: 
                    List<String> searchedBooks = myBD.searchBook(term[1]);
                    if (searchedBooks.size() > 1) {
                        System.out.printf("This is a list of books that contains the word \"%s\" \n", term[1]);
                        myBD.printList(searchedBooks);
                        //myBD.printList2(searchedBooks);

                        System.out.println();
                    } else if (searchedBooks.size() == 1) {
                        System.out.printf("We found the book that contains the word %s\n", term[1]);
                        myBD.printList(searchedBooks);
                        System.out.println();
                    } else {
                        System.out.printf("There are no books that you are searching for contains the word %s\n", term[0]);
                    }

                    break;
                case COUNT:
                    long noOfBooks = myBD.countBooks(term[1]);
                    System.out.printf("There are %d number of books containing the word %s\n", noOfBooks, term[1]);
                    break;
                case EXIT:
                    run = false;
            }
        }
        System.out.println("Thank you for using our service, we hope to see you again!");
    }
}
