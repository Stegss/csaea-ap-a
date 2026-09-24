public class Schools {
    
    private String name;
    private String type;
    private int students;
    private int teachers;
    private int age;
    private boolean isOpen;
    private double rating;

    public Schools(String name, String type, int teachers) {
        this.name = name;
        this.type = type;
        this.teachers = teachers;

        students = 0;
        age = 0;
        isOpen = false;
        rating = 0.0;
    }


    public void hire() {
        teachers += 1;
        System.out.println(name + " now has " + teachers + " teachers!");
    }

    public void advertise() {
        students += 10;
        System.out.println(name + " now has " + students + " students!");
    }

    public void open_end() {
        boolean bowl = isOpen;
        if(bowl) {
            isOpen = false;
            System.out.println(name + " is on break.");
        } else {
            isOpen = true;
            System.out.println(name + " break is over and the kids are back!"); }
        }

        public void birthday() {
            age += 1;
            System.out.println(name + " is now " + age + " years old.");
        }

        public void good_inspection () {
            if(rating <= 0.0) {
                rating = 5.0;
                System.out.println(name + " is now rated at " + rating + ".");
            } else {
            if(rating >= 9.0) {
             rating = 10;
             System.out.println(name + " is now rated at " + rating + ".");
            } else {
                rating += 2.5;
                System.out.println(name + " is now rated at " + rating + ".");
            } }
        }

        public void bad_inspection () {
            if(rating <= 0.0) {
                rating = 0.0;
                System.out.println(name + " is now rated at " + rating + ".");
            }
             else {
                rating -= 2.5;
                System.out.println(name + " is now rated at " + rating + ".");
            }
        }

        public void check_in() {
            System.out.println(name + " is " + age + " years old.");
            System.out.println("It has " + students + " students and " + teachers + " teachers.");
        }

        public void expel(int num) {
            if(students == 0) {
                students = 0;
                System.out.println("You can't expel any more kids!");
            } if(students > 20 || students < 60 ) {
                students -= 20;
                System.out.println("The kids revolt, and 20 leave!");
            } else {
                students -= num; }
                System.out.println(num + " children has been expeled.");
        }

        public void fire(int num) {
            teachers -= num;
            System.out.println("You fired " + num + " teachers. There are " + teachers + " left.");
        }

    } 

