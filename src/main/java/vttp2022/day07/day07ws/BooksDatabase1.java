package vttp2022.day07.day07ws;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

// Main1 Session1 BooksDatabase1 is my own try 

public class BooksDatabase1 {
    
    String fileName;
    List<String> books = new ArrayList<>();

    public BooksDatabase1(String fn) throws IOException{
        this.fileName = fn;
        FileReader is = new FileReader(fn);
        BufferedReader bis = new BufferedReader(is);
        String str = "";
        while((str = bis.readLine()) != null) {
            books.add(str);
        }
        is.close();
    }

    public List<String> searchBook(String bookName) {
        String t = bookName.toLowerCase();
        List<String> searched = books.stream()
            .filter(str -> str.toLowerCase().contains(t))
            .sorted()
            .toList();
        return searched;
    }

    public long countBooks(String bookName) {
        String t = bookName.toLowerCase();
        return books.stream()
            .filter(str -> str.toLowerCase().contains(t))
            .count();
    }

    public void printList2(List<String> myList) {
        myList.stream()
            .forEach(v -> {
                System.out.printf("%s\n", v);
            });
    }

    public void printList(List<String> myList) {
        for (int i = 0; i < myList.size(); i++) {
            System.out.printf("%d. %s\n", i+1, myList.get(i));
        }
    }
}
