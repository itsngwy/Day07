package vttp2022.day07.lambda3;

// Cat Lambda Printable

public class Lambda {

    public static void main(String[] args) {

        Cat myCat = new Cat("Sirus");

        // How we normally print using an instance
        myCat.getName();
        System.out.println(myCat.getName());

        // Another way of printing
        getCatName(myCat);
        System.out.println(getCatName(myCat));

        // Instead of putting in an object that contains the method
        // We are just sending in the method implementation of the functional interface
        String myCatName = getCatName(() -> {
            return myCat.name;
            }
        );
        System.out.println(myCatName);

        // We can save this implementation of return method as a variable
        // ***Must reference the interface name as the Type when saving the functional method as variable***
        Printable lambdaPrintable = () -> {return myCat.name;};
        System.out.println(lambdaPrintable.getName());
    }

    static String getCatName(Printable thing) {
        return thing.getName();
    }

}
