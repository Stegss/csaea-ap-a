/*
 * PasswordTester: shows why == fails on Strings and equals works.
 * Predict each line BEFORE you run.
 *
 * Run:  javac Password.java PasswordTester.java
 *       java PasswordTester
 */

public class PasswordTester {
    
    public static void main(String[] args) {

        String a = "lion";
        String b = new String("lion");
        System.out.println(a);
        System.out.println(b);

        System.out.println(a == b); // false
        System.out.println(a.equals(b)); // true

        String cut = "dandelion".substring(5);
        System.out.println(cut == a); // false
        System.out.println(cut.equals(a));  // true

        String c = "lion";
        System.out.println(a == c); // true bc compares same object

        int x = 5;
        int y = 5;

        System.out.println(x == y); // true

        Password p = new Password("lion");
        String attempt = new String("lion");
        System.out.println(p.checkBroken(attempt)); // false
        System.out.println(p.check(attempt)); // true

        Password z = new Password("goose");
        System.out.println(p.sameAs(z));

        System.out.println(p.change("tiger", "tiger"));

        Password j = new Password("password");

        System.out.println(j.isSafe("aj"));
        System.out.println(p.isSafe("lio"));
        System.out.println(p.isSafe("abcd"));

    }

}
