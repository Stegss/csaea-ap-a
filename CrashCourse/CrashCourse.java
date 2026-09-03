public class CrashCourse{    //class header

    public static void main(String[] args){

        // comments

        /* Multiline 
        Comment
        Here
        */

        System.out.print("Hello");
        System.out.println("World");
        System.out.println("Hello World");

        // variable declarations:
        // PRIMITIVE VARIABLES
        int a; //integer
        double b; // decimal, or float
        boolean c; // true or false

        a = 4;
        b = 5.5;
        c = false; // lowercase

        // Arithmetic Operators
        // + - / * %
        // += -= /= %=

        int d = 3;
        d += 7;

        System.out.println("d = " + d);

        // increment and decrement by one:
        // -- ++
        d--;
        d++;
        d++;
        System.out.println("d is NOW equal to " + d);

        //COMPARISONS (always returns true or false)
        // < > <= >= == !=
        System.out.println(4 < 5);
        System.out.println(7 == 4);
        System.out.println(1 != 2);

        // LOGICAL OPERATORS
        // In order of presedence  NOT: !  AND: &&   OR: ||

boolean f = false; boolean t = true;

        // predict output: true or false? 
        System.out.println(!f);  //true
        System.out.println(f && t);// false
        System.out.println(f || t); //true
        System.out.println(f || t && !f); // true

        System.out.println(f && t); // short circuits to FALSE after checking f && -- java does not need to check t.
        System.out.println(t || (f && t)); //short circuits after checking the first t.

        // CASTING (converting)
        int g = (int)5.5;
        System.out.println(g);
        double h = (double)5/6;
        System.out.println(h);

        // STRINGS
        String s1 = "Goodnight";
        String s2 = " and ";
        String s3 = "Goodbye";
        String result = s1 + s2 +s3;
        result += ", Cowboy.";
        System.out.println(result + "\n");

        // Arrays
        int[] arry1 = new int[10];
        System.out.println(arry1);
        System.out.println("length: " + arry1.length);

        arry1[0] = 11;
        arry1[1] = 2;

        System.out.println("Remainder: " + arry1[0] % arry1[1]);

        int[] arry2 = {34, 52, 3, 64, 32};
        System.out.println("arry2: " + arry2);

        //2d arrays (grid or a table)

        int[][] arryGrid1 = new int[4][3]; //[rows][columns]
        // 0 0 0
        // 0 0 0
        // 0 0 0
        // 0 0 0

        System.out.println("Rows: " + arryGrid1.length);
        System.out.println("Collumns: " + arryGrid1[0].length);


    }

}