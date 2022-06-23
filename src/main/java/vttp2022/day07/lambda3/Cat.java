package vttp2022.day07.lambda3;

// Cat Lambda Printable

public class Cat implements Printable {
    
    public String name;
    public int age;

    public Cat(String name){
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

}
