package vttp2022.day07.lambda2;

// Cat Lambda Printable

public class Lambda {

    public static void main(String[] args) {

        Cat myCat = new Cat();

        // How we normally print using an instance
        myCat.print();
        
        // Another way of printing
        printThing(myCat);

        // Instead of putting in an object that contains the method
        // We are just sending in the method implementation itself
        printThing(() -> {
            System.out.println("Meow");
            }
        );

        // Since we can pass in () -> {System.out.println("Meow"); as an object
        // We can save this implementation of print method as a variable
        Printable lambdaPrintable = () -> {System.out.println("Meow");};
        printThing(lambdaPrintable);
    }

    static void printThing(Printable thing) {
        thing.print();
    }

}
