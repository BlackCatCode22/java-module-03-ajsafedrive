package p1;

public class App {
    public static void main(String [] args){
        System.out.println(" \n This is the App Class! \n");
        // Create the CoffeeCup object
        CoffeeCup coffeecup = new CoffeeCup();
        // use the object
        coffeecup.sizeInOz = "24";

        System.out.println(" the coffee cup object is " + coffeecup.sizeInOz);

        // create a new Keys object
        Keys myKeys = new Keys();

        // use the object
        myKeys.numOfKeys = 7;

        // out the number of keys in myKeys
        System.out.println("\n the myKeys object has " + myKeys.numOfKeys + "");

    }
}
