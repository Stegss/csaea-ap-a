    
/*
 * EmailTester: uses indexOf on Strings and Email objects.
 * Predict each line BEFORE you run.
 *
 * Run:  javac Email.java EmailTester.java
 *       java EmailTester
 */

public class EmailTester {

    public static void main(String[] args) {

        String word = "banana";
        System.out.println(word.indexOf("b"));
        System.out.println(word.indexOf("a"));
        System.out.println(word.indexOf("nan"));
        System.out.println(word.indexOf("z"));
        System.out.println(word.indexOf("B"));

        Email joseph = new Email("stegens@nhvweb.net");
        Email jojo = new Email("jojo@nhvweb.net");

        System.out.println(joseph.toString());
        
        System.out.println(joseph.getAtIndex());
        System.out.println(jojo.getAtIndex());

        System.out.println(joseph.getUser());
        System.out.println(jojo.getUser());

        System.out.println(joseph.getDomain());
        System.out.println(jojo.getDomain());

        System.out.println(jojo.getFirstName());
        System.out.println(jojo.changeDomain("Arben"));
        System.out.println(jojo.getLabel());

    }

}
