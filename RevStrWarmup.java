// aJ
// RevStrWarmUp.java
// 9/9/25
// I followed code from "Java how to reverse a string" on w3 schools.
public class RevStrWarmup {
    public static void main(String[] args) {
        // Index order H=0 e=1 l=2 l=3 o=4
        String myStr = "Hello";
        // add the reverse string
        String revStr = "";
        // the index for hello is 2 = l because that is the 3rd position in the index. (index starts at 0)
        // We use a for loop to identify the value of each index.
        for ( int i = 0; i < myStr.length(); i++) {
            // I just realized this code runs FIVE times (in the case of Hello)
            revStr = myStr.charAt(i) + revStr;
        }


        System.out.printf("Hello and welcome, check out my reverse string! " + revStr);




    }
}